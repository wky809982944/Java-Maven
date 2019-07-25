package com.wangkakyi.Lambda.函数式接口.性能浪费的日志案例;

import org.junit.Test;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 09:11
 * @Description: 日志案例
 */
public class Demo01Logger {
    //    定义一个根据日志的级别,显示日志信息的方法
    public static void showLog(int level, String message) {
//        对日志的等级进行判断,如果是1级别,那么输出日志信息
        if (level == 1) {
            System.out.println(message);
        }
    }
    @Test
    public void test(){
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showLog(1, msg1+msg2+msg3);
    }
}
