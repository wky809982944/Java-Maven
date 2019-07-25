package com.wangkakyi.Lambda.函数式接口.Supplier接口;

import java.util.function.Supplier;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 10:47
 * @Description:
 */
public class Demo02Test {
    public static int getMax(Supplier<Integer> supplier) {
         return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {200, 2, -50, 88, 99, 99, -30};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("maxValue = " + maxValue);
    }
}
