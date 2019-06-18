package com.wangkakyi.计算题1;/*
package 计算题1;
class Student implements Cloneable{
    private String name;
    private String sex;
    private Book book;

    public Student(String name, String sex, Book book) {
        this.name = name;
        this.sex = sex;
        this.book = book;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student =(Student) super.clone();
        student.book=(Book) this.book.clone();
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", book=" + book +
                '}';
    }
}
class  Book implements  Cloneable{
    private int price;
    private String name;

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Demo12 {
    public static void main(String args[]) throws CloneNotSupportedException{
      Book book=new Book(123,"红楼梦" );
      Student person=new Student("孙悟空","男",book);
      Student student=(Student) person.clone();
      System.out.println(student);

    }
}
*/
