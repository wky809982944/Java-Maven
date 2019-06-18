package com.wangkakyi.计算题1;
class student {

    String number;

    String name;

    double j_score;

    double d_score;



    public student(String aNumber, String aName) {

        number = aNumber;

        name = aName;

    }



    public student(String aNumber, String aName, double J_score, double D_score) {

        number = aNumber;

        name = aName;

        j_score = J_score;

        d_score = D_score;

    }



    public void total_average() {

        System.out.println(name + "学生的总分是:" + (j_score + d_score) + " 平均数是:" + (j_score + d_score) / 2);

    }



    public void print() {

        System.out.println(number);

        System.out.println(name);

        System.out.println(j_score + d_score);

        System.out.println((j_score + d_score) / 2);

    }



    public String classing(String time, String lesson, String site) {

        return name + "在" + time + ",在" + site + "学习" + lesson;

    }



}



public class Demo2 {



    public static void main(String[] args) {

        student p1 = new student("1", "张三", 80, 85);

        student p2 = new student("2", "李四", 85, 90);

        p1.total_average();

        p2.total_average();

        System.out.println(p1.classing("2017年9月29日", "java课程", "3223"));

        System.out.println(p2.classing("2017年9月29日", "数据结构", "1402"));



    }



}
