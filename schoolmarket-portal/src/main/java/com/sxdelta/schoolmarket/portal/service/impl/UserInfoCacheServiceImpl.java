package com.sxdelta.schoolmarket.portal.service.impl;

import com.sxdelta.schoolmarket.mapper.SmUserInfoMapper;
import com.sxdelta.schoolmarket.model.SmUserInfo;
import com.sxdelta.schoolmarket.portal.service.UserInfoCacheService;
import com.sxdelta.schoolmarket.portal.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserInfoCacheServiceImpl implements UserInfoCacheService {

    @Autowired
    private SmUserInfoMapper smUserInfoMapper;
    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.key.member}")
    private String REDIS_KEY_MEMBER;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_AUTH_CODE;
    @Value("${redis.expire.authCode}")
    private Long REDIS_EXPIRE_AUTH_CODE;

    @Override
    public void delUserInfoCache(String userId) {
        SmUserInfo smUserInfo = smUserInfoMapper.selectByUserId(userId);
        if(smUserInfo != null){
            String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + smUserInfo.getUserId();
            redisService.del(key);
        }
    }

    @Override
    public SmUserInfo getUserInfoCache(String userId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + userId;
        return (SmUserInfo) redisService.get(key);
    }

    @Override
    public void setUserInfoCache(SmUserInfo smUserInfo) {
        String key = REDIS_DATABASE+ ":" + REDIS_KEY_MEMBER + ":" + smUserInfo.getUserId();
        redisService.set(key, smUserInfo, REDIS_EXPIRE);
    }

    @Override
    public void setAuthCode(String telephone, String authCode) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + telephone;
        redisService.set(key, authCode, REDIS_EXPIRE_AUTH_CODE);

    }

    @Override
    public String getAuthCode(String telephone) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + telephone;
        return (String) redisService.get(key);
    }
}
