package com.wangkakyi.计算题1;
interface  AnimalAction{
    void run();
}
class Dog implements  AnimalAction{
    @Override
    public void run() {
        System.out.println("狗在跑");

    }
}
class Fish implements AnimalAction{
    @Override
    public void run() {
        System.out.println("鱼在游");

    }
}
class  Client{
    public static void running(AnimalAction Animal){
        Animal.run();
    }
}
public class Demo6 {
    public static void main(String args[]) {
      Dog dog = new Dog();
      Fish f=new Fish();
      Client.running(dog);
      Client.running(f);
    }
}
