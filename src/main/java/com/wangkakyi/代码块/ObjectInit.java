package com.wangkakyi.代码块;
class Student{
    {
        System.out.println("普通构造块1,输出数据成员name(定义之前)："+this.name);
    }
    String name="xxx";
    {
        System.out.println("普通构造块2，输出成员name（定义之后）："+this.name);
    }
    static{
        System.out.println("静态构造块1，count=(定义之前)"+Student.count);
        Student.count++;
    }
    static int count;
    static{
        System.out.println("静态构造块1，count=(定义之前)"+Student.count);
        Student.count++;
    }

    public Student(String name) {
        System.out.println("构造方法，给成员变量赋值之前："+this.name);
        this.name=name;
        System.out.println("构造方法，给成员变量赋值之后："+this.name);
    }
}
public class ObjectInit {
    public  static  void main(String args[]){
            Student std1=new Student("王阳明");
             Student std2=new Student("朱熹");
    }
}
