package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmEventCollect;
import com.sxdelta.schoolmarket.model.SmEventCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmEventCollectMapper {
    long countByExample(SmEventCollectExample example);

    int deleteByExample(SmEventCollectExample example);

    int insert(SmEventCollect record);

    int insertSelective(SmEventCollect record);

    List<SmEventCollect> selectByExample(SmEventCollectExample example);

    int updateByExampleSelective(@Param("record") SmEventCollect record, @Param("example") SmEventCollectExample example);

    int updateByExample(@Param("record") SmEventCollect record, @Param("example") SmEventCollectExample example);
}