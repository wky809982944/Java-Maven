package com.wangkakyi.IO系统.打印流;

import java.io.PrintStream;

public class Demo01 {
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
