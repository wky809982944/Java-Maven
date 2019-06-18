/*
package com.wangkakyi.多线程.线程同步;

public class Well implements Runnable {
    private int num;

    public Well(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "开始取水");
                    System.out.println("取出1桶水，" + "剩余水量" + (--num) + "桶");

                } else {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
