package com.wangkakyi.IO系统.转换流;

import java.io.*;

public class Demo02 {
    public static void saveFile(String src,String dest,String charSet) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), charSet));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
    public  static  void  readFile(String src,String charSet) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src), charSet));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception{
        String src = "/home/wky/IdeaProjects/Java/src/IO系统/转换流/convert1.txt";
        String dest = "/home/wky/IdeaProjects/Java/src/IO系统/转换流/core3.txt";
        saveFile(src, dest, "UTF-8");
        readFile(dest, "UTF-8");
    }
}
