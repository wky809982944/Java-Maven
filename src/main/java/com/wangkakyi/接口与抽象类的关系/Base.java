package com.wangkakyi.接口与抽象类的关系;

public abstract class Base implements IA,IB {
    @Override
    public void showA() {
        System.out.println("重写接口IA中的方法");

    }
    abstract void showC();
    @Override
    public void showB() {
        System.out.println("重写接口IB中的方法");
    }
}
