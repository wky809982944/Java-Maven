package com.wangkakyi.泛型.受限泛型;/*
package 泛型.受限泛型;

import 接口与抽象类的关系.Sub;

class Base{}
class Sub1 extends Base{}
class Sub2 extends Base{}
class Generic<T extends Base>{
    private T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    public  void showType(){
        System.out.println("T的类型是："+data.getClass().getName());
    }
}
public class DMLDemo {
    public  static void display(Generic<?> g) {
        g.showType();
    }
    public static void main(String args[]) {
        Generic<Sub1> g1 = new Generic<>(new Sub1());
        Generic<Base> g3 = new Generic<>(new Base());
        //Generic<Base> g4 = new Generic<Sub1>(new Sub1());
        display(new Generic<Base>(new Base()));
    }
}
*/
