package com.wangkakyi.IO系统.缓冲流;

import java.io.*;

public class Demo02 {
    public static boolean copyFileStream(String srcFile, String destFile) {
        long startTime = System.currentTimeMillis();
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
            int hasData = 0;
            while ((hasData = fis.read(buf)) > 0) {
                fos.write(buf,0,hasData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

    }

    public static boolean copyFileBuffer(String srcFile, String destFile) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
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
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buf = new byte[1024];
            int hasData = 0;
            while ((hasData = bis.read(buf)) > 0) {
                bos.write(buf,0,hasData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.flush();
                bos.close();
                long endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
                return true;

            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

    }

    public static void main(String[] args) {
        String src="/home/wky/IdeaProjects/Java/src/IO系统/缓冲流/test.jpg";
        String dest="/home/wky/IdeaProjects/Java/src/IO系统/缓冲流/test02.jpg";
        if (copyFileBuffer(src, dest)) {
            System.out.println("文件复制成功");
        } else {
            System.out.println("文件复制不成功");
        }
    }
}
