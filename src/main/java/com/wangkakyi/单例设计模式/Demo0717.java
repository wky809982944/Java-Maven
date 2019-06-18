package com.wangkakyi.单例设计模式;
/*class Battery{
    private static Battery bat;

    private Battery() {
    }
    public static Battery getInstance(){
        if(bat==null)
            bat=new Battery();
        return bat;
    }
    public  void fire(String bomb){
        System.out.println("发射"+bomb);

    }
}*/
public class Demo0717 {
    public static void main(String args[]){
        /*Battery bat=Battery.getInstance();
        bat.fire("导弹");
        bat.fire("手榴弹");
        String  s[]={"北京",  "江苏", "上海"};

    System.out.println(s[1]);
*/
        String  s[]={"北京",  "江苏", "上海"};

        System.out.println(s[1]);
    }
}
