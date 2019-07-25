package com.wangkakyi.Lambda.函数式接口.性能浪费的日志案例;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 09:20
 * @Description:
 * Lambda的特点:延迟加载
 * Lambda的使用前提,必须存在函数式接口
 */
public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, ()->{
            return msg1 + msg2 + msg3;
        });
    }
}
