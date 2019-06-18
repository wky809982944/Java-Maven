package com.wangkakyi.IO系统.随机流;
import java.io.RandomAccessFile;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("/home/wky/IdeaProjects/Java/src/IO系统/随机流/test.txt", "r");
        System.out.println("文件指针：" + raf.getFilePointer());
        raf.seek(50);
        System.out.println("文件指针：" + raf.getFilePointer());
        byte[] bbuf = new byte[1024];
        int hasData = 0;
        /*while ((hasData = raf.read(bbuf)) > 0) {
            System.out.println(new String(bbuf,0,hasData));
        }*/
        raf.seek(32);
        byte[] temp = new byte[4];
        raf.read(temp);
        System.out.println(new String(temp));
        raf.skipBytes(4);
        raf.read(temp);
        System.out.println(new String(temp));
        raf.close();


    }
}
