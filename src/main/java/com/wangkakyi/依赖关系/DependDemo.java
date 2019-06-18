package com.wangkakyi.依赖关系;/*
package 依赖关系;
class  Mobile{
    private String brand;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void send(String msg){
        System.out.println(this.brand+"手机发送了信息"+msg);

    }
}
class  Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void sendInfo(Mobile m,String msg){
        System.out.println(this.name+"准备用"+m.getBrand()+"发送信息！");
        m.send(msg);
    }
}
public class DependDemo {
    public static void main(String args[]) {
        Person you=new Person("王大国");
        Mobile m =new Mobile("华为P9");
        you.sendInfo(m, "今天读论语了么");
    }
}
*/
