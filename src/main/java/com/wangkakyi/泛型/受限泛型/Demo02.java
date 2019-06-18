package com.wangkakyi.泛型.受限泛型;/*
package 泛型.受限泛型;
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

public class Demo02 {
    public  static void display(Generic<? extends Base> g) {
        g.showType();
    }
    public static void main(String args[]) {
        display(new Generic<Sub1>(new Sub1()));
    }
}
*/
