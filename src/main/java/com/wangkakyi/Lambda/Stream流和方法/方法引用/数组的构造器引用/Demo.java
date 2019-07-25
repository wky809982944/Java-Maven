package com.wangkakyi.Lambda.Stream流和方法.方法引用.数组的构造器引用;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:48
 * @Description:
 */
public class Demo {
    public static int[] createArray(int length,ArrayBuilder ab) {
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        createArray(10, int[]::new);
    }
}
