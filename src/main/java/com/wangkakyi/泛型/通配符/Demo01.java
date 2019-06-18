package com.wangkakyi.泛型.通配符;/*
package 泛型.通配符;
class Genenric<T>{
    private T data;

    public Genenric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    public  void showType(){
        System.out.println("T的类型是："+data.getClass().getName());
    }

}
class Base{}
class  Sub extends Base{}
public class DMLDemo {
    public static void display(Genenric<Base>g) {
        System.out.println("输出值：" + g.getData());
        g.showType();
    }

    public static void main(String args[]) {
        Genenric<Base> base = new Genenric<>(new Base());
        Genenric<Sub> sub = new Genenric<>(new Sub());
        display(base);
        //display(sub);//报错
        //同一种泛型可以对应多个版版（因为参数类型是不确定的）
        // 不同版本的泛型类型是不兼容的（即泛型不存在多态关系）
    }
}
*/
