package com.wangkakyi.连接池;

public class WaitressWrap implements Waiter{
    Waiter waiter=null;
    public WaitressWrap(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void service() {
        System.out.println("微笑::");
        waiter.service();
    }
}
