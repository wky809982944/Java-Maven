package com.wangkakyi.泛型.通配符;
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
public class Demo02 {
    public static void display(Genenric<?> g) {
        System.out.println("输出值：" + g.getData());
        g.showType();
    }
    public static void main(String args[]) {
          display(new Genenric<Base>(new Base()));
        display(new Genenric<Sub>(new Sub()));

    }
}
