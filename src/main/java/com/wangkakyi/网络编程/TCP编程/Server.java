package com.wangkakyi.网络编程.TCP编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    public static void serverInfo() throws Exception{
        Map<String, String> poem = new HashMap<>();
        poem.put("春晓", "春眠不觉晓");
        poem.put("登鹳雀楼", "白日依山尽");
        ServerSocket server = null;
        Socket client = null;
        BufferedReader br = null;
        PrintStream out = null;
        boolean flag = true;
        server = new ServerSocket(7000);
        while (flag) {
            System.out.println("服务器正在运行，等待客户连接");
            client = server.accept();
            out = new PrintStream(client.getOutputStream());
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flagInfo = true;
            while (flagInfo) {
                String info = br.readLine();
                if (info == null || "".equalsIgnoreCase(info) || "over".equalsIgnoreCase(info)) {
                    flag = false;
                } else {
                    String msg = poem.get(info);
                    out.println("服务器发送的信息："+msg);
                }
            }
            client.close();
        }
        server.close();
    }
    public static void main(String[] args) throws Exception{
        serverInfo();

    }
}
