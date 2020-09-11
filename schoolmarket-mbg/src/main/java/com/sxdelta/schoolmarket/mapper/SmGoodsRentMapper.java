package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmGoodsRent;
import com.sxdelta.schoolmarket.model.SmGoodsRentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmGoodsRentMapper {
    long countByExample(SmGoodsRentExample example);

    int deleteByExample(SmGoodsRentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmGoodsRent record);

    int insertSelective(SmGoodsRent record);

    List<SmGoodsRent> selectByExample(SmGoodsRentExample example);

    SmGoodsRent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmGoodsRent record, @Param("example") SmGoodsRentExample example);

    int updateByExample(@Param("record") SmGoodsRent record, @Param("example") SmGoodsRentExample example);

    int updateByPrimaryKeySelective(SmGoodsRent record);

    int updateByPrimaryKey(SmGoodsRent record);
}