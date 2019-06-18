package com.wangkakyi.计算题1;

abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Fan extends Equipment {
    private double power;

    public Fan(String name, double power) {
        super(name);
        this.power = power;
    }

    public String toString() {
        return getName() + this.power;
    }
}

class Refrigerator extends Equipment {
    private double volume;

    public Refrigerator(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public String toString() {
        return getName() + this.volume;
    }
}
class MyFactory{
    public static Equipment getInstance(String arg){
        Equipment equipment=null;
        if(arg.equalsIgnoreCase("Fan")){
            equipment =new Fan("美的", 110);
        }
        else if(arg.equalsIgnoreCase("Refrigerator")){
            equipment =new Refrigerator("美的", 22);
        }
        return  equipment;
    }
}
class Clinet{
    public static void main(String args[]){
         Equipment e;
         e=MyFactory.getInstance("Fan");
         System.out.println(e);
         e=MyFactory.getInstance("Refrigerator");
         System.out.println(e);


    }
}
