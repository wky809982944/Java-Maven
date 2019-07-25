package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:11
 * @Description:
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        stream.forEach(System.out::println);
    }
}
