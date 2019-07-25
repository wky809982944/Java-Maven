package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 15:28
 * @Description:
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter(name->name.startsWith("张"))
                    .filter(name->name.length()==3)
                    .forEach(System.out::println);
    }
}
