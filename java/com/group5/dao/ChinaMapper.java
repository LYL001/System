package com.group5.dao;

import com.group5.entity.China;
import com.group5.entity.ChinaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChinaMapper {


    List<China> selectByProvince(String Name);

    List<China> selectProvince();
}