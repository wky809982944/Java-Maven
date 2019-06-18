package com.wangkakyi.多线程.生产者消费者问题;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Basket {
    private List<String> list = new ArrayList<String>();
    private int maxSize;

    public Basket(List<String> list, int maxSize) {
        this.list = list;
        this.maxSize = maxSize;
    }

    public void produce(String name) {
        synchronized (list) {
            while (list.size() == this.maxSize) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n" + Thread.currentThread().getName() + "生产商品" + name);
            list.add(name);
            list.notifyAll();
        }

    }

    public void consume() {
        synchronized (list) {
            while (list.size() == 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n" + Thread.currentThread().getName() + "开始要消费");
            String goods = list.get(list.size() - 1);
        }
    }
}
