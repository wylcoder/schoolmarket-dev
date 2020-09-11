package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.model.SmStudentInfo;
import com.sxdelta.schoolmarket.model.SmUserAddress;
import com.sxdelta.schoolmarket.model.SmUserInfo;
import com.sxdelta.schoolmarket.model.SmUserRelationshipInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户管理Service
 * Created by wuyulun on 2020/07/05
 */
public interface UserBasicService {

    /**
     * 登录注册
     * @return
     */
    String loginOrRegisterByTelephone(String telephone, String authCode);

    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone);

    /**
     * 查询微信号是否存在
     */
    int getWxUnionIDNum(String unionID);

    /**
     * 微信注册
     */
    void registerByWeiXin(String unionID, String telephone, String authCode);

    /**
     * 查询手机号是否存在
     */
    int getPhonenumberNum(String phoneNumber);

    /**
     * 绑定已存在的手机
     */
    void bindExistPhonenumber(String phonenumber, String unionID, String authCode);

    /**
     * 完善信息（头像除外）
     */
    int perfectInfo(SmUserInfo user);

    int uploadIcon(String userID, int fileSource, HttpServletRequest request);
    /**
     * 查询是否已认证了身份
     */
    int getUserType(String userID);

    /**
     * 认证学生身份
     */
    void authStudentIdentity(SmStudentInfo smStudentInfo);

    /**
     * 获取基本表所有信息
     */
    SmUserInfo getUserInfo(String userID);

    /**
     * 获取学生表基本信息
     */
    SmStudentInfo getStudentInfo(String userID);

    /**
     * 获取教师表基本信息
     */


    /**
     * 获取用户关系
     */
    SmUserRelationshipInfo getUserRelationshipInfo(String fromUserID, String toUserID);

    /**
     * 添加关注关系
     */
    void focusUser(String fromUserID, String toUserID);

    /**
     * 取消关注
     */
    void cancelFocusUser(String fromUserID, String toUserID);

    /**
     * 加入黑名单
     */
    void addBlacklist(String fromUserID, String toUserID);

    /**
     * 新增地址
     */
    int addMyAddress(SmUserAddress address);

    /**
     * 删除地址
     */
    int deleteMyAddress(String addressID);

    /**
     * 获取我的地址
     */
    List<SmUserAddress> getMyAddress(String userID);

    /**
     * 根据地址id获取地址详情
     */
    SmUserAddress getAddressByID(String addressID);

    /**
     * 修改地址内容
     */
    int updateMyAddress(SmUserAddress address);
}
