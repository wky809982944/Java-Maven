package com.wangkakyi.GUI编程.鼠标事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyColor {
    private JFrame frame = new JFrame("鼠标事件案例");
    private JLabel lblRed = new JLabel("红色");
    private JLabel lblBlue = new JLabel("蓝色");
    private JLabel lblYellow = new JLabel("黄色");
    private JLabel lblGreen = new JLabel("绿色");
    private JLabel info = new JLabel("保护环境");
    private JTextField txtMouseLocation = new JFormattedTextField(20);

    public MyColor() {
        frame.setSize(400, 300);
        frame.setLocation(450, 200);
        frame.setLayout(new FlowLayout());
        frame.add(lblRed);
        frame.add(lblBlue);
        frame.add(lblYellow);
        frame.add(lblGreen);
        frame.add(info);
        frame.add(txtMouseLocation);
        MyMouseListener listener = new MyMouseListener();
        lblRed.addMouseListener(listener);
        lblBlue.addMouseListener(listener);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "系统关闭", "警告信息", 2);
                System.exit(1);
            }
        });
        frame.setVisible(true);
    }

    private class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            StringBuffer location = new StringBuffer();
            location.append("鼠标被单击：").append("横坐标：" + e.getX() + "纵坐标:" + e.getY());
            location.append("，鼠标键：" + e.getButton());
            txtMouseLocation.setText(location.toString());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Font font = new Font("隶书", Font.BOLD, 30);
            info.setFont(font);
            if (e.getSource() == lblRed) {
                info.setForeground(Color.RED);
            } else if (e.getSource() == lblBlue) {
                info.setForeground(Color.BLUE);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}

public class Demo01 {
    public static void main(String[] args) {
        new MyColor();
    }
}
