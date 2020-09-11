package com.sxdelta.schoolmarket.portal.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sxdelta.schoolmarket.common.api.CommonResult;
import com.sxdelta.schoolmarket.model.SmStudentInfo;
import com.sxdelta.schoolmarket.model.SmUserAddress;
import com.sxdelta.schoolmarket.model.SmUserInfo;
import com.sxdelta.schoolmarket.portal.service.UserBasicService;
import io.swagger.annotations.ApiOperation;
import org.jacoco.agent.rt.internal_43f5073.core.analysis.ICounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户登录注册Controller
 * Created by wuyulun on 2020/07/04
 */
@RestController
@RequestMapping("/sso")
public class UserBasicController {

    @Autowired
    private UserBasicService userBasicService;

    @ApiOperation("用户登录注册")
    @RequestMapping(value = "/loginOrRegisterByTelephone", method = RequestMethod.POST)
    public CommonResult loginOrRegisterByTelephone(@RequestParam String telephone,
                                                   @RequestParam String authCode){

        String resp = userBasicService.loginOrRegisterByTelephone(telephone, authCode);
        return CommonResult.success(resp,"success");
    }
    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    public CommonResult getAuthCode(@RequestParam String telephone){
        String result = userBasicService.generateAuthCode(telephone);
        return CommonResult.success(result);
    }

    @ApiOperation("微信登录")
    @RequestMapping(value = "/loginByWeiXin", method = RequestMethod.POST)
    public CommonResult loginByWeiXin(@RequestParam String unionID){
        int isExistUnionID = userBasicService.getWxUnionIDNum(unionID);
        return CommonResult.success(isExistUnionID, "调用成功");
    }

    @ApiOperation("自动检查是否存在手机账号")
    @RequestMapping(value = "/isPhoneNumberExist", method = RequestMethod.POST)
    public CommonResult isPhoneNumberExist(@RequestParam String telephone){
        int isPhoneNumberExist = userBasicService.getPhonenumberNum(telephone);
        return CommonResult.success(isPhoneNumberExist, "调用成功");
    }

    @ApiOperation("手机号存在，将此微信绑定到已存在的手机号上")
    @RequestMapping(value = "/bindToPhonenumber", method = RequestMethod.POST)
    public CommonResult bindToPhonenumber(@RequestParam String telephone,
                                          @RequestParam String unionID,
                                          @RequestParam String authCode){
        userBasicService.bindExistPhonenumber(telephone, unionID, authCode);
        return CommonResult.success(null, "绑定成功");

    }
    @ApiOperation("微信注册")
    @RequestMapping(value = "/registerByWeiXin", method = RequestMethod.POST)
    public CommonResult registerByWeiXin(@RequestParam String unionID,
                                         @RequestParam String telephone,
                                         @RequestParam String authCode){

        userBasicService.registerByWeiXin(unionID, telephone, authCode);
        return CommonResult.success(null, "登录成功");
    }

    @ApiOperation("完善资料")
    @RequestMapping(value = "/perfectInfo", method = RequestMethod.POST)
    public CommonResult perfectInfo(@RequestBody SmUserInfo user){
        Integer result = userBasicService.perfectInfo(user);
        return CommonResult.success(result, "登录信息");
    }

    //调用此接口前，先调用ossController.policy进行策略验证
    @ApiOperation("上传头像")
    @RequestMapping(value = "/uploadIcon", method = RequestMethod.POST)
    public CommonResult uploadIcon(@RequestParam String userID,
                                   @RequestParam int fileSource,
                                   HttpServletRequest request){
        Integer result = userBasicService.uploadIcon(userID, fileSource, request);
        return CommonResult.success(result);
    }

    @ApiOperation("查看是否已认证了身份")
    @RequestMapping(value = "/isAuthIdentity", method = RequestMethod.POST)
    public CommonResult isAuthIdentity(@RequestParam String userID){
        Integer userType = userBasicService.getUserType(userID);
        return CommonResult.success(userType, "用户类型");
    }

    @ApiOperation("认证學生身份")
    @RequestMapping(value = "/authStudentIdentity", method = RequestMethod.POST)
    public CommonResult authIdentity(@RequestBody SmStudentInfo smStudentInfo){
        userBasicService.authStudentIdentity(smStudentInfo);
        return CommonResult.success(null,"调用成功");
    }

    @ApiOperation("获取教师表或学生表信息")
    @RequestMapping(value = "/getDetailInfo")
    public CommonResult getDetailInfo(@RequestParam String userID){
        SmUserInfo smUserInfo = userBasicService.getUserInfo(userID);
        if(smUserInfo == null){
            return CommonResult.failed("无此用户");
        }
        Integer userType = smUserInfo.getUserType();
        if(userType == 1){
            return CommonResult.success(userBasicService.getStudentInfo(userID), "学生基本信息");
        } else if (userType == 2){
            return null;
        } else{
            return CommonResult.success(smUserInfo, "游客用户基本信息");
        }
    }

    @ApiOperation("关注用户")
    @RequestMapping(value = "/focusUser")
    public CommonResult focusUser(@RequestParam String fromUser,
                                  @RequestParam String toUser){
        userBasicService.focusUser(fromUser, toUser);
        return CommonResult.success(null, "调用成功");
    }

    @ApiOperation("取消关注同移出黑名单")
    @RequestMapping(value = "/cancelFocusUser")
    public CommonResult cancelFocusUser(@RequestParam String fromUser,
                                        @RequestParam String toUser){
        userBasicService.cancelFocusUser(fromUser, toUser);
        return CommonResult.success(null, "调用成功");
    }

    @ApiOperation("加入黑名单")
    @RequestMapping(value = "/addBlacklist")
    public CommonResult addBlacklist(@RequestParam String fromUser,
                                     @RequestParam String toUser){
        userBasicService.addBlacklist(fromUser, toUser);
        return CommonResult.success(null, "调用成功");
    }

    @ApiOperation("添加地址")
    @RequestMapping(value = "/addMyAddress")
    public CommonResult addMyAddress(@RequestBody SmUserAddress address){
        int flag = userBasicService.addMyAddress(address);
        if(flag > 0){
            return CommonResult.success(flag);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除地址")
    @RequestMapping(value = "/deleteMyAddress")
    public CommonResult deleteMyAddress(@RequestBody String addressID){
        int flag = userBasicService.deleteMyAddress(addressID);
        if(flag > 0){
            return CommonResult.success(flag);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("查看我的地址")
    @RequestMapping(value = "/getMyAddress")
    public CommonResult getMyAddress(@RequestParam String userID){
        List<SmUserAddress> list = userBasicService.getMyAddress(userID);
        return CommonResult.success(list);
    }

    @ApiOperation("修改我的地址")
    @RequestMapping(value = "/updateMyAddress")
    public CommonResult updateMyAddress(@RequestBody SmUserAddress oldAddress){
        int flag = userBasicService.updateMyAddress(oldAddress);
        if(flag > 0){
            return CommonResult.success(flag);
        }else{
            return CommonResult.failed();
        }
    }
}
