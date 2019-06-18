package com.wangkakyi.GUI编程.窗体事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo01 {
    private JFrame frame;
    private JTextArea txt;
    private StringBuffer hint=new StringBuffer();
    public void init() {
        frame = new JFrame("环境保护执法系统");
        txt = new JTextArea(20, 10);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);
        frame.setLocation(50, 300);
        frame.add(txt);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyWindowListener listener = new MyWindowListener();
        frame.addWindowListener(listener);
    }

    class MyWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "退出系统");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            hint.append("\n窗口最小化");
            txt.setText(hint.toString());
        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {
            hint.append("\n激活该窗口，欢迎使用");
            txt.setText(hint.toString());
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            hint.append("\n窗口失活");
            txt.setText(hint.toString());
        }
    }
    public static void main(String[] args) {
new Demo01().init();
    }
}
