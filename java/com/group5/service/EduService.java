package com.group5.service;

import com.group5.entity.Edu;

public interface EduService {
    Edu getEdu(Integer id);
    Edu getEduByName(String name);
}
