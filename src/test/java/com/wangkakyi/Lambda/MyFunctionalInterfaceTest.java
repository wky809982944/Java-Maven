package com.wangkakyi.Lambda;

import com.wangkakyi.Lambda.函数式接口.函数式接口的使用.MyFunctionalInterface;
import com.wangkakyi.Lambda.函数式接口.函数式接口的使用.MyFunctionalInterfaceImpl;
import org.junit.Test;

/**
 * @Author: 鸢一折折纸
 * @Date: 19-7-23 21:25
 * @Description:
 * 函数式接口的使用：一般可以作为方法的参数和返回值的类型
 */
public class MyFunctionalInterfaceTest {
    //    定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }
    @Test
    public void method() {
//        参数为实现类对象
        show(new MyFunctionalInterfaceImpl());
//        参数为接口的匿名实现类
         show(new MyFunctionalInterface() {
             @Override
             public void method() {
                 System.out.println("使用匿名内部类重写接口中的抽象方法");
             }
         });
//         参数是函数式接口，可以用lambda表达式
        show(()->{
            ;
        });
//        简化lambda表达式
        show(()->System.out.println("使用lambda方法"));
    }
}
