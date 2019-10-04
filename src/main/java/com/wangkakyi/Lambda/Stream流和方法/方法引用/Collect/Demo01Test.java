package com.wangkakyi.Lambda.Stream流和方法.方法引用.Collect;

import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 20:49
 * @Description:
 */
public class Demo01Test {
    public static void main(String[] args) {
        final Integer[] integers = Stream.of(1, 2, 3, 4, 5)
                                         .collect(() -> new Integer[]{0}
                                                 , (a, x) -> a[0] += x
                                                 , (a1, a2) -> a1[0] += a2[0]);
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }


    }
}
