package com.wangkakyi.依赖关系;/*
package 依赖关系;
 class Person{
    private String name;
    private String sex;
    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void work(control c,String msg){
        if(msg=="开启"){
            c.open();
        }else if(msg=="关闭"){
            c.close();
        }else if(msg=="调大"){
            c.turnup();
        }else if(msg=="调小"){
            c.turndown();
        }
    };
}
class control{
   private String brand;
   private String color;
   private int length;
   private int batterylife;

    public control(String brand, String color, int length, int batterylife) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.batterylife = batterylife;
    }

    public control() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBatterylife() {
        return batterylife;
    }

    public void setBatterylife(int batterylife) {
        this.batterylife = batterylife;
    }
    public void open(){
        System.out.println("打开电视机");

    }
    public void close(){
        System.out.println("关闭电视机");

    }
    public void turnup(){
        System.out.println("调大音量（音量范围0-40）");

    }
    public void turndown(){
        System.out.println("调大节目号（节目号范围1-88）");

    }
}
public class Calculate {
    public static void main(String args[]) {
      Person person=new Person("秦云", "男");
      control c =new control("TCL", "白色", 15, 3);
      person.work(c,"开启");
        person.work(c,"关闭");
        person.work(c,"调大");
        person.work(c,"调小");
    }
}
*/
