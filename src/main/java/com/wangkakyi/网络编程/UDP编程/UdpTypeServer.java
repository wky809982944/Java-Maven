package com.wangkakyi.网络编程.UDP编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 * 1.使用DatagramSocket 指定端口 创建容器
 * 2.准备容器 封装成DatagramPacket 包裹
 * 3.阻塞式接受包裹receive(DatagramPacket p)
 * 4.分析数据 将字节数组还原
 * byte[] getData()
 * getLength()
 * 5.释放资源
 */
public class UdpTypeServer {
    public static void main(String args[]) throws Exception {
        System.out.println("接收方启动中....");
        //1. 使用DatagramSocket 指定端口 创建容器
        DatagramSocket server = new DatagramSocket(9999);
        // 2. 准备容器 封装成DatagramPacket 包裹
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        // 3. 阻塞式接受包裹receive(DatagramPacket p)
        server.receive(packet);
        // 4. 分析数据
        byte[] datas = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(datas,0,len));

        // 5. 释放资源
        server.close();
    }
}
