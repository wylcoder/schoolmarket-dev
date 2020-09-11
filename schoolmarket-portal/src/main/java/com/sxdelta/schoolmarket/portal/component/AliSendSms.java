package com.sxdelta.schoolmarket.portal.component;

import cn.hutool.json.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.sxdelta.schoolmarket.portal.config.AliMessageConfig;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AliSendSms {

    public String sendSms(String telephone, String authCode){
        String resData = "";
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", AliMessageConfig.accessKeyId, AliMessageConfig.accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        String jsonAuthCode = "{code:"+authCode+"}";
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", telephone);
        request.putQueryParameter("SignName", "云校园");
        request.putQueryParameter("TemplateCode", "SMS_195221179");
        request.putQueryParameter("TemplateParam", jsonAuthCode);
        try {
            CommonResponse response = client.getCommonResponse(request);
            resData = response.getData();
        } catch (ServerException e) {
            e.printStackTrace();
            resData = e.toString();
        } catch (ClientException e) {
            e.printStackTrace();
            resData = e.toString();
        }
        return resData;
    }
}
