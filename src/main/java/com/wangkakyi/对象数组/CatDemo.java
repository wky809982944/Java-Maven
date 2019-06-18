package com.wangkakyi.对象数组;

class Eye {// 猫的眼睛类

    private String color;

    public Eye(String color) {

        this.color = color;

    }

}

class Cat {// 猫类

    private String name;

    private Eye eye;



    public Cat(String name, Eye eye) {

        this.name = name;

        this.eye = eye;

    }

    public boolean equals(Object obj) {

        Cat cat = (Cat) obj;

        if (this.name.equals(cat.name) && this.eye == cat.eye)

            return true;

        return false;

    }

}



public class CatDemo {

    public static void main(String[] args) {

        Eye e1=new Eye("蓝色");

        Eye e2=new Eye("蓝色");

        Cat tom=new Cat("Tome",e1);

        Cat jack=new Cat("Jack",e2);

        System.out.println(tom==jack);

        System.out.println(tom.equals(jack));

    }

}
