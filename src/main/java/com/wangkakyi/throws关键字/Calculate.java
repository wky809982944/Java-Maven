package com.wangkakyi.throws关键字;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Calculate {

    public static void fun(int index){
         int [] arr={1,2,3,4};
        FileReader fr = null;
        try {
            System.out.println(arr[index]);
            fr = new FileReader("e:/a.txt");

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {

    }
}
