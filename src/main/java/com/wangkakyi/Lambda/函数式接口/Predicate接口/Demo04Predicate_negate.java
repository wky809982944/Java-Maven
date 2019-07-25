package com.wangkakyi.Lambda.函数式接口.Predicate接口;

import java.util.function.Predicate;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 21:00
 * @Description:
 */
public class Demo04Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre){
        return !pre.test(s);
    }


    public static void main(String[] args) {
        String s = "abcde";
        checkString(s,
                str -> {
                    return str.length() > 5;
                }
        );
    }
}
