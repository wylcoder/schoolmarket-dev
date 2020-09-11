package com.sxdelta.schoolmarket.portal.controller;

import com.sxdelta.schoolmarket.common.api.CommonResult;
import com.sxdelta.schoolmarket.portal.dto.GoodsSaleOrderParam;
import com.sxdelta.schoolmarket.portal.service.PayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * 支付控制类
 */
@RestController
@RequestMapping("pay")
public class PayController {

    @Autowired
    PayService payService;

    @ApiOperation("app支付")
    @RequestMapping(value = "alipay", method = RequestMethod.POST)
    public CommonResult alipay(@RequestBody GoodsSaleOrderParam input, HttpServletResponse response, HttpServletRequest request) {
        String result = payService.alipay(input, response, request);
        return CommonResult.success(result);
    }

    @RequestMapping(value = "getAlipayNotifyInfo", method = RequestMethod.POST)
    public String getAlipayNotifyInfoOfCombinedPayment(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        String result = payService.getAlipayNotifyInfoOfCombinedPayment(request, response);
        return result;
    }
}
