package com.wangkakyi.GUI编程.键盘事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SerialNumber{
    private JFrame frame = new JFrame("序列号问题");
    private JRadioButton rb = new JRadioButton("我有此产品的序列号");
    private JTextField txt1 = new JTextField(4);
    private JTextField txt2 = new JTextField(4);
    private JTextField txt3 = new JTextField(4);
    private JLabel lbl = new JLabel("序列号位于DVD盒的背面");
    JPanel panel = new JPanel(new FlowLayout());

    public SerialNumber() {
        frame.setSize(300, 300);
        frame.setLocation(450, 200);
        frame.setLayout(new BorderLayout());
        panel.add(txt1);
        panel.add(txt2);
        panel.add(txt3);
        frame.add(rb, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(lbl, BorderLayout.SOUTH);
        rb.setSelected(true);
        txt1.addKeyListener(new MykeyListener());
        txt2.addKeyListener(new MykeyListener());
        txt3.addKeyListener(new MykeyListener());
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "系统被关闭", "警告信息", 2);
                System.exit(1);

            }
        });
        frame.setVisible(true);
    }

    private class MykeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyChar() >= 58||e.getKeyChar()<=47) {
                JOptionPane.showMessageDialog(null, "请输入数字");
                if (e.getSource() == txt1) {
                    txt1.setText("");
                } else if (e.getSource() == txt2) {
                    txt2.setText("");
                }
            }
        }
    }
}
public class Demo01 {
    public static void main(String[] args) {
        new SerialNumber();

    }
}
