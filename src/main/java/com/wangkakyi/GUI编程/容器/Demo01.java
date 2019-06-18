package com.wangkakyi.GUI编程.容器;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Demo01 {
    private JFrame frame;
    private JPanel panNorth;
    private JLabel lblNorth;
    private JPanel panCenter;
    private JLabel lblUser;
    private JTextField txtUser;
    private JLabel lblPassword;
    private JTextField txtPassword;

    private JPanel panSouth;
    private JButton btnOK;
    private JButton btnCancel;
    public void init() {
        frame = new JFrame("登录窗口");
        panNorth = new JPanel();
        lblNorth = new JLabel();
        //lblNorth.setIcon( ImageIcon);
        panCenter = new JPanel();
        lblUser = new JLabel("用户名");
        txtUser = new JTextField(12);
        lblPassword = new JLabel("密码");
        txtPassword = new JTextField(12);
        panSouth = new JPanel();
        LineBorder border = new LineBorder(Color.BLUE);
        panSouth.setBorder(border);
        btnOK = new JButton("确定");
        btnCancel = new JButton("取消");
        frame.setSize(270, 200);
        frame.setLocation(500, 200);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        panNorth.setLayout(new FlowLayout());
        panCenter.setLayout(new GridLayout(2, 2));
        panSouth.setLayout(new FlowLayout());
        frame.add(panNorth, BorderLayout.NORTH);
        frame.add(panCenter, BorderLayout.CENTER);
        frame.add(panSouth, BorderLayout.SOUTH);
        panNorth.add(lblNorth);
        panCenter.add(lblUser);
        panCenter.add(txtUser);
        panCenter.add(lblPassword);
        panCenter.add(txtPassword);
        panSouth.add(btnOK);
        panSouth.add(btnCancel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
new Demo01().init();
    }
}
