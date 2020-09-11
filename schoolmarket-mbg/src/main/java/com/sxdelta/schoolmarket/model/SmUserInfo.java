package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.util.Date;

public class SmUserInfo implements Serializable {
    private Long id;

    /**
     * 0->手机号， 1->微信
     *
     * @mbg.generated
     */
    private Integer userSource;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 用户手机号
     *
     * @mbg.generated
     */
    private String userPhonenumber;

    /**
     * 微信客户端唯一表示
     *
     * @mbg.generated
     */
    private String userWxunionid;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String userIcon;

    /**
     * 个性签名
     *
     * @mbg.generated
     */
    private String userSignature;

    /**
     * 性别：0->未知；1->男；2->女
     *
     * @mbg.generated
     */
    private Integer userGender;

    /**
     * 生日
     *
     * @mbg.generated
     */
    private Date userBirthday;

    /**
     * 0->游客；1->学生；2->老师；3->双非
     *
     * @mbg.generated
     */
    private Integer userType;

    /**
     * 帐号启用状态:0->禁用；1->启用
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserSource() {
        return userSource;
    }

    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    public String getUserWxunionid() {
        return userWxunionid;
    }

    public void setUserWxunionid(String userWxunionid) {
        this.userWxunionid = userWxunionid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userSource=").append(userSource);
        sb.append(", userId=").append(userId);
        sb.append(", userPhonenumber=").append(userPhonenumber);
        sb.append(", userWxunionid=").append(userWxunionid);
        sb.append(", username=").append(username);
        sb.append(", userIcon=").append(userIcon);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", userGender=").append(userGender);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userType=").append(userType);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}