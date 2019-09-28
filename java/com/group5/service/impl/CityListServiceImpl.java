package com.group5.service.impl;

import com.group5.dao.ChinaMapper;
import com.group5.entity.China;
import com.group5.service.CityListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityListServiceImpl implements CityListService {
    @Autowired
    private ChinaMapper chinaMapper;


    @Override
    public List<China> provincesList() {
        List<China> list=new ArrayList<China>();
        list=chinaMapper.selectProvince();
        return list;
    }

    @Override
    public List<China> citiesList(String province) {
        List<China> list;
        list=chinaMapper.selectByProvince(province);
        return list ;
    }
}
