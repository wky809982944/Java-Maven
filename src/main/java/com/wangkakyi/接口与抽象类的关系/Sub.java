package com.wangkakyi.接口与抽象类的关系;

public class Sub extends Base{
    @Override
    public void showA() {
        System.out.println("重写抽象类Base中的抽象方法");

    }

    @Override
    void showC() {
        System.out.println("重写接口类Base中的抽象方法");
    }

    @Override
    public void showB() {
        super.showB();
    }
}
