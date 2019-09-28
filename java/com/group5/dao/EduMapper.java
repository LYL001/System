package com.group5.dao;

import com.group5.entity.Edu;
import com.group5.entity.EduExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMapper {
    long countByExample(EduExample example);

    int deleteByExample(EduExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Edu record);

    int insertSelective(Edu record);

    List<Edu> selectByExample(EduExample example);

    Edu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Edu record, @Param("example") EduExample example);

    int updateByExample(@Param("record") Edu record, @Param("example") EduExample example);

    int updateByPrimaryKeySelective(Edu record);

    int updateByPrimaryKey(Edu record);
}