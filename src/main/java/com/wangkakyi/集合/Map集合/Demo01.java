package com.wangkakyi.集合.Map集合;/*
package 集合.Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
public class DMLDemo {
    public static void main(String[] args) {
        //1.建立HashMap对象，Key身份证号码 ，value Person对象
        Map<Integer, Person> group = new HashMap<>();
        //2.jianli key与value的银蛇关系key-value

        Person swk = new Person("孙悟空", 21);
        Person ts = new Person("唐僧", 18);
        Person zbj = new Person("猪八戒", 28);
        Person ss = new Person("沙僧", 17);
        group.put(430001, swk);
        group.put(430002, ts);
        group.put(430003, zbj);
        group.put(430004, ss);
        //3.遍历 hashmap
        Set<Integer> number = group.keySet();
        for (Integer num : number) {
            System.out.println(num+"\t"+group.get(num));
        }
    }
}
*/
