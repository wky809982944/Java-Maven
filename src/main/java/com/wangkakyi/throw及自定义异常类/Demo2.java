package com.wangkakyi.throw及自定义异常类;
class AlcoholException extends Exception{
    public AlcoholException(){
        super();
    }
    public AlcoholException(String msg){
        System.out.println(msg);

    }
}
class Check{
    public static double alcoholContent;
    public static void drunkDriving()throws AlcoholException{
        if(alcoholContent >80)
            throw new AlcoholException("已经是醉驾，需要接受处罚");
        else if(alcoholContent>=20){
            throw new AlcoholException("已经是酒驾，需要接受处罚");
        }
        else
            System.out.println("酒精含量正常，谢谢配合我们的工作");

    }
}
public class Demo2 {
    public static void main(String args[]) {
         Check.alcoholContent=100;
        try {
            Check.drunkDriving();
        } catch (AlcoholException e) {
            System.out.println("酒精含量："+Check.alcoholContent);
            System.out.println("请不要饮酒驾车");


        }finally {
            System.out.println("检查结束，谢谢配合");

        }
    }
}
