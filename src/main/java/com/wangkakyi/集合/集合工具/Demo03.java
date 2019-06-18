package com.wangkakyi.集合.集合工具;

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
public class Demo03 {
    public static void main(String[] args) {
        Person[] group=new Person[4];
        group[0]=new Person("孙悟空",21);
        group[1]=new Person("猪八戒",18);
        group[2]=new Person("唐僧",32);
        group[3]=new Person("沙僧",19);
        System.out.println("=====排序之前======");
        for(Person per:group)
            System.out.println(per);
        System.out.println("======排序之后======");
        Arrays.sort(group);
        for(Person per:group)
            System.out.println(per);
        System.out.println("=======查找=====");
        int index=Arrays.binarySearch(group, new Person("孙悟空",22));
        if(index>=0)
            System.out.println("查找结果:"+group[index]);
        else
            System.out.println("没有找到！");
        System.out.println("======复制======");
        Person[] groupBak=new Person[group.length+5];
        groupBak=Arrays.copyOf(group, group.length);
        for(Person per:groupBak)
            System.out.println(per);
        System.out.println("=======数组的字符串表示======");
        String groupStr=Arrays.toString(group);
        System.out.println("数组字符串："+groupStr);
        List<Person> list=Arrays.asList(group);
        for(Person per:list)
            System.out.println(per);
        System.out.println("=======利用asList方法把多个对象加入到List中======");
        List<String> list2=Arrays.asList("道德经","论语","山海经");
        for(String str:list2)
            System.out.println(str);
    }
}
