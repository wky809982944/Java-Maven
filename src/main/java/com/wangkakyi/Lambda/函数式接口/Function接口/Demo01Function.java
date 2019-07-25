package com.wangkakyi.Lambda.函数式接口.Function接口;


import java.util.function.Function;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 21:37
 * @Description:
 */
public class Demo01Function {
    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s, Integer::parseInt);

    }
}
