package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:39
 * @Description:
 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"美羊羊", "懒羊羊", "喜羊羊", "红太狼"};
        Stream.of(arr).limit(3).forEach(System.out::println);

    }
}
