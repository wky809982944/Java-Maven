package com.wangkakyi.泛型.泛型概念泛型类;
class  Gen<T>{
    private  T data;

    public Gen(T data) {
        this.data = data;
    }
    public void showType(){
        System.out.println("data的参数T:" + this.data.getClass().getName());

    }
}
class Person{}
public class Demo01 {
    public static void main(String args[]) {
        //java7之后支持菱形语法：<>
        Gen<String> gS = new Gen<>("Hello,generic!");
        gS.showType();
        Gen<Person> gP = new Gen<>(new Person());
        gP.showType();

    }
}
