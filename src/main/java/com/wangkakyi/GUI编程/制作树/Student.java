package com.wangkakyi.GUI编程.制作树;

public class Student extends Person {
    private String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }
}
