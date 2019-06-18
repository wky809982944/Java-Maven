package com.wangkakyi.GUI编程.制作树;

public class Teacher extends Person {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
