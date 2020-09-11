package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmUserAddress;
import com.sxdelta.schoolmarket.model.SmUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserAddressMapper {
    long countByExample(SmUserAddressExample example);

    int deleteByExample(SmUserAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmUserAddress record);

    int insertSelective(SmUserAddress record);

    List<SmUserAddress> selectByExample(SmUserAddressExample example);

    SmUserAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmUserAddress record, @Param("example") SmUserAddressExample example);

    int updateByExample(@Param("record") SmUserAddress record, @Param("example") SmUserAddressExample example);

    int updateByPrimaryKeySelective(SmUserAddress record);

    int updateByPrimaryKey(SmUserAddress record);
}