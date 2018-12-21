package com.yrj.util;

import java.util.Random;

/**
 * @author YIN
 * date: 2018/12/21 15:18
 * description:
 */
public class KeyUtil {
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)*100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
