package com.wangkakyi.类接口混合关系;

import java.security.PrivateKey;

class A{

    static String name="tom";

    static int getX() {

        return 2;

    }

    int getY() {

        return 3;

    }

}

class B extends A{

    static String name="Tuny";

    static int getX() {

        return 4;

    }

    int getY() {

        return 5;

    }

}

class C extends A{

    static String name="Tuny";

    static int getX() {

        return 4;

    }

    int getY() {

        return 5;

    }

}

interface D{

    int getY();

}

class E implements D{
    float  aFloat=1.2F;
    public int getY() {

        return 6;

    }

}

public class Demo{

    public static void main(String[] args) {

        A a=new A();

        A b=new B();

        A c=new C();

        D d=new E();

        int sum=a.name.length()+b.getX()+c.getY()+d.getY();

        System.out.println(sum);


    }

}
