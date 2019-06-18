package com.wangkakyi.网络编程.TCP编程;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client
{
    public static void clientInfo() throws Exception{
        Socket client = null;
        client = new Socket("localhost", 7000);
        BufferedReader br = null;
        PrintStream out = null;
        BufferedReader input = null;
        input = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag) {
            System.out.println("客户端输入信息over结束");
            String info = input.readLine();
            out.println(info);

            if ("over".equalsIgnoreCase(info)) {
                flag = false;
            } else {
                String echo = br.readLine();
                System.out.println("echo = " + echo);
            }

        } br.close();
        input.close();
        out.close();
        client.close();
    }

    public static void main(String[] args) throws Exception {
        clientInfo();
    }
}
