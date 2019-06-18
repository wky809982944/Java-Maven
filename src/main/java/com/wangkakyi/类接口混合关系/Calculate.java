package com.wangkakyi.类接口混合关系;

import java.util.IdentityHashMap;

interface ITask{
    void working();
    void rest();
    void show();
}
abstract class Person{
    private String name;
    private char sex;
    private int age;
    public void saying(Person person, String msg){};

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person implements ITask{
    private String  id;

    public Student(String name, char sex, int age, String id) {
        super(name, sex, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void working() {
        System.out.println(super.getName()+"正在学习");

    }

    @Override
    public void rest() {
         System.out.println(super.getName()+"正在休息");

    }

    @Override
    public void show() {
          System.out.println("姓名"+super.getName());
          System.out.println("性别"+super.getSex());
          System.out.println("年龄"+super.getAge());
          System.out.println("id"+this.getId());

    }
    public void reading(String book){
        System.out.println(super.getName()+"正在读"+book);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", id='" + id + '\'' +
                "} " + super.toString();
    }
}
class Teacher extends Person implements ITask{
    private String department;

    public Teacher(String name, char sex, int age, String department) {
        super(name, sex, age);
        this.department = department;
    }

    public String getId() {
        return department;
    }

    public void setId(String id) {
        this.department = id;
    }

    @Override
    public void working() {
        System.out.println(super.getName()+"正在上课");

    }

    @Override
    public void rest() {
        System.out.println(super.getName()+"正在休息");

    }

    @Override
    public void show() {
        System.out.println("姓名"+super.getName());
        System.out.println("性别"+super.getSex());
        System.out.println("年龄"+super.getAge());
        System.out.println("id"+this.getId());

    }
    public void teaching(Student std,String course){
        System.out.println(super.getSex()+"正在给"+std.getName()+"上"+course);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", department='" + department + '\'' +
                ", id='" + getId() + '\'' +
                "} " + super.toString();
    }
}
public class Calculate {
    public static void main(String args[]) {
        Student std=new Student("孙悟空", '男', 22, "190010987");
        System.out.println(std);

        std.reading("西游记");
        std.rest();
        std.working();
        Teacher ts=new Teacher("唐僧", '男', 26, "国学系");
        System.out.println(ts);
        ts.teaching(std, "除妖记");


        boolean a = false;

        boolean b = true;

        boolean c = (a && b) && (!b);

        boolean result = (a & b) & (!b);

        System.out.println(result);

        System.out.println(c);

    }


    }

