package com.wangkakyi.Enum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeasonTest {
        @Test
        public void testValues(){
            Season[] values = Season.values();
            for (Season value : values) {
                System.out.println("value = " + value);
            }
            Thread.State[] states = Thread.State.values();
            for (Thread.State state : states) {
                System.out.println("state = " + state);
            }
        }
        @Test
        public void testValueOf(){
            Season winter = Season.valueOf("WINTER");
            System.out.println("winter = " + winter);
        }

    /**
     * 使用enum关键字定义的枚举类实现接口的情况
     * 情况一：实现接口，在enum类中实现抽象方法
     * 情况二：让枚举类的对象分别去实现接口的抽象方法
     */
        @Test
        public void testInterface(){
            Season[] values = Season.values();
            for (Season value : values) {
                value.show();
                System.out.println("**********");
            }
        }
}
