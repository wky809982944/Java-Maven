package com.wangkakyi.instanceof运算符;
class Person{}
class  Student extends Person{
    void  say(){
        System.out.println("学生说");

    }
}
class  Teacher extends Person{
    void  say(){
        System.out.println("老师说");

    }
}
public class instanceofDemo {
    public static  void sqying(Person person){
        if(person instanceof Student){
            Student std =(Student)person;
            std.say();
        }
        else  if(person instanceof Teacher){
            Teacher tch=(Teacher )person;
            tch.say();
        }else{
            System.out.println("参数不是Person的子类事例");

        }


    }
    public static void main(String args[]) {
          Person perStd=new Student();
          System.out.println("输出Personstd对象引用哪个事例");
          System.out.println("输出perstd对象引用实例的名称："+perStd.getClass().getName());
          if(perStd instanceof Person){
              System.out.println("perStd引用了Person的实例：true");

          }else{
                 System.out.println("perStd引用了Person的实例：false");

          }
          if(perStd instanceof Student){
              System.out.println("perStd引用了Student的实例：true");

          }
          else{
              System.out.println("perStd引用了Student的实例：false");

          }
        if(perStd instanceof Teacher){
            System.out.println("perStd引用了Teacher的实例：true");

        }
        else{
            System.out.println("perStd引用了Teacher的实例：false");

        }
        System.out.println("------输出per对象引用了哪个类的实例-----");
        Person person = new Person();
        if (person instanceof Teacher){
            System.out.println("per引用了Teacher实例：true");

        }else{
            System.out.println("per引用了Teacher实例：false");
        }
        if (person instanceof Student){
            System.out.println("per引用了Student实例：true");

        }else{
            System.out.println("per引用了Student实例：false");
        }
        if (person instanceof Person){
            System.out.println("per引用了Person实例：true");

        }else{
            System.out.println("per引用了Person实例：false");
        }
        sqying(new Student());
        sqying(new Teacher());

    }
}
