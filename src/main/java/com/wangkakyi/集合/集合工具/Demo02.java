package com.wangkakyi.集合.集合工具;/*
package 集合.集合工具;

import java.util.*;
class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        super();
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public int compareTo(Person arg0) {
        if(this.age>arg0.age)
            return 1;
        else if(this.age<arg0.age)
            return -1;
        else
            return 0;
    }
    public String toString() {
        return "姓名:" +this.name + ",年龄:" +this.age;
    }
}
class PersonComarator implements Comparator<Person>{
    public int compare(Person arg0, Person arg1) {
        if(arg0.getAge()>arg1.getAge())
            return 1;
        else if(arg0.getAge()<arg1.getAge())
            return 1;
        else
            return 0;
    }
}
public class Demo02 {
    public static void main(String[] args) {
        Set<Person> group=new HashSet<>();
        group.add(new Person("孙悟空",21));
        group.add(new Person("猪八戒",18));
        group.add(new Person("唐僧",32));
        group.add(new Person("沙僧",23));
        System.out.println("======输出group集合======");
        for(Person per:group)
            System.out.println(per);
        //Collections.sort(group, new PersonComarator());
        System.out.println("==========返回集合中年龄最小的人==========");
        Person perMin=Collections.min(group,new PersonComarator());
        System.out.println("年龄最小的人:"+perMin);
        System.out.println("==========返回集合中年龄最大的人==========");
        Person perMax=Collections.max(group,new PersonComarator());
        System.out.println("年龄最大的人:"+perMax);
        System.out.println("==========把Set集合转换成List集合==========");
        List<Person> list=new ArrayList<>();
        list.addAll(group);
        for(Person per:list)
            System.out.println("---"+per);
    }
}
*/
