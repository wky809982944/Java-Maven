package com.wangkakyi.实验六类与对象;

import java.nio.channels.Pipe;

class Car{
    private String brand;
    private Double emission;
    private Double price;

    public Car() {
    }

    public Car(String brand, Double emission, Double price) {
        this.brand = brand;
        this.emission = emission;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public String  Starting(){
        return ("启动发动机");
    }
}
class Hand{
    private double length;
    private double area;
    private double grip;

    public Hand() {
    }

    public Hand(double length, double area, double grip) {
        this.length = length;
        this.area = area;
        this.grip = grip;
    }
    public String catching(String thing){
        return  thing;

    }
    public void getinfo(){
        System.out.println("长度为："+this.length+"面积为："+this.area+"握力为："+this.grip);

    }
}
class Person{
    private String id;
    private String name;
    private int age;
    private String  hand;

    public Person() {
    }

    public Person(String id, String name, int age, String hand) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }
    public void showPerson(){
        System.out.println("身份证号码:"+id+"姓名："+name+"年龄："+age+"手："+hand);

    }
    public void  saying(Person per,String msg){
        System.out.println(this.name+"和"+per.name+"说"+msg);

    }
    public void getSomething(String something){
        Hand h =new Hand();
        System.out.println(name+"拿着"+h.catching(something));

    }
    public void start(Car car){
        Car car1 =new Car();
        System.out.println(name+car1.Starting());

    }
}
public class CarDemo {
    public void main (String args[]){
        //Car car =new Car("", , )
    }
}
