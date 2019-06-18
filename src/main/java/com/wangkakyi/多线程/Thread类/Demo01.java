package com.wangkakyi.多线程.Thread类;

public class Demo01 {
    public static void main(String[] args) {
        int num = 5;
        Well oldWellZbj = new Well(num, "猪八戒");
        Well oldWellSwk = new Well(num, "孙悟空");

        oldWellZbj.start();
        oldWellSwk.start();
        for (int i = 1; i <=num ; i++) {
            System.out.println("当前线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
