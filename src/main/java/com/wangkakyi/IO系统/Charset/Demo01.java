package com.wangkakyi.IO系统.Charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Demo01 {
    public static void main(String[] args) throws Exception{
//        SortedMap<String, Charset> cs = Charset.availableCharsets();
//        for (String s : cs.keySet()) {
//            System.out.println(s+" "+cs.get(s));
//        }
//        System.out.println("JVM默认字符集"+Charset.defaultCharset());
//        System.out.println("操作系统字符集" + System.getProperty("file.encoding"));
        Charset cn = Charset.forName("gbk");
        Charset cn2 = Charset.forName("gbk");
        CharsetEncoder cnEncoder = cn.newEncoder();
        CharsetDecoder cnDecoder = cn.newDecoder();
        CharBuffer cbuf = CharBuffer.allocate(10);
        cbuf.put("传统文化");
        cbuf.flip();
        ByteBuffer bbuf = cnEncoder.encode(cbuf);
        System.out.println(bbuf.capacity());
        for (int i = 0; i < bbuf.capacity(); i++) {
            System.out.println(bbuf.get(i));
        }
        CharBuffer result = cnDecoder.decode(bbuf);
        System.out.println("result = " + result);
    }
}
