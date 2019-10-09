package com.group5.task;

import com.group5.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AgeTask {

    @Autowired
    UserInfoService userInfoService;
    @Scheduled(cron = "0 0 0 * * ?")
    public void ageAdd(){

        userInfoService.updateEveryOneAge();

    }
}
