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
class Sub<T,V> extends Base<T>{
    private T data;
    private V type;

    public Sub(T data,  V type) {
        super(data);
        this.type = type;
    }

    @Override
    void showType() {
        super.showType();
        System.out.println("sub V:" + type.getClass().getName());
    }
}
public class Demo03 {
    public static void main(String args[]) {
        Sub<String, Integer> sub = new Sub<>(new String("xx"), new Integer(99));
        sub.showType();
    }
}
*/
