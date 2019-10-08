package com.group5.service.impl;

import com.group5.dao.AuthorityMapper;
import com.group5.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public List<String> AuthorityList(String username) {
        List<String> permissions=authorityMapper.selectByUsername(username);
        return permissions;
    }
}
