package com.wangkakyi.日期时间处理类;

import java.text.SimpleDateFormat;
import java.util.Date;

class Person{
    private String name;
    private String date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compareBirthday(Person per) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年-MM月-dd日");
            Date date1=sdf.parse(this.date );
            Date date2=sdf.parse(per.getDate() );
            if(date1.compareTo(date2)<0){
                System.out.println(this.getName()+"年龄大");

            }else if(date1.compareTo(date2)==0){
                System.out.println("一样大");
            }else{
                System.out.println(per.getName()+"年龄大");
            }


    }

    public void betweenDay(Person per) throws  Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年-MM月-dd日");
        Date date1=sdf.parse(per.getDate());
        Date date2=sdf.parse(this.getDate());
        int days = (int) ((date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24));
        System.out.println("两个时间之间的天数差为：" + days);
        int hours = (int) ((date1.getTime() - date2.getTime()) / (1000 * 60 * 60));
        System.out.println("两个时间之间的小时差为：" + hours);
        int minutes = (int) ((date1.getTime() - date2.getTime()) / (1000 * 60));
        System.out.println("两个时间之间的分钟差为：" + minutes);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
public class Calculate {
    public static void main(String args[]) {
          Person person1=new Person("孙悟空", "2015年-04月-12日");
          Person person2=new Person("猪八戒", "2000年-03月-21日");
          try {
              person1.compareBirthday(person2);
          }catch(Exception e){
              e.printStackTrace();
        }try {
            person1.betweenDay(person2);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(person1);
        System.out.println(person2);


    }
}
