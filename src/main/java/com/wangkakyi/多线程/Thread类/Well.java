package com.wangkakyi.多线程.Thread类;

public class Well extends Thread{
    private int num;

    public Well(int num, String name) {
        super(name);
        this.num = num;
    }

    public void run() {
        for (int i = 1; i < this.num; i++) {
            System.out.println(this.getName()+"取出第"+i+"桶水"+(this.num-i)+"桶");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
