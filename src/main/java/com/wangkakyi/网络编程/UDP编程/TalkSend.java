package com.wangkakyi.网络编程.UDP编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    private DatagramSocket client;
    private BufferedReader reader;
    private String toIP;
    private int toPort;

    public TalkSend(int port,String toIP,int toPort) {
        this.toIP = toIP;
        this.toPort = toPort;
        try {
            this.client = new DatagramSocket(port);
            reader=new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            String data = null;
            try {
                data = reader.readLine();
                byte[] datas = data.getBytes();
                //3.封装成DatagramPacket包裹需要指定目的地
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(this.toIP, this.toPort));
                // 4.发送包裹send(DatagromPacket)
                client.send(packet);
                if (data.equalsIgnoreCase("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        client.close();
    }
}
