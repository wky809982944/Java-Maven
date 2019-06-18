package com.wangkakyi.IO系统.转换流;

import com.mchange.v2.io.IndentedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/wky/IdeaProjects/Java/src/IO系统/转换流/convert1.txt"));
        String line = null;
        while ((line = br.readLine())!=null) {
            if ("over".equalsIgnoreCase(line)) {
                break;
            }
            bw.write(line);//把键盘输入的数据保存在文本文件中
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }
}
