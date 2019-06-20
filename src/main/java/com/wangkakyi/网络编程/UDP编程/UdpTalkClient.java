package com.wangkakyi.网络编程.UDP编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 发送端
 * 1.使用DatagramSocket 指定端口 创建容器
 * 2.准备数据 一定转成字节数据
 * 3.封装成DatagramPacket包裹需要指定目的地
 * 4.发送包裹send(DatagromPacket)
 * 5.释放资源
 */
public class UdpTalkClient {
    public static void main(String args[]) throws Exception {
        System.out.println("发送方启动中");
        //1.使用DatagramSocket 指定端口 创建容器
        DatagramSocket client = new DatagramSocket(8888);
        //2.准备数据 一定转成字节数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            //3.封装成DatagramPacket包裹需要指定目的地
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 9999));
            // 4.发送包裹send(DatagromPacket)
            client.send(packet);
            if (data.equalsIgnoreCase("bye")) {
                break;
            }
        }
        //5.释放资源
        client.close();
    }
}
