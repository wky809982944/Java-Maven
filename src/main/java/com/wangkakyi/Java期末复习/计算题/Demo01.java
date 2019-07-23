package com.wangkakyi.Java期末复习.计算题;


class Generic<T,V>{
    private T data;
    private V elem;

    public Generic(T data, V elem) {
        this.data = data;
        this.elem = elem;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public V getElem() {
        return elem;
    }

    public void setElem(V elem) {
        this.elem = elem;
    }

    public void showType() {
        System.out.println(data.getClass());
        System.out.println(elem.getClass());
    }
}
public class Demo01 {
    public static void main(String args[]) {
        Generic<Integer, String> swk = new Generic<>(10001, "孙悟空");
        swk.showType();
    }
}
