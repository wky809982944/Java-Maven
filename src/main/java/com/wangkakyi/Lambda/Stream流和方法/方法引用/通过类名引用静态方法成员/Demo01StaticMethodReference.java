package com.wangkakyi.Lambda.Stream流和方法.方法引用.通过类名引用静态方法成员;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:23
 * @Description:
 */
public class Demo01StaticMethodReference {
    public static int method(int number,Calcable c) {
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        System.out.println(method(-10, Math::abs));
    }
}
