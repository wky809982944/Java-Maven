package com.wangkakyi.Lambda.Stream流和方法.Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 15:22
 * @Description:
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                listA.add(s);
            }
        }
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if (s.length() == 3) {
                listB.add(s);
            }
        }
        System.out.println("listB = " + listB);
    }
}
