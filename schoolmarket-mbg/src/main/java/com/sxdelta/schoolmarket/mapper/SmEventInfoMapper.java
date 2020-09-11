package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmEventInfo;
import com.sxdelta.schoolmarket.model.SmEventInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmEventInfoMapper {
    long countByExample(SmEventInfoExample example);

    int deleteByExample(SmEventInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmEventInfo record);

    int insertSelective(SmEventInfo record);

    List<SmEventInfo> selectByExample(SmEventInfoExample example);

    SmEventInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmEventInfo record, @Param("example") SmEventInfoExample example);

    int updateByExample(@Param("record") SmEventInfo record, @Param("example") SmEventInfoExample example);

    int updateByPrimaryKeySelective(SmEventInfo record);

    int updateByPrimaryKey(SmEventInfo record);
}