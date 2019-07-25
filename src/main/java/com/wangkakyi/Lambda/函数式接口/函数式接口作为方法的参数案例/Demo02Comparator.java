package com.wangkakyi.Lambda.函数式接口.函数式接口作为方法的参数案例;

import java.util.Comparator;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 10:02
 * @Description:
 */
public class Demo02Comparator {
    public static Comparator<String> getComparator() {
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };*/
        return ((o1, o2) -> o2.length() - o1.length());
    }

}
