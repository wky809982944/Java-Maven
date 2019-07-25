package com.wangkakyi.Lambda.函数式接口.Predicate接口;

import java.util.function.Predicate;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 17:17
 * @Description:
 */
public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";

        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println("b = " + b);
    }
}
