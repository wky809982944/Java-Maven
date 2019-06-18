package com.wangkakyi.throws关键字;
public class Demo {
    private static int [] arr={1,2,3,4};
    public static void funA(int index) throws ArrayIndexOutOfBoundsException,Exception{
        System.out.println("方法funA");
        System.out.println(arr[index]);


    }
    public static void funB(int index) throws ArrayIndexOutOfBoundsException,Exception{
        System.out.println("方法funB");
        funA(index);

    }
    public  static  void funC(int index){
        System.out.println("方法funC");
        try {
            funB(index);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String args[]) {

funC(2);
    }
}
