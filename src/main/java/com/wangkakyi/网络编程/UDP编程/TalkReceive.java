package com.wangkakyi.网络编程.UDP编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    private DatagramSocket server;
    private String from;

    public TalkReceive(int port, String from) {
        this.from = from;
        try {
            this.server = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            // 2. 准备容器 封装成DatagramPacket 包裹
            byte[] container = new byte[1024*60];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            try {
                // 3. 阻塞式接受包裹receive(DatagramPacket p)
                server.receive(packet);
                // 4. 分析数据
                byte[] datas = packet.getData();
                int len = packet.getLength();
                String data = new String(datas, 0, len);
                System.out.println(from+":"+data);
                if (data.equalsIgnoreCase("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        server.close();
    }
}
