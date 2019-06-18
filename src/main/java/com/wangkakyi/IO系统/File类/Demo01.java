package com.wangkakyi.IO系统.File类;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("构造文件对象");
        File file = new File("/home/wky/IdeaProjects/Java/src/IO系统/File类/test.txt");
        if (!file.exists()) {
            System.out.println("构建文件对象不成功");
            System.exit(1);
        }
        System.out.println("成功构造了对象"+file);
        System.out.println("访问文件信息");
        System.out.println("文件目录是否存在"+file.exists());
        System.out.println("是文件么"+file.isFile());
        System.out.println("是目录么"+file.isDirectory());
        System.out.println("名称："+file.getName());
        System.out.println("路径："+file.getPath());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("文件父目录"+ file.getParentFile());
        System.out.println("最后修改时间" + new Date(file.lastModified()));
        System.out.println("文件大小" + file.length()+"字节");
        System.out.println("文件是否可写" + file.canWrite());
        System.out.println("文件操作");
        String fileName = "/home/wky/IdeaProjects/Java/src/IO系统/File类/temp.txt";
        File file2 = new File(fileName);
        if (!file2.exists()) {
            System.out.println("不存在文件" + fileName + "创建该文件");
            try {
                file2.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("删除文件：" + file2.delete());
        System.out.println("目录操作");
        System.out.println("列出当前路径下的所有文件");
        File dirFile = new File("/home/wky/IdeaProjects/Java/src/IO系统/File类");
        String[] files = dirFile.list();
        for (String s : files) {
            System.out.println("文件名"+s);
        }
        File newDir = new File("/home/wky/IdeaProjects/Java/src/IO系统/File类/testDir");

        if (!newDir.exists()) {
            newDir.mkdir();
        }
        if (newDir.exists()) {
            newDir.delete();
        }
    }
}
