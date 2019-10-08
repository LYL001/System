package com.group5.dao;

import com.group5.entity.VipTimelist;
import com.group5.entity.VipTimelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipTimelistMapper {
    long countByExample(VipTimelistExample example);

    int deleteByExample(VipTimelistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VipTimelist record);

    int insertSelective(VipTimelist record);

    List<VipTimelist> selectByExample(VipTimelistExample example);

    VipTimelist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VipTimelist record, @Param("example") VipTimelistExample example);

    int updateByExample(@Param("record") VipTimelist record, @Param("example") VipTimelistExample example);

    int updateByPrimaryKeySelective(VipTimelist record);

    int updateByPrimaryKey(VipTimelist record);
}