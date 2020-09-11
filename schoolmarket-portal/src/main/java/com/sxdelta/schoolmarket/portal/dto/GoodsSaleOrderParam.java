package com.sxdelta.schoolmarket.portal.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsSaleOrderParam {
    private String goodsId;

    private String userId;

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
}
