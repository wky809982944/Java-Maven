package com.wangkakyi.接口;
interface IFly{
    public static  final int FLY_CONSTANT=56;
 void  fly();
}
class Plane implements  IFly{
    private String name;

    public Plane(String name) {
        this.name = name;
    }
    public void  start(){
        System.out.println(this.name+"正在启动!");

    }

    public  void fly(){
        System.out.println("发动机正在启动"+this.name+"正在飞行");

    }
}
class Bird implements IFly{
    private  String name;

    public Bird(String name) {
        this.name = name;
    }
    public void  sweet(){
        System.out.println(this.name+"正在鸣叫");

    }
    public void fly(){
        System.out.println(this.name+"正在快速扇动翅膀飞翔");

    }
}
public class DemoInterface {
    public static void testFly(IFly f){
        f.fly();
    }
    public static void main(String args[]) {
        testFly(new Plane("波音747"));
        testFly(new Bird("雄鹰"));
        System.out.println(IFly.FLY_CONSTANT);

    }
}
