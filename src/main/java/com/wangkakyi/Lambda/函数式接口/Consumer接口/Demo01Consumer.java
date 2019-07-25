package com.wangkakyi.Lambda.函数式接口.Consumer接口;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Consumer;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 11:07
 * @Description:
 */
public class Demo01Consumer {
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖", name -> System.out.println(StringUtils.reverse(name)));
    }
}
