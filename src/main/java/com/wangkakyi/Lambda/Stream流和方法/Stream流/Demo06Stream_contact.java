package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:39
 * @Description:
 */
public class Demo06Stream_contact {
    public static void main(String[] args) {
        String[] arr = {"美羊羊", "懒羊羊", "喜羊羊", "红太狼"};
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream.concat(Stream.of(arr),stream).forEach(System.out::println);

    }
}
