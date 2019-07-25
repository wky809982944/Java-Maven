package com.wangkakyi.Lambda.函数式接口.Predicate接口;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 21:05
 * @Description:
 */
public class Demo05Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", ",马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = filter(array, s -> s.split(",")[1].equals("女"), s -> s.split(",")[0].length() == 4);
        for (String s : list) {
            System.out.println("s = " + s);
        }

    }
}
