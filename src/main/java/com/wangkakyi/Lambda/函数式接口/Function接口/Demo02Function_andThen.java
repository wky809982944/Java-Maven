package com.wangkakyi.Lambda.函数式接口.Function接口;

import java.util.function.Function;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 21:29
 * @Description:
 */
public class Demo02Function_andThen {
    public static void change(String s, Function<String,Integer> fun1, Function<Integer,String> fun2) {
        System.out.println(fun1.andThen(fun2).apply(s));
    }

    public static void main(String[] args) {
        String s = "123";
        change(s, str ->
                    Integer.parseInt(s) + 10
                , integer -> integer + ""
        );
    }
}
