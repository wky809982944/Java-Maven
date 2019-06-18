package com.wangkakyi.IO系统.字节流Stream;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("/home/wky/IdeaProjects/Java/src/IO系统/字节流Stream/test02.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            //fos = new FileOutputStream(file);
            fos = new FileOutputStream(file,true);
            String str1 = "Knowledge is power";
            String str2 = "爱国敬业友善";
            fos.write(str1.getBytes());
            fos.write(str2.getBytes());
            String str3 = "保护环境";
            byte[] buf = str3.getBytes();
            for (byte b : buf) {
                fos.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("文件长度"+file.length());
    }
}
