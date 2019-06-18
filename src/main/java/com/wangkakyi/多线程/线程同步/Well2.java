/*
package com.wangkakyi.多线程.线程同步;

public class Well2 {
    private int waterSize;

    public Well2(int waterSize) {
        this.waterSize = waterSize;
    }

    public synchronized void fetchWater(int number) {
        if (number > this.waterSize) {
            System.out.println("剩余水量:"+this.waterSize+"，不能供应"+number+Thread.currentThread().getName());
        }else {
            System.out.println(Thread.currentThread().getName() + "取走水量" + number);
        }
    }
}
*/
