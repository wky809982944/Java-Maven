package com.wangkakyi.IO系统.字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("/home/wky/IdeaProjects/Java/src/IO系统/字符流/test01.txt");
        System.out.println("文件长度:" + file.length() + "字节");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
       //   reader =     new FileReader(file);
            char[] cbuf = new char[1024];
            int hasData=0;
            while ((hasData = fr.read(cbuf)) > 0) {
                System.out.println(new String(cbuf,0,hasData));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
