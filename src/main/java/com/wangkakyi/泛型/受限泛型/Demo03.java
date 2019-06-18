package com.wangkakyi.泛型.受限泛型;
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

public class Demo03 {
    public  static void display(Generic<? super Sub1> g) {
        g.showType();
    }
    public static void main(String args[]) {
        display(new Generic<Sub1>(new Sub1()));
        Generic<Sub2> g2 = new Generic<>(new Sub2());
        //display(g2);
        Generic<Base> g3 = new Generic<>(new Base());
          display(g3);
    }
}
