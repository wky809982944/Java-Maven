package com.wangkakyi.泛型.泛型接口;

interface Generator<E>{
    void add(E e);

    E get(int index);
}
class GeneratorAny<E> implements Generator<E>{
    private Object[] elem;
    private int index=0;
    private int max;

    public GeneratorAny(int count) {
        this.max = count;
        elem = new Object[max];
    }

    @Override
    public void add(E e) {
        if(index>=max)
            System.out.println("数组已满！");
        else{
            elem[index]=e;
            index++;
        }
    }

    @Override
    public E get(int index) {
        if(index>=max||index<0) return null;
        return (E) elem[index];

    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Demo04 {
    public static void main(String args[]) {
        Generator<Person> gPer = new GeneratorAny<>(3);
        gPer.add(new Person("孙悟空"));
        gPer.add(new Person("猪八戒"));
        gPer.add(new Person("唐僧"));
        System.out.println("gPer.get(1) = " + gPer.get(1));
    }
}
