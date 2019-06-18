package com.wangkakyi.多态案例;
class Car {
    protected String brand;
    protected double speed;
    protected Point point;
    public Car(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
interface GPS{
    Point getLocation(Point init);
}
class Point{
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class  GPSCar extends Car implements GPS{
    public GPSCar(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public Point getLocation(Point init) {
        this.point=init;
        System.out.println("当前位置："+this.point.x+" 当前位置："+this.point.y);
        return this.point;
    }

}
public class CalculateDemo2 {
    public static void main(String args[]) {
       GPSCar car=new GPSCar("哈弗", 100);
       Point point=new Point(100, 200);
       car.getLocation(point);
    }
}
