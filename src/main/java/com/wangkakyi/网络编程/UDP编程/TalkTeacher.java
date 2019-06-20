package com.wangkakyi.网络编程.UDP编程;

/**
 * 加入多线程，实现双向交流
 */
public class TalkTeacher {
    public static void main(String args[]) {
       new Thread(new TalkReceive(9999,"学生")).start();
        new Thread(new TalkSend(5555, "localhost", 8888)).start();

    }
}
