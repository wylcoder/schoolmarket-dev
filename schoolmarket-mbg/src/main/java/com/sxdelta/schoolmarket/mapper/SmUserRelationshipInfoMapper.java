package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmUserRelationshipInfo;
import com.sxdelta.schoolmarket.model.SmUserRelationshipInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserRelationshipInfoMapper {
    long countByExample(SmUserRelationshipInfoExample example);

    int deleteByExample(SmUserRelationshipInfoExample example);

    int insert(SmUserRelationshipInfo record);

    int insertSelective(SmUserRelationshipInfo record);

    List<SmUserRelationshipInfo> selectByExample(SmUserRelationshipInfoExample example);

    int updateByExampleSelective(@Param("record") SmUserRelationshipInfo record, @Param("example") SmUserRelationshipInfoExample example);

    int updateByExample(@Param("record") SmUserRelationshipInfo record, @Param("example") SmUserRelationshipInfoExample example);
}