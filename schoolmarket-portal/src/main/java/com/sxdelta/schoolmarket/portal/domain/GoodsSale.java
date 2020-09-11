package com.sxdelta.schoolmarket.portal.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsSale implements Serializable {
    private Long id;

    private String goodsId;

    private String userId;

    /**
     * 物品图片地址
     *
     * @mbg.generated
     */
    private String picture;

    /**
     * 物品所在地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 物品价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 1自由配送
     *
     * @mbg.generated
     */
    private Integer deliveryType;

    /**
     * 1.线上 2.线下
     *
     * @mbg.generated
     */
    private Integer payType;

    /**
     * 新旧程度
     *
     * @mbg.generated
     */
    private Integer oldDegree;

    /**
     * 种类
     *
     * @mbg.generated
     */
    private String category;

    /**
     * 0.上线 1.下架 
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 入手价格
     *
     * @mbg.generated
     */
    private BigDecimal firstPrice;

    /**
     * 入手时间
     *
     * @mbg.generated
     */
    private Date firstDate;

    /**
     * 评论数
     *
     * @mbg.generated
     */
    private Integer commentNum;

    /**
     * 收藏数
     *
     * @mbg.generated
     */
    private Integer collectNum;

    /**
     * 点赞数
     *
     * @mbg.generated
     */
    private Integer starNum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOldDegree() {
        return oldDegree;
    }

    public void setOldDegree(Integer oldDegree) {
        this.oldDegree = oldDegree;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Integer getStarNum() {
        return starNum;
    }

    public void setStarNum(Integer starNum) {
        this.starNum = starNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", userId=").append(userId);
        sb.append(", picture=").append(picture);
        sb.append(", address=").append(address);
        sb.append(", price=").append(price);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", payType=").append(payType);
        sb.append(", oldDegree=").append(oldDegree);
        sb.append(", category=").append(category);
        sb.append(", status=").append(status);
        sb.append(", firstPrice=").append(firstPrice);
        sb.append(", firstDate=").append(firstDate);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", collectNum=").append(collectNum);
        sb.append(", starNum=").append(starNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}