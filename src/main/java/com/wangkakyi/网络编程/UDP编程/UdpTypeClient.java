package com.wangkakyi.网络编程.UDP编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 发送端
 * 1.使用DatagramSocket 指定端口 创建容器
 * 2.将基本类型 准备数据 一定转成字节数据
 * 3.封装成DatagramPacket包裹需要指定目的地
 * 4.发送包裹send(DatagromPacket)
 * 5.释放资源
 */
public class UdpTypeClient {
    public static void main(String args[]) throws Exception {
        System.out.println("发送方启动中");
        //1.使用DatagramSocket 指定端口 创建容器
        DatagramSocket client = new DatagramSocket(8888);
        //2.准备数据 一定转成字节数据
        String data = "上海尚学堂";
        byte[] datas = data.getBytes();
        //3.封装成DatagramPacket包裹需要指定目的地
        DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 9999));
        // 4.发送包裹send(DatagromPacket)
        client.send(packet);
        //5.释放资源
        client.close();
    }
}
