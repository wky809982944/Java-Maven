package com.wangkakyi.继承;
 class Father {

     public int name;

     public Father() {
     }

     public Father(int name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Father{" +
                 "name=" + name +
                 '}';
     }
 }

class Derived extends Father {

    public String name;

    public Derived(String name) {
        this.name = name;
    }

    public Derived(int name, String name1) {
        super(name);
        this.name = name1;
    }
}
public class 抽象 {
    public static void main(String args[]) {
      Father Obj=new Father() ;

    }
}
