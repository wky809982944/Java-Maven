package com.wangkakyi.多态案例;

interface Graph {
    void drawing();
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
    public static void myDrawing(Graph g) {
        g.drawing();
    }

    public static void main(String[] args) {
        Graph g1 = new Triangle(10, 20, 18);
        Graph g2 = new Rectangle(20, 30);
        Graph g3 = new Circle(10);
        g1.drawing();
        g2.drawing();
        g3.drawing();
        myDrawing(new Triangle(10, 20, 18));
        myDrawing(new Rectangle(20, 30));
        myDrawing(new Circle(10));
    }
}
