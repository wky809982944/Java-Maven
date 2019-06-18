package com.wangkakyi.泛型.泛型概念泛型类;
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
class Sub extends Base<String>{
    public Sub(String data) {
        super(data);
    }

    @Override
    void showType() {
        super.showType();
        System.out.println("Sub T:" + data.getClass().getName());

    }
}
public class Demo04 {
    public static void main(String args[]) {
        Sub sub = new Sub(new String("xx"));
        sub.showType();
    }
}
