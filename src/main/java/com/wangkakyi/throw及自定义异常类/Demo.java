package com.wangkakyi.throw及自定义异常类;

public class Demo {
    public static  void getSex(char sex) throws  Exception{
        try {
            if(sex!='男'&&sex!='女')
                throw  new  RuntimeException("性别为男或女");
        }catch (RuntimeException e){
            System.out.println("性别："+sex+"错误了哦");
            throw  e;


        }
    }
    public static void main(String args[]) {
        try {
            getSex('男');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
