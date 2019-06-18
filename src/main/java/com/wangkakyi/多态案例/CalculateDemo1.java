package com.wangkakyi.多态案例;/*
package 多态案例;
abstract class Abstract  {
    protected String id;
    protected double money;
    protected String type;
    protected double rate;

    public Abstract(String id, double money,String type) {
        this.id = id;
        this.type=type;
        this.money = money;
    }

    public final void interest(){
          this.confirmid();
          this.confirmrate();
    }

    void confirmid(){
       if(this.type.equals("活期")){
           this.rate=0.0025;
       }else if(this.type.equals("定期")){
           this.rate=0.041;
       }
    }
    abstract void confirmrate();
}
class HUOQI extends Abstract{

    public HUOQI(String id, double money, String type) {
        super(id, money, type);
    }

    @Override
    void confirmrate() {
        System.out.println("银行账户是："+this.id+",存款金额:"+this.money+"，活期利息是："+this.money*this.rate);
    }
}
class DINGQI extends Abstract{

    public DINGQI(String id, double money, String type) {
        super(id, money, type);
    }

    @Override
    void confirmrate() {
        System.out.println("银行账户是："+this.id+",存款金额:"+this.money+"，定期利息是："+this.money*this.rate);
    }
}
public class CalculateDemo1 {
    public static void main(String args[]) {
           HUOQI huoqi=new HUOQI("1001", 2500, "活期");
           huoqi.interest();
           DINGQI dingqi=new DINGQI("1002", 10000, "活期");
           dingqi.interest();
    }
}
*/
