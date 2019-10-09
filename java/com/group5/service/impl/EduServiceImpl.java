package com.group5.service.impl;

import com.group5.dao.EduMapper;
import com.group5.entity.Edu;
import com.group5.entity.EduExample;
import com.group5.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduServiceImpl implements EduService {
    @Autowired
    private EduMapper eduMapper;
    @Override
    public Edu getEdu(Integer id) {

        Edu edu=new Edu();
        edu=eduMapper.selectByPrimaryKey(id);
        return edu;
    }

    @Override
    public Edu getEduByName(String name) {
        EduExample eduExample=new EduExample();
        EduExample.Criteria criteria=eduExample.createCriteria();
        criteria.andQualificationEqualTo(name);
        List<Edu> list=eduMapper.selectByExample(eduExample);
        return list.get(0);
    }
}
