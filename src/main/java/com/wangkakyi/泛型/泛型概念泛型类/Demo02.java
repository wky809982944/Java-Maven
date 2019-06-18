package com.wangkakyi.泛型.泛型概念泛型类;/*
package 泛型;
class Base<T>{
    T data;

    public Base(T data) {
        this.data = data;
    }

    public Base() {
    }
    void showType(){
        System.out.println("Base T"+data.getClass().getName());

    }
}
class Sub<T> extends Base<T>{
    public Sub(T data) {
        super(data);
    }

    @Override
    void showType() {
        super.showType();
        System.out.println("Sub T:" + data.getClass().getName());
    }
}
public class Demo02 {
    public static void main(String args[]) {
        Sub<String> sub = new Sub<>(new String("xx"));
        sub.showType();
    }
}
*/
