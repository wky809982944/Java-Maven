package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:31
 * @Description:
 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
    }
}
