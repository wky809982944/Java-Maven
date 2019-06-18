package com.wangkakyi.依赖关系;


class Person{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    public void write(Person p,Pen pencil,letter l){
        System.out.println(this.name+"正在用"+pencil.getName()+"给"+p.name+"写"+l.getName());

    }
}
class Pen{
    private String name;

    public Pen() {
    }

    public Pen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class letter{
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public letter() {
    }
}
public class Calculate2 {
    public static void main(String args[]) {

    }
}
