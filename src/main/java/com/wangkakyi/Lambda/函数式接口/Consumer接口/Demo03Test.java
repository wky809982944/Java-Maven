package com.wangkakyi.Lambda.函数式接口.Consumer接口;

import java.util.function.Consumer;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 14:23
 * @Description:
 */
public class Demo03Test {

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        printInfo(arr,
                message->
                    System.out.println("姓名:"+message.split(",")[0]),
                message->
                        System.out.println("性别:"+message.split(",")[1]));
    }
}
