package com.wangkakyi.Lambda.函数式接口.Consumer接口;

import java.util.function.Consumer;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 11:24
 * @Description:
 */
public class Demo02AndThen {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",
                t-> System.out.println(t.toUpperCase()),
                t-> System.out.println(t.toLowerCase()));
    }
}
