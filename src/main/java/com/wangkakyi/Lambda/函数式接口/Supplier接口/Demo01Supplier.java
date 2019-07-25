package com.wangkakyi.Lambda.函数式接口.Supplier接口;

import java.util.function.Supplier;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 10:16
 * @Description:
 */
public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(() -> "虎哥");
    }
}
