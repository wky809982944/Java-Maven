package com.wangkakyi.IO系统.字节流Stream;
import java.io.*;


public class Demo01 {
    public static void main(String[] args) {
        File file = new File("/home/wky/IdeaProjects/Java/src/IO系统/字节流Stream/test.txt");
        System.out.println("文件夹长度："+file.length()+"字节");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            byte[] bbuf = new byte[1024];
            int hasData;
            while ((hasData = fis.read(bbuf))>0) {
                System.out.println(new String(bbuf,0,hasData));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
