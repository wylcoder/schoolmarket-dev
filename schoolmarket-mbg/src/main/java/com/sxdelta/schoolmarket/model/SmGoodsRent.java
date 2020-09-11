package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmGoodsRent implements Serializable {
    private Long id;

    private String goodsId;

    /**
     * 商品描述
     *
     * @mbg.generated
     */
    private String description;

    private String userId;

    /**
     * 物品图片url
     *
     * @mbg.generated
     */
    private String picture;

    /**
     * 物品地址
     *
     * @mbg.generated
     */
    private String addressId;

    /**
     * 物品所在学校
     *
     * @mbg.generated
     */
    private String addressSchool;

    /**
     * 物品价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 周期 0->小时，1->天，2->星期， 3->月
     *
     * @mbg.generated
     */
    private Integer period;

    /**
     * 0->无限期
     *
     * @mbg.generated
     */
    private Integer maxTime;

    /**
     * NULL->不设限
     *
     * @mbg.generated
     */
    private Date lastDate;

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
     * 0.上线 1.下架 2.在租赁中
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressSchool() {
        return addressSchool;
    }

    public void setAddressSchool(String addressSchool) {
        this.addressSchool = addressSchool;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
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
        sb.append(", description=").append(description);
        sb.append(", userId=").append(userId);
        sb.append(", picture=").append(picture);
        sb.append(", addressId=").append(addressId);
        sb.append(", addressSchool=").append(addressSchool);
        sb.append(", price=").append(price);
        sb.append(", period=").append(period);
        sb.append(", maxTime=").append(maxTime);
        sb.append(", lastDate=").append(lastDate);
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