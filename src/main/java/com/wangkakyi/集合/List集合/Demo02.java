package com.wangkakyi.集合.List集合;

import javax.sound.midi.Soundbank;
import java.util.*;

class Person{
    private String name;
    private String type;

    public Person() {
    }

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(type, person.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
public class Demo02 {
    public static void main(String args[]) {
        List<Person> west = new LinkedList<>();
        // ArrayList<Object> west2 = new ArrayList<>();
        west.add(new Person("孙悟空", "妖怪"));
        west.add(new Person("猪八戒", "妖怪"));
        west.add(new Person("唐僧", "凡人"));
        west.add(new Person("白骨精", "妖怪"));
        west.add(new Person("无名氏", "神仙"));
        System.out.println("index=3时元素的信息：" + west.get(3));
        west.set(3, new Person("观世音", "神仙"));
        west.remove(new Person("无名氏", "神仙"));
        System.out.println("输出初始人物");
        for (Person per : west) {
            System.out.println(per);
        }
        ListIterator<Person> iterator = west.listIterator();
        System.out.println("迭代器从前向后遍历");
        while (iterator.hasNext()) {
            Person current = iterator.next();
            System.out.println(current);

        }
        while (iterator.hasPrevious()) {
            Person previous = iterator.previous();
            System.out.println(previous);

        }
    }
}
