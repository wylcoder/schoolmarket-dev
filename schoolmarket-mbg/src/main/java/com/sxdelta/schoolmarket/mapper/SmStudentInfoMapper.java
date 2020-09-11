package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmStudentInfo;
import com.sxdelta.schoolmarket.model.SmStudentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmStudentInfoMapper {
    long countByExample(SmStudentInfoExample example);

    int deleteByExample(SmStudentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmStudentInfo record);

    int insertSelective(SmStudentInfo record);

    List<SmStudentInfo> selectByExample(SmStudentInfoExample example);

    SmStudentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmStudentInfo record, @Param("example") SmStudentInfoExample example);

    int updateByExample(@Param("record") SmStudentInfo record, @Param("example") SmStudentInfoExample example);

    int updateByPrimaryKeySelective(SmStudentInfo record);

    int updateByPrimaryKey(SmStudentInfo record);
}