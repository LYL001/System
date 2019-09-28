package com.group5.service;

import com.group5.entity.China;

import java.util.List;

public interface CityListService {
     List<China> provincesList();
     List<China> citiesList(String province);
}
