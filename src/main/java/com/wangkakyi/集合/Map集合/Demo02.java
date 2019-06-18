package com.wangkakyi.集合.Map集合;/*
package 集合.Map集合;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person other =(Person) o;
        if (this.age > other.age) {
            return 1;
        } else if (this.age < other.age) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

public class Demo02 {
    public static void main(String[] args) {
        //1.建立HashMap对象，Key身份证号码 ，value Person对象
       // Map<Integer, Person> group = new HashMap<>();
        //2.jianli key与value的银蛇关系key-value
        Map<Person, Car> agent = new TreeMap<>();
        Person swk = new Person("孙悟空", 21);
        Car swkC = new Car("长城哈弗H6");
        agent.put(swk, swkC);
        Person ts = new Person("唐僧", 18);
        Car tsC = new Car("红旗轿车");
        agent.put(ts, tsC);
        Person zbj = new Person("猪八戒", 28);
        Car zbjC = new Car("奇瑞QQ");
        agent.put(zbj, zbjC);

        Person ss = new Person("沙僧", 17);
        Car ssC = new Car("吉利汽车");
        agent.put(ss, ssC);
       */
/* group.put(430001, swk);
        group.put(430002, ts);
        group.put(430003, zbj);
        group.put(430004, ss);*//*

        //3.遍历 hashmap
        Set<Person> group = agent.keySet();
        for (Person per : group) {
            System.out.println(per + "\t" + agent.get(per));
        }
    }
}
*/
