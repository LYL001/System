package com.group5.dao;

import com.group5.entity.AcceptMessage;
import com.group5.entity.AcceptMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceptMessageMapper {
    long countByExample(AcceptMessageExample example);

    int deleteByExample(AcceptMessageExample example);

    int deleteByPrimaryKey(Integer acceptmId);

    int insert(AcceptMessage record);

    int insertSelective(AcceptMessage record);

    List<AcceptMessage> selectByExampleWithBLOBs(AcceptMessageExample example);

    List<AcceptMessage> selectByExample(AcceptMessageExample example);

    AcceptMessage selectByPrimaryKey(Integer acceptmId);

    int updateByExampleSelective(@Param("record") AcceptMessage record, @Param("example") AcceptMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") AcceptMessage record, @Param("example") AcceptMessageExample example);

    int updateByExample(@Param("record") AcceptMessage record, @Param("example") AcceptMessageExample example);

    int updateByPrimaryKeySelective(AcceptMessage record);

    int updateByPrimaryKeyWithBLOBs(AcceptMessage record);

    int updateByPrimaryKey(AcceptMessage record);
}