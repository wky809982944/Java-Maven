package com.wangkakyi.GUI编程.动作事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo01 {
    private JFrame frame = new JFrame("改变颜色字体");
    private JButton btnRed = new JButton("红色");
    private JButton btnBlue = new JButton("蓝色");
    private JButton btnYellow = new JButton("黄色");
    private JTextField txt = new JTextField("保护环境");

    /*private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnRed) {
                txt.setForeground(Color.RED);
            }
        }
    }*/
    public void init() {
        frame.setSize(700, 300);
        frame.setLocation(500, 300);
        frame.setLayout(new FlowLayout());
        frame.add(btnBlue);
        frame.add(btnRed);
        frame.add(btnYellow);
        txt.setFont(new Font("隶书", Font.BOLD, 50));
        frame.add(txt);
        //MyActionListener listener = new MyActionListener();
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.RED);
            }
        });
        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.blue);
            }
        });
        btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.YELLOW);
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
new Demo01().init();
    }
}
