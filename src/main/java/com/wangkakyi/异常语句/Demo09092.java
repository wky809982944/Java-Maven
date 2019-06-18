package com.wangkakyi.异常语句;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Demo09092 {
    public static void main(String args[]) {
       /*int [] a={1,2,3,3};
       int index;
        Scanner scanner=new Scanner(System.in);
        System.out.println("====程序开始====");
        index=scanner.nextInt();
        try{
            System.out.println("第"+index+"个位置元素是："+a[index]);
            System.out.println("正常执行try");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("执行catch语句");
            e.printStackTrace();

        }
        System.out.println("=====程序结束=====");
*/
        int [] arr=new int[4] ;
        int index;
        String numStr;
        Scanner scanner=new Scanner(System.in);
        System.out.println("====程序开始====");
        int trans;
        try{
            System.out.println("请输入一个字符串");
            numStr= scanner.nextLine();
            System.out.println("请输入数组元素的位置");
            index=scanner.nextInt();
            trans=Integer.parseInt(numStr);
            arr[index]=trans;
            System.out.println(10/trans);

        }catch (NumberFormatException e){
            System.out.println("抛出数字转换异常，执行catch语句");
            e.printStackTrace();

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("抛出数组越界异常，执行catch语句");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("抛出算数异常，执行catch语句");
            e.printStackTrace();
        }
        finally {
            System.out.println("执行finall语句");

        }
        System.out.println("=====程序结束=====");
    }
}
