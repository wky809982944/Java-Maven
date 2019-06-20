package com.wangkakyi.网络编程;

import java.net.InetSocketAddress;

/**
 * 端口
 * 区分软件
 * 2个字节 0-65535 UDP TCP
 * 同一个协议端口不能冲突
 * 定义端口越大越好
 * InetSocketAddress
 * 构造器
 * new InetSocketAddress(域名,端口)
 * 方法
 * getPort()
 */
public class PortTest {
    public static void main(String args[]) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        System.out.println(socketAddress.getPort());
    }
}
