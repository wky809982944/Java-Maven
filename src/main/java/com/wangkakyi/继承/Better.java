package com.wangkakyi.继承;
class FatherX{

    public Integer getX() {

        return new Integer(10);

    }

}

class Son extends FatherX{

    public Integer getX() {

        return new Integer(10);

    }

}

public class Better {

    public static void main(String[] args) {

        FatherX f=new FatherX();

        Son s=new Son();

        System.out.println(f.getX()+s.getX());

    }

}
