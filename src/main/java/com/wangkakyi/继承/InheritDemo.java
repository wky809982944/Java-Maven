package com.wangkakyi.继承;
class Person{
    private String name;
    private int age;
    private String sex;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, int age, String sex, int age1) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.age = age1;
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
    public String eating(){
        return this.name+"正在吃饭";
    }
    public String shopping(){
        return this.name+"正在吃饭";
    }
}
class Teacher extends Person{
    private String id;
    private String title;
    private String profession;
    private int  salary;

    public Teacher(String name, int age, String sex, int age1, String id, String title, String profession, int salary) {
        super(name, age, sex, age1);
        this.id = id;
        this.title = title;
        this.profession = profession;
        this.salary = salary;
    }
    public String teaching(){
        return this.getName()+"正在授课";
    }
    public String correcting(){
        return this.getName()+"正在批改";
    }
}
class  Student extends Person{
    private String id;
    private int grade;
    private String profession;
    private int score;

    public Student(String name, int age, String sex, int age1, String id, int grade, String profession, int score) {
        super(name, age, sex, age1);
        this.id = id;
        this.grade = grade;
        this.profession = profession;
        this.score = score;
    }
    public String learning(){
        return this.getName()+"正在学习";
    }
    public String homeworking(){
        return this.getName()+"正在做作业";
    }
}
public class InheritDemo {
    public static void main(String args[]) {








    }
}
