package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:18
 * @Description:
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        stream.filter(name->name.startsWith("张"))
              .forEach(System.out::println);
    }
}
