package com.wangkakyi.类接口混合关系;
interface IA{
    void showA();
}
interface IB{
    void showB();
}
abstract class Base{
    public abstract void showBase();
}
class Sub extends Base implements IA,IB{
    @Override
    public void showA() {
        System.out.println("抽象类Base");

    }

    @Override
    public void showBase() {
           System.out.println("接口IA.");

    }

    @Override
    public void showB() {
        System.out.println("接口IB.");

    }
}
public class InterfaceDemo {
    public static void main(String args[]) {
      Sub sub =new Sub();
      sub.showA();
      sub.showB();
      sub.showBase();
    }
}
