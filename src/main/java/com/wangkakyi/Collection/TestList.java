package com.wangkakyi.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String args[]) {
    //ArrayList:List的主要实现类
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new String("AA"));
        list.add(new String("BB"));
        System.out.println(list);
        //void add(int index,Object ele):在指定的索引位置添加元素ele
        list.add(0,555);
        System.out.println(list);
        Object obj = list.get(1);
        System.out.println("obj = " + obj);
        //Object remove(int index):删除指定索引位置的元素
        list.remove(0);
        System.out.println(list.get(0));
        //Object set(int index,Object ele):设置指定索引位置的元素为ele
        list.set(0, 111);
        System.out.println(list.get(0));
        //int indexOf(Object obj):返回obj在集合中首次出现的位置。没有的话返回-1
        //int lastIndexOf(Object obj):返回obj在集合中最后出现的位置。没有的话返回-1
        //List subList(int fromIndex,int toIndex):返回从from到to-1的list
    }
}
