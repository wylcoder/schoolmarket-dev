package com.sxdelta.schoolmarket.mapper;

import com.sxdelta.schoolmarket.model.SmEventComment;
import com.sxdelta.schoolmarket.model.SmEventCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmEventCommentMapper {
    long countByExample(SmEventCommentExample example);

    int deleteByExample(SmEventCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmEventComment record);

    int insertSelective(SmEventComment record);

    List<SmEventComment> selectByExample(SmEventCommentExample example);

    SmEventComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmEventComment record, @Param("example") SmEventCommentExample example);

    int updateByExample(@Param("record") SmEventComment record, @Param("example") SmEventCommentExample example);

    int updateByPrimaryKeySelective(SmEventComment record);

    int updateByPrimaryKey(SmEventComment record);
}