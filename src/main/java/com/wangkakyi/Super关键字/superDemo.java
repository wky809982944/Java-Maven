package com.wangkakyi.Super关键字;
class Base {
    public int baseSubY;
    private String baseX;

    public Base(String baseX, int baseSubY) {
        super();
        this.baseX = baseX;
        this.baseSubY = baseSubY;
    }

    @Override
    public String toString() {
        return "Base [baseX=" + baseX + ", baseSubY=" + baseSubY + "]";
    }

    public void printInfo() {
        System.out.println("父类的方法，父类中的baseSubY"+this.baseSubY);
    }
  public void printMSG(String str){
        System.out.println("父类的printMSG方法"+str);

  }
}

class Sub extends Base {
    public int baseSubY = 99;

    public Sub(String baseX, int baseSubY) {
        super(baseX, baseSubY);
        // TODO Auto-generated constructor stub
    }

    public String getSub() {
        return super.toString();
    }

    public void printBaseSubY() {
        System.out.println("baseSubY in base:" + super.baseSubY);
        System.out.println("baseSubY in sub:" + this.baseSubY);
    }
    public void printInfo() {
        System.out.println("子类的方法，子类中的baseSubY"+this.baseSubY);
    }
    public void test(){
        super.printInfo();
        this.printInfo();
    }
    public void printMSG(String str,int x){
        System.out.println("父类的printMSG方法"+str+","+x);

    }
}

public class superDemo {
    public static void main(String[] args) {
        Sub sub = new Sub("xxx", 88);
        sub.printBaseSubY();
        System.out.println(sub.baseSubY);
        sub.test();
        sub.printMSG("中国");
        sub.printMSG("中华人民共和国", 1949);
    }
}
