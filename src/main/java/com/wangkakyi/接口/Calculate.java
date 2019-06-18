package com.wangkakyi.接口;
interface Graph{
   void drawing();
}
class Rectangle implements  Graph{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void drawing() {
        System.out.println("绘制一个长方形");

    }
}
class Circle implements Graph{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawing() {
        System.out.println("绘制一个圆");

    }
}
class Triangle implements Graph{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void drawing() {
        System.out.println("绘制一个三角形");

    }
}
class Client{
    public void myDrawing(Graph graph){
         graph.drawing();
    }
}
public class Calculate {
    public static void main(String args[]) {
     new Client().myDrawing(new Rectangle(12, 39));
     new Client().myDrawing(new Circle(12));
     new Client().myDrawing(new Triangle(12,3,4));
    }
}
