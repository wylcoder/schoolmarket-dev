package com.sxdelta.schoolmarket.portal.dao;


import com.sxdelta.schoolmarket.model.SmGoodsSale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 买卖商品自定义Dao
 * Created by wuyulun on 2020/08/31
 */
public interface GoodsSaleDao {

    /**
     *  根据学校+所选条件展示出商品列表
     */
    List<SmGoodsSale>  getGoodsBySchoolAndCondition(@Param("school") String school, @Param("condition") String condition);
}
