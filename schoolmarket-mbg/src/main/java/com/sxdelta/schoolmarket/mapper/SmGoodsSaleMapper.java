package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmGoodsSale;
import com.sxdelta.schoolmarket.model.SmGoodsSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmGoodsSaleMapper {
    long countByExample(SmGoodsSaleExample example);

    int deleteByExample(SmGoodsSaleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmGoodsSale record);

    int insertSelective(SmGoodsSale record);

    List<SmGoodsSale> selectByExample(SmGoodsSaleExample example);

    SmGoodsSale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmGoodsSale record, @Param("example") SmGoodsSaleExample example);

    int updateByExample(@Param("record") SmGoodsSale record, @Param("example") SmGoodsSaleExample example);

    int updateByPrimaryKeySelective(SmGoodsSale record);

    int updateByPrimaryKey(SmGoodsSale record);
}