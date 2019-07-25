package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:23
 * @Description:
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.map(Integer::parseInt)
              .forEach(System.out::println);

    }
}
