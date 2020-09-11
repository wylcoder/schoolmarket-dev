package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmUserInfo;
import com.sxdelta.schoolmarket.model.SmUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserInfoMapper {
    long countByExample(SmUserInfoExample example);

    int deleteByExample(SmUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmUserInfo record);

    int insertSelective(SmUserInfo record);

    List<SmUserInfo> selectByExample(SmUserInfoExample example);

    SmUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmUserInfo record, @Param("example") SmUserInfoExample example);

    int updateByExample(@Param("record") SmUserInfo record, @Param("example") SmUserInfoExample example);

    int updateByPrimaryKeySelective(SmUserInfo record);

    int updateByPrimaryKey(SmUserInfo record);

    SmUserInfo selectByUserId(@Param("user_id") String user_id);

    SmUserInfo selectByPhoneNum(@Param("phoneNum") String phoneNum);

    int countByUnionID(@Param("unionID") String unionID);

    int countByPhonenumber(@Param("phonenumber") String phonenumber);


}