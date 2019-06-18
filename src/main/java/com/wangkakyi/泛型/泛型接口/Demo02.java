package com.wangkakyi.泛型.泛型接口;

interface  IBase<T>{
    T getT();
    void showType();
}

class Sub implements IBase<String> {
    private String data;
    public Sub(String data) {
        this.data = data;
    }

    @Override
    public String getT() {
        System.out.println("返回参数类型T");
        return this.data;

    }

    @Override
    public void showType() {
        System.out.println("输出类型参数："+data.getClass().getName());
    }
}
public class Demo02 {
    public static void main(String args[]) {
        IBase sub = new Sub("孙悟空");
        sub.showType();
    }
}
