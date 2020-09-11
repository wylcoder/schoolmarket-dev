package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmSaleOrders implements Serializable {
    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String buyerId;

    /**
     * 卖家ID
     *
     * @mbg.generated
     */
    private String salerId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     * 被交易的物品id
     *
     * @mbg.generated
     */
    private String goodId;

    /**
     * 买家地址id
     *
     * @mbg.generated
     */
    private String buyerAddressId;

    /**
     * 卖家地址id
     *
     * @mbg.generated
     */
    private String salerAddressId;

    /**
     * 订单总金额
     *
     * @mbg.generated
     */
    private BigDecimal totalAmount;

    /**
     * 物品价格
     *
     * @mbg.generated
     */
    private BigDecimal goodAmount;

    /**
     * 运费金额
     *
     * @mbg.generated
     */
    private BigDecimal freightAmount;

    /**
     * 订单备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 配送方式 0->见面交易，1->校园跑腿，2->校园无人车
     *
     * @mbg.generated
     */
    private Integer deliveryType;

    /**
     * 支付方式 0->线下交易，1->支付宝支付
     *
     * @mbg.generated
     */
    private Integer payType;

    /**
     * 订单状态：0->待付款，1->待完成， 2->已完成，3->退货中，4->已退货
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 删除状态：0->未删除；1->已删除
     *
     * @mbg.generated
     */
    private Integer deleteStatus;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     * 完成时间
     *
     * @mbg.generated
     */
    private Date finishTime;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getSalerId() {
        return salerId;
    }

    public void setSalerId(String salerId) {
        this.salerId = salerId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getBuyerAddressId() {
        return buyerAddressId;
    }

    public void setBuyerAddressId(String buyerAddressId) {
        this.buyerAddressId = buyerAddressId;
    }

    public String getSalerAddressId() {
        return salerAddressId;
    }

    public void setSalerAddressId(String salerAddressId) {
        this.salerAddressId = salerAddressId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getGoodAmount() {
        return goodAmount;
    }

    public void setGoodAmount(BigDecimal goodAmount) {
        this.goodAmount = goodAmount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", salerId=").append(salerId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", goodId=").append(goodId);
        sb.append(", buyerAddressId=").append(buyerAddressId);
        sb.append(", salerAddressId=").append(salerAddressId);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", goodAmount=").append(goodAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", note=").append(note);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", payType=").append(payType);
        sb.append(", status=").append(status);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}