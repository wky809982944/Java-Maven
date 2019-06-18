package com.wangkakyi.IO系统.字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) {
        File file = new File("/home/wky/IdeaProjects/Java/src/IO系统/字符流/test01.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件长度:" + file.length() + "字节");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            String str1 = "Knowledge is power";
            String str2 = "爱国敬业友善";
            fileWriter.write(str1.toCharArray());
            fileWriter.write(str2);
            String str3 = "保护环境";
            char[] cbuf = str3.toCharArray();
            for (char ch : cbuf) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
