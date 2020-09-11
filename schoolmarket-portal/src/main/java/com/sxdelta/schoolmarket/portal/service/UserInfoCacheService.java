package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.model.SmUserInfo;

/**
 * 用户信息缓存业务类
 * Created by wuyulun on 2020/07/05
 */
public interface UserInfoCacheService {

    /**
     * 删除用户缓存
     */
    void delUserInfoCache(String userId);

    /**
     * 获取用户缓存
     */
    SmUserInfo getUserInfoCache(String useId);

    /**
     * 设置用户缓存
     */
    void setUserInfoCache(SmUserInfo smUserInfo);

    /**
     *设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);

}
