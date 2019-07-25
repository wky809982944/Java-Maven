package com.wangkakyi.Lambda.Stream流和方法.方法引用.通过父类引用Super的;

/**
 * @Author: 鸢一折折纸
 * @Date: 2019/7/25 17:29
 * @Description:
 */
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }
    public void  method(Greetable g) {
        g.greet();
    }
    public void show() {
       /* method(()->{
            Human human = new Human();
            human.sayHello();
        });*/
       method(super::sayHello);
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.show();
    }
}
