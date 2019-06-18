package com.wangkakyi.实验六类与对象;
class Room{
    private  String id;
    private  double area;
    private  String type;
    private  int price;
    private  String state;
    Room(){}

    public Room(String id, double area, String type, int price, String state) {
        this.id = id;
        this.area = area;
        this.type = type;
        this.price = price;
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public double getArea(){
        return  this.area;
    }
    public String showRoom(){
        return "编号："+this.id+"面积："+this.area+"户型："+this.type+"单价："+this.price+"销售状态："+this.state;
    }
    public double getMoney(){
        return  this.area*this.price;
    }
}
public class RoomDemo {
    public static void main(String[] args) {
        Room river[] =new Room[4];
        river[1]= new Room("3-2-502", 113.5, "三室一厅", 15000, "false");
        river[2]= new Room("4-5-1108", 156.9, "四室二厅", 17500, "true");
        river[3]= new Room("4-3-1501", 45.9, "二室一厅", 16200, "true");
        System.out.println("三个房间的总面积为："+(river[1].getArea()+river[2].getArea()+river[3].getArea()));
        System.out.println("三个房间的总价为："+(river[1].getMoney()+river[2].getMoney()+river[3].getMoney()));
        river[1].setState("true");
        System.out.println(river[1].showRoom());
        System.out.println(river[2].showRoom());
        System.out.println(river[3].showRoom());
    }
}
