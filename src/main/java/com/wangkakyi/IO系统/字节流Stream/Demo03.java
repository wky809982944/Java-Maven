package com.wangkakyi.IO系统.字节流Stream;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    @Test
    public static boolean copyFile(String srcFile, String destFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File src = new File(srcFile);
        File dest = new File(destFile);
        if (!dest.exists()) {
            try {
                dest.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
             fis = new FileInputStream(src);
             fos = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int hasData=0;
            while ((hasData = fis.read(buf)) > 0) {
                System.out.println(1);
                fos.write(buf,0,hasData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            try {
                fis.close();
                fos.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String src = "/home/wky/IdeaProjects/Java/src/IO系统/字节流Stream/test02.txt";
        String dest = "/home/wky/IdeaProjects/Java/src/IO系统/字节流Stream/test03.txt";
        if (copyFile(src, dest)) {
            System.out.println("文件复制成功");
        }else {
            System.out.println("文件复制失败");
        }
    }
}
