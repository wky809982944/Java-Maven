package com.wangkakyi.Lambda.函数式接口.Function接口;

import java.util.function.Function;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 11:13
 * @Description:
 */
public class Demo03Test {
    public static int change(String s
            , Function<String, String> fun1
            , Function<String, Integer> fun2
            , Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);

    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        change(str
                , s -> s.split(",")[1]
                , Integer::parseInt
                ,i -> i+100);
    }
}
