package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:46
 * @Description:
 */
public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("张天爱");
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(oneStream, twoStream)
              .map(Person::new)
              .forEach(System.out::println);



    }
}
