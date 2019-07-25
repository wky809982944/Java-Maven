package com.wangkakyi.Lambda.Stream流和方法.方法引用.方法引用;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 16:57
 * @Description:
 */
public class Demo01Printable {
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        printString(System.out::println);
        /**
         * 分析:
         *    lambda表达式的目的,打印参数传递的字符串
         *    把参数s,传递给了System.out对象,调用out对象中的方法println对字符串进行了输出
         *    注意:
         *          1.System.out对象是已经存在的
         *          2.println方法也是一斤存在的
         *          所以我们可以使用方法引用来优化lambda表达式
         *          可以使用System.out方法直接引用(调用)println方法
         */


    }
}
