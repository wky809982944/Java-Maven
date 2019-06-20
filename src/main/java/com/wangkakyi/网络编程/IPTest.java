package com.wangkakyi.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
InetAddress ：静态方法
1.getLocalHost本机
2.getByName:根据域名
3.getByName:根据IP地址
成员方法
1.getHostAddress返回地址
2.getHostName返回主机名

 */
public class IPTest {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
        //根据域名得到netAddress
        InetAddress.getByName("www.163.com");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
