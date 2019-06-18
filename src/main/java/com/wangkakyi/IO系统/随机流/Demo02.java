package com.wangkakyi.IO系统.随机流;

import java.io.RandomAccessFile;

public class Demo02 {
    public static void  append(String fileName,String content) throws Exception{
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.seek(raf.length());
        raf.write(content.getBytes());
        raf.close();
    }
    public static void main(String[] args) throws Exception{
        append("/home/wky/IdeaProjects/Java/src/IO系统/随机流/test.txt","---中国梦---");
    }
}
