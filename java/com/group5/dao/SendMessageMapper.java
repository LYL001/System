package com.group5.dao;

import com.group5.entity.SendMessage;
import com.group5.entity.SendMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMessageMapper {
    long countByExample(SendMessageExample example);

    int deleteByExample(SendMessageExample example);

    int deleteByPrimaryKey(Integer sendmId);

    int insert(SendMessage record);

    int insertSelective(SendMessage record);

    List<SendMessage> selectByExampleWithBLOBs(SendMessageExample example);

    List<SendMessage> selectByExample(SendMessageExample example);

    SendMessage selectByPrimaryKey(Integer sendmId);

    int updateByExampleSelective(@Param("record") SendMessage record, @Param("example") SendMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") SendMessage record, @Param("example") SendMessageExample example);

    int updateByExample(@Param("record") SendMessage record, @Param("example") SendMessageExample example);

    int updateByPrimaryKeySelective(SendMessage record);

    int updateByPrimaryKeyWithBLOBs(SendMessage record);

    int updateByPrimaryKey(SendMessage record);
}