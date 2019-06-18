package com.wangkakyi.Collection;

import java.util.*;

/*
 * 1.存储对象可以考虑 数组 集合
 * 2.数组存储对象的特点：Student[] stu= new Student[20];
 *    弊端：一旦创建，其长度不可变。真实的数组存放的对象的个数是不可知。
 * 3.
 */
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
public class TestCollection {
    public static void main(String args[]) {
        Collection coll = new ArrayList();
        //size();返回集合中元素的个数
        System.out.println(coll.size());
        //add(Object obj)
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        System.out.println(coll.size());
        //addAll(Collection coll):将形参col1中包含的所有元素添加到当前集合中
        Collection coll1 = Arrays.asList(1,2,3);
        coll.addAll(coll1);
        System.out.println(coll.size());
        //查看集合元素
        System.out.println(coll);
        //4.isEmpty():
        System.out.println(coll.isEmpty());
        //5.clear():清空集合元素
       /* coll.clear();
        System.out.println(coll.isEmpty());*/
       //contains(object obj)：判断集合中是否包含指定的obj元素
        //判断的依据：根据元素所在类的equals()方法进行判断
        //明确：如果存入集合中的元素是自定义类的对象。要求:自定义类要重写equals()方法！
       boolean b1 =coll.contains(123);
        System.out.println(b1);
        coll.add(new Person("wky", 12));
        System.out.println(coll.contains(new Person("wky", 12)));
        // containsAll(Collection coll):判断当前集合中是否包含coll中的所有元素
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(new String("AA"));
        boolean b3 = coll.containsAll(coll2);
        System.out.println("b3 = " + b3);
        coll2.add(456);
        //coll.retainAll(Collection coll):求当前集合与coll的共有的元素
        coll.retainAll(coll2);
        System.out.println(coll);
        //remove(Object obj):删除集合中的obj元素 若删除成功，返回true
        boolean b4 = coll.remove("BB");
        System.out.println("b4 = " + b4);
        //removeAll(Collection coll):从当前的集合中删除包括在coll中的元素
        coll.remove(coll2);
        System.out.println(coll);
        //equals(Object obj):判断集合中的所有元素是否完全相同
        //hashCode():
        //toArray():将集合转化为数组
        Object[] obj =coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        //iterator():返回一个Iterator接口实现类的对象
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
