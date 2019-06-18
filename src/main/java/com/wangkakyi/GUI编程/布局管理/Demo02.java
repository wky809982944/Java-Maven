package com.wangkakyi.GUI编程.布局管理;

import javax.swing.*;
import java.awt.*;

public class Demo02 {
    private JFrame frame;
    private GridLayout gridLayout;
    private JLabel lblName;
    private JLabel lblAge;
    private JLabel lblSex;
    private JTextField txtName;
    private JTextField txtAge;
    private JTextField txtSex;

    public void init() {
        frame = new JFrame("网格布局案例");
        gridLayout = new GridLayout(3, 2, 10, 10);
        lblName = new JLabel("姓名");
        lblAge = new JLabel("年龄");
        lblSex = new JLabel("性别");
        txtName = new JTextField("孙悟空");
        txtAge = new JTextField("21");
        txtSex = new JTextField("男");
        frame.setSize(400, 150);
        frame.setLocation(400, 200);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblAge);
        frame.add(lblSex);

    }
    public static void main(String[] args) {

    }
}
