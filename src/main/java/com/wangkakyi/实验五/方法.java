package com.wangkakyi.实验五;
import java.util.*;

public class 方法 {
    public static  void copyArray(int []src,int begin,int end,int []dest){
       int k=0;
        for(int i=begin;i<end;i++,k++){
           dest[k]=src[i];
       }
        for (int x:
             dest) {
            System.out.print(x+" ");

        }
    }
    public static  void getMax(int a[]){
        int max=a[0];
        for (int x:
             a) {
            if(x>max)
                max=x;
        }
        System.out.println(max);

    }
    public static  void getMax(int a[][]){
        int max=a[0][0];
        for (int[]x: a) {
            for(int y:x)
            {
                if(y>max){
                    max=y;
                }
            }
        }
        System.out.println(max);

    }
    public static  void getMax(Vector<Double> vector){
        double max= vector.get(0);
        int size = vector.size();
        for (int i=0; i<size; i++) {
           if(vector.get(i)>max){
               max=vector.get(i);
           }
        }
        System.out.println(max);

    }
    public static void getMax(double a,double b,double c){
        double max= (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println(max);

    }
    public static void main(String args[]) {
        int a[] ={10,20,30,40,50};
        int b[]=new int[a.length];
        int c[][]={{22,15,32,20,18},{12,21,25,19,33},{14,58,34,24,66},};
        System.out.println("复制数组");

        copyArray(a, 2, 4, b);
        System.out.println();
        System.out.println("返回一维数组最大值");

        getMax(a);
        System.out.println("返回二维数组最大值");

        getMax(c);
        System.out.println();
        System.out.println("返回Vector数组最大值");
        Vector<Double> vec = new Vector<Double>();
        vec.add(10.1);
        vec.add(20.3);
        vec.add(40.1);
        vec.add(50.3);
        vec.add(233.2);
        getMax(vec);
        System.out.println();
        System.out.println("返回三个浮点数中的最大值");
        getMax(1.2,2.4,3.3);
    }
}
