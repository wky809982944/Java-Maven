package com.wangkakyi.IO系统.随机流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class Demo03 {
    public static void insert(String fileName, long pos, String Content)throws Exception {
        File tempFile = File.createTempFile("temo", null);
        tempFile.deleteOnExit();
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        FileInputStream tempIn = new FileInputStream(tempFile);
        FileOutputStream tempOut = new FileOutputStream(tempFile);
        raf.seek(pos);
        byte[] buff = new byte[1024];
        int hasData = 0;
        while ((hasData = raf.read(buff)) > 0) {
            tempOut.write(buff,0,hasData);
        }
        raf.seek(pos);
        raf.write(Content.getBytes());
        while ((hasData = tempIn.read(buff)) > 0) {
            raf.write(buff,0,hasData);
        }
        raf.close();
    }
    public static void main(String[] args) throws Exception{
        insert("/home/wky/IdeaProjects/Java/src/IO系统/随机流/test.txt", 40, "伟大民族");
    }
}
