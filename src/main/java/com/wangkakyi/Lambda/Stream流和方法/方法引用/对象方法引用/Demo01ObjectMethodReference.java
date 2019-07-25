package com.wangkakyi.Lambda.Stream流和方法.方法引用.对象方法引用;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:18
 * @Description:
 * 通过对象名引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString(s -> {
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
