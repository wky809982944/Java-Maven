package com.wangkakyi.IO系统.打印流;/*
package IO系统.打印流;

import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

class  Student{
    private String name;
    private int age;
    private double english;
    private double math;

    public Student(String name, int age, double english, double math) {
        this.name = name;
        this.age = age;
        this.english = english;
        this.math = math;
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

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
public class Demo02 {
    public static void printStudent (Student[] std, String fileName, String charSet) throws Exception{
        FileInputStream fos = new FileInputStream("/home/wky/IdeaProjects/Java/src/IO系统/打印流/test01.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, charSet);
        PrintWriter ps = new PrintWriter(osw, true);
        ps.println("姓名\t年龄\t英语\t数学\t平均成绩");
    }
    public static void main(String[] args) throws Exception{
        String[] name = {"孙悟空", "猪八戒"};
        double[][] score = {{22, 88.60, 92.50}, {19, 78.00, 86.00}};
        //PrintStream ps = new PrintStream("/home/wky/IdeaProjects/Java/src/IO系统/打印流/test01.txt");
        PrintStream ps = new PrintStream(System.out);
        System.setOut(ps);
        System.out.println("-------------------");
        ps.println("姓名\t年龄\t英语\t数学\t平均成绩");
        for (int i = 0; i < name.length; i++) {
            ps.println(name[i]);
            ps.print('\t');
            for (int j = 0; j < score[i].length; j++) {
                ps.print(score[i][j]);
                ps.print('\t');

            }
            ps.print((score[i][1]+score[i][2])/2);
            ps.println();
        }

    }
}
*/
