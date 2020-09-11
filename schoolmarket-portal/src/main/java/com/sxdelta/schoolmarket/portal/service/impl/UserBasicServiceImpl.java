package com.sxdelta.schoolmarket.portal.service.impl;

import cn.hutool.json.JSONObject;
import com.sxdelta.schoolmarket.common.exception.Asserts;
import com.sxdelta.schoolmarket.mapper.SmStudentInfoMapper;
import com.sxdelta.schoolmarket.mapper.SmUserAddressMapper;
import com.sxdelta.schoolmarket.mapper.SmUserInfoMapper;
import com.sxdelta.schoolmarket.mapper.SmUserRelationshipInfoMapper;
import com.sxdelta.schoolmarket.model.*;
import com.sxdelta.schoolmarket.portal.component.AliSendSms;
import com.sxdelta.schoolmarket.portal.dto.OssCallbackResult;
import com.sxdelta.schoolmarket.portal.service.OssService;
import com.sxdelta.schoolmarket.portal.service.UserBasicService;
import com.sxdelta.schoolmarket.portal.service.UserInfoCacheService;
//import com.sxdelta.schoolmarket.security.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserBasicServiceImpl implements UserBasicService {

    @Autowired
    UserInfoCacheService userInfoCacheService;
    @Autowired
    OssService ossService;
    @Autowired
    AliSendSms aliSendSms;

    @Autowired
    SmUserInfoMapper smUserInfoMapper;
    @Autowired
    SmStudentInfoMapper smStudentInfoMapper;
    @Autowired
    SmUserRelationshipInfoMapper smUserRelationshipInfoMapper;
    @Autowired
    SmUserAddressMapper smUserAddressMapper;


//    private JwtTokenUtil jwtTokenUtil;

    @Override
    public String loginOrRegisterByTelephone(String telephone, String authCode) {
        //验证验证码
        if(!verifyAuthCode(telephone, authCode)){
           Asserts.fail("验证码错误");
        }
        //查询用户是否存在，如果存在则执行登录逻辑
        SmUserInfo user = smUserInfoMapper.selectByPhoneNum(telephone);
        if(user != null){
            //登录
            return "登录成功";
        }else{
            //注册
            SmUserInfo newUser = new SmUserInfo();
            newUser.setUserSource(0);
            newUser.setUserId(generateUserId());
            newUser.setUserPhonenumber(telephone);
            newUser.setUsername("mob_"+newUser.getUserId());
            newUser.setUserIcon("http://congtouschoolmarket.oss-cn-beijing.aliyuncs.com/schoolmarket/userIcon/defaultIcon.jpg");
            newUser.setUserGender(0);
            newUser.setUserType(0);
            newUser.setStatus(1);
            newUser.setCreateTime(new Date());
            newUser.setUpdateTime(new Date());
            smUserInfoMapper.insert(newUser);
            return "注册成功";
        }
    }

    @Override
    public String generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0; i<6; i++){
            sb.append(random.nextInt(10));
        }
        userInfoCacheService.setAuthCode(telephone, sb.toString());
        //向阿里短信平台发送请求
        String smsResp = aliSendSms.sendSms(telephone, sb.toString());
        //转成jsonobj添加字符串
        JSONObject jsonObject = new JSONObject(smsResp);
        jsonObject.put("AuthCode", sb);
        return jsonObject.toString();
    }

    //查询此unionID是否存在
    @Override
    public int getWxUnionIDNum(String unionID) {
        return smUserInfoMapper.countByUnionID(unionID);
    }

    @Override
    public void registerByWeiXin(String unionID, String telephone, String authCode) {
        if(!verifyAuthCode(telephone, authCode)){
            Asserts.fail("验证码错误");
        }
        SmUserInfo newUser = new SmUserInfo();
        newUser.setUserSource(1);
        newUser.setUserId(generateUserId());
        newUser.setUserPhonenumber(telephone);
        newUser.setUsername("wx_"+newUser.getUserId());
        newUser.setUserIcon("http://congtouschoolmarket.oss-cn-beijing.aliyuncs.com/schoolmarket/userIcon/defaultIcon.jpg");
        newUser.setUserGender(0);
        newUser.setUserType(0);
        newUser.setStatus(1);
        newUser.setUserWxunionid(unionID);
        newUser.setCreateTime(new Date());
        newUser.setUpdateTime(new Date());
        smUserInfoMapper.insert(newUser);
    }

    @Override
    public int getPhonenumberNum(String phoneNumber) {
        return smUserInfoMapper.countByPhonenumber(phoneNumber);
    }

    @Override
    public void bindExistPhonenumber(String phonenumber, String unionID, String authCode) {
        if(!verifyAuthCode(phonenumber, authCode)){
            Asserts.fail("验证码错误");
        }
        SmUserInfoExample example = new SmUserInfoExample();
        example.createCriteria().andUserPhonenumberEqualTo(phonenumber);
        List<SmUserInfo> userInfoList = smUserInfoMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(userInfoList)){
            Asserts.fail("该账号不存在");
        }
        SmUserInfo user = userInfoList.get(0);
        user.setUserWxunionid(unionID);
        smUserInfoMapper.updateByPrimaryKeySelective(user);
        userInfoCacheService.delUserInfoCache(user.getUserId());
    }

    //完善信息（除头像）
    @Override
    public int perfectInfo(SmUserInfo user) {
        user.setUpdateTime(new Date());
        SmUserInfoExample example = new SmUserInfoExample();
        example.createCriteria().andUserIdEqualTo(user.getUserId());
        return smUserInfoMapper.updateByExampleSelective(user, example);
    }

    //上传头像
    @Override
    public int uploadIcon(String userID, int fileSource, HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        SmUserInfo smUserInfo = new SmUserInfo();
        smUserInfo.setUpdateTime(new Date());
        smUserInfo.setUserIcon(ossCallbackResult.getFilename());
        SmUserInfoExample example = new SmUserInfoExample();
        example.createCriteria().andUserIdEqualTo(userID);
        return smUserInfoMapper.updateByExample(smUserInfo, example);
    }


    @Override
    public int getUserType(String userID) {
        SmUserInfoExample example = new SmUserInfoExample();
        example.createCriteria().andUserIdEqualTo(userID);
        List<SmUserInfo> list = smUserInfoMapper.selectByExample(example);
        return list.get(0).getUserType();
    }

    @Override
    public void authStudentIdentity(SmStudentInfo smStudentInfo) {
        boolean flag = true;
        if(flag){
            smStudentInfoMapper.insert(smStudentInfo);
        }else{
            Asserts.fail("认证失败");
        }
    }

    @Override
    public SmUserInfo getUserInfo(String userID) {
        SmUserInfo smUserInfo = smUserInfoMapper.selectByUserId(userID);
        return smUserInfo;
    }

    @Override
    public SmStudentInfo getStudentInfo(String userID) {
        SmStudentInfoExample smStudentInfoExample = new SmStudentInfoExample();
        smStudentInfoExample.createCriteria().andUserIdEqualTo(userID);
        return smStudentInfoMapper.selectByExample(smStudentInfoExample).get(0);
    }

    @Override
    public SmUserRelationshipInfo getUserRelationshipInfo(String fromUserID, String toUserID) {
        SmUserRelationshipInfoExample example = new SmUserRelationshipInfoExample();
        example.createCriteria().andFromUserIdEqualTo(fromUserID).andToUserIdEqualTo(toUserID);
        return smUserRelationshipInfoMapper.selectByExample(example).get(0);
    }

    @Override
    public void focusUser(String fromUserID, String toUserID) {
        SmUserRelationshipInfo relationshipInfoATOB = getUserRelationshipInfo(fromUserID, toUserID);
        if(relationshipInfoATOB.getStatus() == 2){
            Asserts.fail(fromUserID+" 已被 "+toUserID+"拉黑");
        }
        SmUserRelationshipInfo relationshipInfoBTOA = getUserRelationshipInfo(toUserID, fromUserID);
        SmUserRelationshipInfo smUserRelationshipInfo = new SmUserRelationshipInfo();
        smUserRelationshipInfo.setFromUserId(fromUserID);
        smUserRelationshipInfo.setToUserId(toUserID);
        if(relationshipInfoBTOA != null){
            if(relationshipInfoBTOA.getStatus() == 2){
                Asserts.fail("此用户在黑名单中");
            }else if(relationshipInfoBTOA.getStatus() == 0){//已被对方关注
                smUserRelationshipInfo.setStatus(1);
                smUserRelationshipInfoMapper.insert(smUserRelationshipInfo);
            }
        }else{
            smUserRelationshipInfo.setStatus(0);
            smUserRelationshipInfoMapper.insert(smUserRelationshipInfo);
        }


    }

    @Override
    public void cancelFocusUser(String fromUserID, String toUserID) {
        SmUserRelationshipInfoExample example = new SmUserRelationshipInfoExample();
        example.createCriteria().andFromUserIdEqualTo(fromUserID).andToUserIdEqualTo(toUserID);
        smUserRelationshipInfoMapper.deleteByExample(example);
    }

    @Override
    public void addBlacklist(String fromUserID, String toUserID) {
        SmUserRelationshipInfo smUserRelationshipInfo = getUserRelationshipInfo(fromUserID, toUserID);
        if(smUserRelationshipInfo != null){
            smUserRelationshipInfo.setStatus(2);
            SmUserRelationshipInfoExample example = new SmUserRelationshipInfoExample();
            example.createCriteria().andFromUserIdEqualTo(fromUserID).andToUserIdEqualTo(toUserID);
            smUserRelationshipInfoMapper.updateByExample(smUserRelationshipInfo,example);
        }else{
            smUserRelationshipInfo.setFromUserId(fromUserID);
            smUserRelationshipInfo.setToUserId(toUserID);
            smUserRelationshipInfo.setStatus(2);
            smUserRelationshipInfoMapper.insert(smUserRelationshipInfo);
        }
    }

    @Override
    public int addMyAddress(SmUserAddress address) {
        return smUserAddressMapper.insert(address);
    }

    @Override
    public int deleteMyAddress(String addressID) {
        SmUserAddress address = getAddressByID(addressID);
        address.setStatus(1);
        SmUserAddressExample example = new SmUserAddressExample();
        example.createCriteria().andAddressIdEqualTo(addressID);
        return smUserAddressMapper.updateByExampleSelective(address, example);
    }

    @Override
    public List<SmUserAddress> getMyAddress(String userID) {
        SmUserAddressExample example = new SmUserAddressExample();
        example.createCriteria().andUserIdEqualTo(userID);
        return smUserAddressMapper.selectByExample(example);
    }

    @Override
    public SmUserAddress getAddressByID(String addressID) {
        SmUserAddressExample example = new SmUserAddressExample();
        example.createCriteria().andAddressIdEqualTo(addressID);
        return smUserAddressMapper.selectByExample(example).get(0);
    }

    @Override
    public int updateMyAddress(SmUserAddress smUserAddress) {
        SmUserAddressExample example = new SmUserAddressExample();
        example.createCriteria().andAddressIdEqualTo(smUserAddress.getAddressId());
        return smUserAddressMapper.updateByExampleSelective(smUserAddress, example);
    }

    //生成唯一UserId
    private String generateUserId(){
        return UUID.randomUUID().toString().substring(24);
    }


    //对验证码进行校验
    private  boolean verifyAuthCode(String telephone, String authCode){
        if(StringUtils.isEmpty(authCode)){
            return false;
        }
        String realAuthCode = userInfoCacheService.getAuthCode(telephone);
        return authCode.equals(realAuthCode);
    }
}
