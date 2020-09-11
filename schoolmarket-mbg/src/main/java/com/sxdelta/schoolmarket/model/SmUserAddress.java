package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmUserAddress implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 地址id
     *
     * @mbg.generated
     */
    private String addressId;

    /**
     * 地址人名称
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 经度
     *
     * @mbg.generated
     */
    private BigDecimal addressPositionLongitude;

    /**
     * 纬度
     *
     * @mbg.generated
     */
    private BigDecimal addressPositionLatitude;

    /**
     * 可通过经纬度定位到的位置
     *
     * @mbg.generated
     */
    private String addressContent;

    /**
     * 用户手输地址，例如几层，几号宿舍
     *
     * @mbg.generated
     */
    private String addressDetail;

    /**
     * 此地址手机号
     *
     * @mbg.generated
     */
    private String phonenumber;

    /**
     * 0->正常；1->删除
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getAddressPositionLongitude() {
        return addressPositionLongitude;
    }

    public void setAddressPositionLongitude(BigDecimal addressPositionLongitude) {
        this.addressPositionLongitude = addressPositionLongitude;
    }

    public BigDecimal getAddressPositionLatitude() {
        return addressPositionLatitude;
    }

    public void setAddressPositionLatitude(BigDecimal addressPositionLatitude) {
        this.addressPositionLatitude = addressPositionLatitude;
    }

    public String getAddressContent() {
        return addressContent;
    }

    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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
        sb.append(", userId=").append(userId);
        sb.append(", addressId=").append(addressId);
        sb.append(", userName=").append(userName);
        sb.append(", addressPositionLongitude=").append(addressPositionLongitude);
        sb.append(", addressPositionLatitude=").append(addressPositionLatitude);
        sb.append(", addressContent=").append(addressContent);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}