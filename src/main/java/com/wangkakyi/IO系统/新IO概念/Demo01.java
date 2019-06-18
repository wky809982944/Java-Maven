package com.wangkakyi.IO系统.新IO概念;

import java.nio.CharBuffer;

public class Demo01 {
    public static void main(String[] args) {
        CharBuffer cbuff = CharBuffer.allocate(15);
        System.out.println("cbuff.capacity() = " + cbuff.capacity());

        System.out.println("cbuff.limit() = " + cbuff.limit());
        System.out.println("cbuff.position() = " + cbuff.position());
        cbuff.put('c');
        cbuff.put("hina");
        cbuff.put('好');
        cbuff.put(12, '强');
        System.out.println("当前position" + cbuff.position());
        System.out.println("cbuff.limit() = " + cbuff.limit());

    }
}
