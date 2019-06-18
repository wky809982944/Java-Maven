package com.wangkakyi.内部类;

class Outer{

    class Inner{

        void show() {

            System.out.println("inner");

        }



    }

    public void aOuterMethod() {

        new Inner();

    }

    public static void main(String[] args) {

        Outer out=new Outer();



        Inner  inn=out.new Inner();



    }

}
