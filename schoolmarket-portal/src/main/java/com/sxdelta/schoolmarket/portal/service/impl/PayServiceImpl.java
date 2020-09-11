package com.sxdelta.schoolmarket.portal.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.sxdelta.schoolmarket.portal.dto.GoodsSaleOrderParam;
import com.sxdelta.schoolmarket.portal.service.PayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class PayServiceImpl implements PayService {

//    @Value("${alipay.aliPayGateway}")
//    private String ALIPAY_GATEWAY;
    @Value("${alipay.aliPayAppId}")
    private String ALIPAY_APPID;
    @Value("${alipay.rsaPublicKey}")
    private String ALIPAY_RSA_PUBLIC_KEY;
    @Value("${alipay.rsaPrivatKey}")
    private String ALIPAY_RSA_PRIVATE_KEY;
    @Value("${alipay.rsaAlipayPublicKey}")
    private String ALIPAY_RSA_ALIPAY_PUBLIC_KEY;
    @Value("${alipay.signType}")
    private String ALIPAY_SIGNTYPE;
    @Value("${alipay.alipayFormat}")
    private String ALIPAY_FORMAT;
    @Value("${alipay.alipayCharset}")
    private String ALIPAY_CHARSET;
    @Override
    public String alipay(GoodsSaleOrderParam input, HttpServletResponse response, HttpServletRequest request) {
        response.setHeader("Access-Control-Allow-Origin", "*");

        // 获取项目中实际的订单的信息
        String orderID = input.getGoodsId()+input.getUserId();
        // 此处是相关业务代码


        // 获取配置文件中支付宝相关信息(可以使用自己的方式获取)
        //String aliPayGateway = ALIPAY_GATEWAY;
        String aliPayAppId = ALIPAY_APPID;
        String rsaPublicKey = ALIPAY_RSA_PUBLIC_KEY;
        String rsaPrivatKey = ALIPAY_RSA_PRIVATE_KEY;
        String rsaAlipayPublicKey = ALIPAY_RSA_ALIPAY_PUBLIC_KEY;
        String signType = ALIPAY_SIGNTYPE;
        String alipayFormat = ALIPAY_FORMAT;
        String alipayCharset = ALIPAY_CHARSET;

        // 开始使用支付宝SDK中提供的API
        AlipayClient alipayClient = new DefaultAlipayClient("", aliPayAppId, rsaPrivatKey, alipayFormat, alipayCharset, rsaAlipayPublicKey, signType);
        // 注意：不同接口这里的请求对象是不同的，这个可以查看蚂蚁金服开放平台的API文档查看
        AlipayTradeAppPayRequest alipayRequest = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("交易");
        model.setSubject("OniOn");
        // 唯一订单号 根据项目中实际需要获取相应的
        model.setOutTradeNo("orderID");
        // 支付超时时间（根据项目需要填写）
        model.setTimeoutExpress("30m");
        // 支付金额（项目中实际订单的需要支付的金额，金额的获取与操作请放在服务端完成，相对安全）
        model.setTotalAmount("");
        model.setProductCode("QUICK_MSECURITY_PAY");
        alipayRequest.setBizModel(model);
        // 支付成功后支付宝异步通知的接收地址url
        alipayRequest.setNotifyUrl("pay/getAlipayNotifyInfo");

        // 注意：每个请求的相应对象不同，与请求对象是对应。
        AlipayTradeAppPayResponse alipayResponse = null;
        try {
            alipayResponse = alipayClient.sdkExecute(alipayRequest);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        // 返回支付相关信息(此处可以直接将getBody中的内容直接返回，无需再做一些其他操作)
        return alipayResponse.getBody();
    }

    @Override
    public String getAlipayNotifyInfoOfCombinedPayment(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setHeader("Access-Control-Allow-Origin", "*");

        // 解决POST请求中文乱码问题（推荐使用此种方式解决中文乱码，因为是支付宝发送异步通知使用的是POST请求）
        request.setCharacterEncoding("UTF-8");

        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }

            // 官方demo中使用如下方式解决中文乱码，在此本人不推荐使用，可能会出现中文乱码解决无效的问题。
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "UTF-8");

            params.put(name, valueStr);
        }

        // 支付宝公钥（请注意，不是商户公钥）
        String rsaAlipayPublicKey = ALIPAY_RSA_ALIPAY_PUBLIC_KEY;
        String signType = ALIPAY_SIGNTYPE;
        String alipayCharset = ALIPAY_CHARSET;

        boolean signVerified = false;
        try {
            //调用SDK验证签名
            signVerified = AlipaySignature.rsaCheckV1(params, rsaAlipayPublicKey, alipayCharset, signType);
            if(signVerified) {
                // 验证通知后执行自己项目需要的业务操作
                // 一般需要判断支付状态是否为TRADE_SUCCESS
                // 更严谨一些还可以判断 1.appid 2.sellerId 3.out_trade_no 4.total_amount 等是否正确，正确之后再进行相关业务操作。


                // 成功要返回success，不然支付宝会不断发送通知。
                return "success";
            }

            // 验签失败  笔者在这里是输出log，可以根据需要做一些其他操作

            // 失败要返回fail，不然支付宝会不断发送通知。
            return "fail";
        } catch (AlipayApiException e) {
            e.printStackTrace();
            // 验签异常  笔者在这里是输出log，可以根据需要做一些其他操作

            return "fail";
        }
    }
}
