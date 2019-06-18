package com.wangkakyi.接口与接口的关系;
    interface IntA{
        void prinA();
    }
interface IntB{
    void prinB();
}
interface IntC extends IntA,IntB{
        void  printc();
}
class Myclass implements IntC{
    @Override
    public void prinA() {
        System.out.println("接口A的实现方法");

    }

    @Override
    public void prinB() {
        System.out.println("接口B的实现方法");
    }

    @Override
    public void printc() {
 System.out.println("接口C的抽象方法");

    }

    public Myclass() {
    }
}
class  Yourclass implements IntA,IntB{
    @Override
    public void prinA() {
        System.out.println("实现从接口A中的方法");

    }

    @Override
    public void prinB() {
        System.out.println("实现从接口B的方法");

    }
}
public class InterfaceDemo {
    public static void main(String args[]) {
        Myclass myclass = new Myclass();
        myclass.prinA();
        myclass.prinB();
        myclass.printc();
        Yourclass yourclass = new Yourclass();
        yourclass.prinA();
        yourclass.prinB();

    }
}
