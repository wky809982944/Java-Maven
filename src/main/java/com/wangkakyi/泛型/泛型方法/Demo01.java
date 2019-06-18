package com.wangkakyi.泛型.泛型方法;
class MyGen<T>{}
class Generic<T>{
    private T data;

    public Generic(T data) {
        this.data = data;
    }
    public  <K> void  genericMethod(K k,int x){
        System.out.println("K的类型：" + "K的实际类型");
        Integer aInt = (Integer) k;
        if (k instanceof String) {
            System.out.println("k的值是："+aInt);
        }
        System.out.println("参数是："+x);
    }
    public <V> void showMSG(V...msg){
        for (V v : msg) {
            System.out.println("v = " + v);
        }
    }
      //1.该方法不是泛型方法
    public void showType(MyGen<Integer> gen) {

    }
    public T getT(){
        return this.data;
    }
    public void setT(T data){
        this.data=data;
    }
    public  void showType2(MyGen<?> t) {
        System.out.println(t.getClass().getName());
    }
}
public class Demo01 {
    public static void main(String args[]) {
        Generic<String> gen = new Generic<>("国学");
        gen.genericMethod("论语", 11705);
        System.out.println(gen.getT());
    }
}
