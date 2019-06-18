package com.wangkakyi.Final关键字;

class Person{
    private String name;
    final static private  String COUNTRY="中国";
    final public  void  printInfo(){
        System.out.println("输出父类Person");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Book{
    private  String  name="高等数学";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student extends Person{
    Book book;

    public Student(Book book) {
        super();
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void printInfo(String info){

    }
}
public class FinalDemo {
    public static void main(String args[]) {
         Book book=new Book();
         final  Student std = new Student(book);
         System.out.println(book.getName());
         std.getBook().setName("java程序设计");
         System.out.println(book.getName());


    }
}
