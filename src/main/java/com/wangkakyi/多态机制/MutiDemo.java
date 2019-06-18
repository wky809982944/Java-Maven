package com.wangkakyi.多态机制;


interface Graph {

}

class Rectangle implements Graph {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void drawing() {
        System.out.println("画长方形" + "长：" + this.length + "，宽：" + this.width);
    }

}

class Circle implements Graph {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void drawing() {
        System.out.println("画一个圆，半径为" + this.radius);
    }

}

class Triangle implements Graph {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void drawing() {
        System.out.println("画一个三角形，三边分别为" + this.a + "," + this.b + "," + this.c);
    }

}

public class MutiDemo {

    public static void main(String[] args) {
        Graph gRect=new Rectangle(10, 20);
        Graph gCir=new Circle(15);
        Rectangle rectangle;
        Circle circle;
        if(gRect instanceof Rectangle){
            rectangle =(Rectangle)gRect;
            rectangle.drawing();
        }
        if(gCir instanceof Circle){
            circle=(Circle)gCir;
            circle.drawing();
        }

    }
}
