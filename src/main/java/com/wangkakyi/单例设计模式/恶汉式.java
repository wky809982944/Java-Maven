package com.wangkakyi.单例设计模式;
class Battery{
    private static final Battery bat=new Battery();

    private Battery() {
    }
    public static Battery getInstance(){
        return bat;
    }
    public  void fire(String bomb){
        System.out.println("发射"+bomb);

    }
}
public class 恶汉式 {
    public static void  main(String args[]){
        Battery bat=Battery.getInstance();
        bat.fire("导弹");
        bat.fire("手榴弹");
    }
}
