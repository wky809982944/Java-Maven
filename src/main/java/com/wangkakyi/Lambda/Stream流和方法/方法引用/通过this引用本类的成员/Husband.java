package com.wangkakyi.Lambda.Stream流和方法.方法引用.通过this引用本类的成员;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:38
 * @Description:
 */
public class Husband {
    public void buyHouse() {
        System.out.println("北京二环内买一套四合院!");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
