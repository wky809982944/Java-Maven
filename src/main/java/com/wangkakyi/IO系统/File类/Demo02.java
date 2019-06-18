package com.wangkakyi.IO系统.File类;

import java.io.File;
import java.io.FilenameFilter;

class  FileAccept implements FilenameFilter {
    private String extendName;

    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(this.extendName);//以扩展名结尾的字符串
    }
}
public class Demo02 {
    public static void main(String[] args) {
        File dirFile = new File("./src");
        FileAccept fa = new FileAccept();
        fa.setExtendName("java");
        String[] fn = dirFile.list(fa);
        for (String name : fn) {
            System.out.println("name = " + name);
        }
    }
}
