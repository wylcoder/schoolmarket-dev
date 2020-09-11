package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmSaleOrders;
import com.sxdelta.schoolmarket.model.SmSaleOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmSaleOrdersMapper {
    long countByExample(SmSaleOrdersExample example);

    int deleteByExample(SmSaleOrdersExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(SmSaleOrders record);

    int insertSelective(SmSaleOrders record);

    List<SmSaleOrders> selectByExample(SmSaleOrdersExample example);

    SmSaleOrders selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") SmSaleOrders record, @Param("example") SmSaleOrdersExample example);

    int updateByExample(@Param("record") SmSaleOrders record, @Param("example") SmSaleOrdersExample example);

    int updateByPrimaryKeySelective(SmSaleOrders record);

    int updateByPrimaryKey(SmSaleOrders record);
}