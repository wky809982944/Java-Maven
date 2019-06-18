package com.wangkakyi.连接池;

import org.junit.Test;

public class Waitress implements Waiter {
    @Override
    @Test
    public void service() {
        System.out.println("正在服务...");
    }
}
