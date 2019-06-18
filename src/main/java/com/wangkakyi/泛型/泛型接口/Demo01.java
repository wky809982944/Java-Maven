package com.wangkakyi.泛型.泛型接口;/*
package 泛型.泛型接口;
interface  IBase<T>{
    T getT();
    void showType();
}
class Sub<T> implements IBase{
    private T data;

    public Sub(T data) {
        this.data = data;
    }

    @Override
    public T getT() {
        System.out.println("返回类型参数T");
        return this.data;
    }

    @Override
    public void showType() {
        System.out.println("输出类型参数T："+this.data
        .getClass().getName());
    }
}

class Person {

}
public class DMLDemo {
    public static void main(String args[]) {
        Sub<Person> sub = new Sub<>(new Person());
        sub.showType();
        Sub<String> sub1 = new Sub<>(new String("xx"));
        sub1.showType();
    }
}
*/
