package com.group5.util;

import java.util.Calendar;
import java.util.Date;

public class Old {
    public  static Integer getYearsOld(String birthday) {
        String str1[] = birthday.trim().split("年");
        int year = Integer.parseInt(str1[0]);
        String str2[] = str1[1].trim().split("月");
        int month = Integer.parseInt(str2[0]);
        String str3[] = str2[1].trim().split("日");
        int date = Integer.parseInt(str3[0]);
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
