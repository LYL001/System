package com.group5.dao;

import com.group5.entity.Fan;
import com.group5.entity.FanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FanMapper {
    long countByExample(FanExample example);

    int deleteByExample(FanExample example);

    int deleteByPrimaryKey(Integer fanId);

    int insert(Fan record);

    int insertSelective(Fan record);

    List<Fan> selectByExample(FanExample example);

    Fan selectByPrimaryKey(Integer fanId);

    int updateByExampleSelective(@Param("record") Fan record, @Param("example") FanExample example);

    int updateByExample(@Param("record") Fan record, @Param("example") FanExample example);

    int updateByPrimaryKeySelective(Fan record);

    int updateByPrimaryKey(Fan record);
}