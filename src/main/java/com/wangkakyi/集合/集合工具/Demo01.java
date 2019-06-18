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
public class DMLDemo {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person swk=new Person("孙悟空",21);
        Person ts=new Person("唐僧",18);
        Person zbj=new Person("猪八戒",18);
        Person ss=new Person("沙僧",23);
        list.add(swk);
        list.add(ts);
        list.add(zbj);
        list.add(ss);
        System.out.println("======排序之前======");
        for(Person per:list)
            System.out.println(per);
        System.out.println("======排序之后======");
        //Collections.sort(list);
        Collections.sort(list,new PersonComarator());
        for(Person per:list)
            System.out.println(per);
        System.out.println("======取得年龄最小的人======");
        Person perMin=Collections.min(list);
        System.out.println("年龄最小的:"+perMin);
        System.out.println("======复制list======");
        ArrayList<Person> destList=new ArrayList<>();
        Collections.addAll(destList, new Person[list.size()]);
        Collections.copy(destList, list);
        for(Person per:destList)
            System.out.println(per);
        ts.setName("唐三藏");
        System.out.println("======输出复制后的destList======");
        for(Person per:destList)
            System.out.println(per);
        System.out.println("======输出原来List======");
        for(Person per:list)
            System.out.println(per);
        System.out.println(Collections.binarySearch(list, new Person("沙僧",23)));
    }
}
*/
