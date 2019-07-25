package com.wangkakyi.Lambda.函数式接口.函数式接口作为方法的参数案例;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-24 09:56
 * @Description:
 */
public class Demo01Runnable {
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--->"+"线程启动了");
            }
        });
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
}
