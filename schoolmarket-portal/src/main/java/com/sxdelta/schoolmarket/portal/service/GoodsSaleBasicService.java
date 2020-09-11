package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.model.SmGoodsSale;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface GoodsSaleBasicService {

    /**
     * 添加商品
     */
    int addGoodsSale(SmGoodsSale smGoodsSale);

    /**
     * 上下架商品
     */
    int updateShelveStatus(List<String> goodsIDs, Integer shelveStatus);

    /**
     * 删除商品
     */
    int deleteGoodsSale(List<String> goodsIDs);

    /**
     * 更新商品
     */
    int updateGoodsSale(String goodsID, SmGoodsSale smGoodsSale);

    /**
     * 查询商品
     */
    SmGoodsSale getSmGoodsSaleInfo(String goodsID);

    /**
     * 根据条件查询商品列表
     */
    List<SmGoodsSale> getGoodsListBySchoolAndConditions(String school, String condition, Integer pageNum, Integer pageSize);
}
