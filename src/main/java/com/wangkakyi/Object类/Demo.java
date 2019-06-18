package com.wangkakyi.Object类;

import java.time.OffsetDateTime;
import java.util.Objects;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return  false;
        Person per =(Person) obj;
        if(this==per)
            return true;
        if(this.name.equals(per.getName())&&this.age==per.getAge())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
public class Demo {
    public static void main(String args[]) {
             /*int a=10,b=20;
             boolean result=(a==b);
             System.out.println("result = "+result);*//*
             String name1=new String("张飞");
             String name2=new String("张飞");
             System.out.println("name1==name2："+(name1==name2));
             System.out.println("name1.equals(names)："+name1.equals(name2));*/
            Person person1=new Person("刘德华", 55);
            Person person2=new Person("刘德华", 21);
            Person person3=new Person("刘德华", 55);
            System.out.println("比较对象内容per1与per2的比较："+person1.equals(person2));
            System.out.println("比较对象内容per与per3的比较："+person1.equals(person3));
            System.out.println("per1的引用"+person1);
            System.out.println("per2的引用"+person2);
            System.out.println("per3的引用"+person3);
            System.out.println("per1与per3的引用地址"+(person1==person3));



    }
}
