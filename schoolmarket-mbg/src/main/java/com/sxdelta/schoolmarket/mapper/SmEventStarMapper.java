package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmEventStar;
import com.sxdelta.schoolmarket.model.SmEventStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmEventStarMapper {
    long countByExample(SmEventStarExample example);

    int deleteByExample(SmEventStarExample example);

    int insert(SmEventStar record);

    int insertSelective(SmEventStar record);

    List<SmEventStar> selectByExample(SmEventStarExample example);

    int updateByExampleSelective(@Param("record") SmEventStar record, @Param("example") SmEventStarExample example);

    int updateByExample(@Param("record") SmEventStar record, @Param("example") SmEventStarExample example);
}