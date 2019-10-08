package com.group5.util;

import java.util.Random;

public class CreateSalt {
    public static String crate(){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<5;i++){
            int number=random.nextInt(36);
            sb.append(str.charAt(number));
        }
        String salt=sb.toString();
        return salt;

    }
}
