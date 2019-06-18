package com.wangkakyi.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
    public static void main(String args[]) {
        FileInputStream fis;
        try {
            fis=new FileInputStream(".idea/demo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int [] a={1,2,3,4};
        System.out.println("程序开始");
        System.out.println(a[-1]);
        System.out.println("程序结束");



    }
}
