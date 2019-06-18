package com.wangkakyi.对象数组;

import java.util.Objects;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    public void showPerson(){
        System.out.println("姓名："+this.name+" 年龄："+this.age);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
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

class Test{
    public Test() {
    }


    public Boolean contains(Person[]per, Person temp){
        for (Person p:per
             ) {
            if (p.equals(temp))
                return  true;
        }
        return  false;
    }
}
public class PersonDemo {
    public static void main(String args[]) {
        Person[] group=new Person[5];
        group[0]=new Person("张无忌", 18);
        group[1]=new Person("刘德华", 22);
        group[2]=new Person("周润发", 21);
        group[3]=new Person("周星驰", 20);
        group[4]=new Person("吴孟达", 25);
          Person p=new Person("周润发", 21);
          Test test=new Test();
          if (test.contains(group, p)){
              System.out.println("包含");
              p.showPerson();

          }
          else{
              System.out.println("不包含");
              p.showPerson();

          }
        for (Person person:group
             ) {
            System.out.println(person);

        }

    }
}
