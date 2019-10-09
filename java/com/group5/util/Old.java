package com.group5.util;

import java.util.Calendar;
import java.util.Date;

public class Old {
    public  static Integer getYearsOld(String birthday) {
        String str[] = birthday.trim().split("-");
        int year = Integer.parseInt(str[0]);

        int month = Integer.parseInt(str[1]);

        int date = Integer.parseInt(str[2]);
        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH) + 1;
        int dateNow = calendar.get(Calendar.DATE);
        Integer age = yearNow-year;
        if(monthNow<=month){
            if(monthNow==month){
                if(dateNow<date){
                    age--;
                }
            }
            else{
                age--;
            }
        }
        return age;
    }

        /*int year_i=Integer.parseInt(year);
        int month_i=Integer.parseInt(month);
        int date_i=Integer.parseInt(date);*/
}
