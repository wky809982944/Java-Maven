package com.wangkakyi.Lambda.Stream流和方法.方法引用.类的构造器引用;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:44
 * @Description:
 */
public class Demo {
    public static void printName(String name,PersonBuilder pb) {
        System.out.println(pb.builderPerson(name));
    }

    public static void main(String[] args) {
        printName("迪丽热巴", Person::new );
    }
}
