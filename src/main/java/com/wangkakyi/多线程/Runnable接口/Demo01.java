package com.wangkakyi.多线程.Runnable接口;

public class Demo01 {
    public static void main(String[] args) {
        Well oldWell = new Well(5);
        Thread swk = new Thread(oldWell, "孙悟空");
        Thread zbj = new Thread(oldWell, "猪八戒");
        swk.start();
        zbj.start();
    }
}
