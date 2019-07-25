package com.wangkakyi.Lambda.函数式接口.Predicate接口;

import java.util.function.Predicate;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 20:42
 * @Description:
 */
public class Demo02Predicet_and {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }


    public static void main(String[] args) {
        String s = "abcde";
        checkString(s,
                str -> {
                    return str.length() > 5;
                }
                , str -> {
                    return str.contains("a");
                });

    }
}
