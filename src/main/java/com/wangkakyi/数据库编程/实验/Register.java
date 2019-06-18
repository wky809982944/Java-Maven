package com.wangkakyi.数据库编程.实验;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
/**
 * 用户注册
 * @author 大南海
 *
 */

public class Register  extends JFrame {

    private int LOGIN_WIDTH=360;
    private int LOGIN_HEIGTH=350;
    private JPanel contentPane;
    private JTextField userName;
    private JPasswordField password;
    private JButton btn3,btn4;
    private JLabel label3,label4;
    Connection conn;
    Statement stam;


    public void addMan() {

        setTitle("注册");
        setTitle("增删改查");
        setBounds(100, 50, LOGIN_WIDTH, LOGIN_HEIGTH	);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        //设置窗体标题图标
        /**
         * 添加一个面板容器到窗体中
         */
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        //账号标签
        label3=new JLabel("账号");
        label3.setBounds(80,76, 54, 28);
        contentPane.add(label3);


        //密码标签
        label4=new JLabel("密码");
        label4.setBounds(80, 135, 54, 28);
        contentPane.add(label4);

        //账号输入框
        userName=new JTextField();
        userName.setBounds(139, 80, 161, 25);
        contentPane.add(userName);

        //密码输入框
        password=new JPasswordField();
        password.setBounds(139, 140, 161, 25);

        contentPane.add(password);

        btn3=new JButton("注册");
        btn3.setBounds(75, 210, 120, 23);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==btn3) {
                    try {

                        //加载数据库驱动
                        conn=jdbcUtil.getConnection();
                        //创建执行sql语句的对象
                        stam=conn.createStatement();
                        //编写sql语句
                        String sql="insert into user values('"+userName.getText()+"','"+password.getText()+"')";
                        //执行sql语句
                        stam.execute(sql);
                        JOptionPane.showMessageDialog(null, "注册成功!");
                        dispose();  //关闭注册窗体
                        new Login();  //打开登录窗体


                    }catch (Exception e1) {
                        e1.printStackTrace();
                    }finally {
                        jdbcUtil.result(conn, stam);
                    }

                }

            }
        });

        contentPane.add(btn3);

        btn4=new JButton("退  出");
        btn4.setBounds(210, 210, 80, 23);
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==btn4) {

                    dispose();
                }



            }
        });


        contentPane.add(btn4);
        contentPane.updateUI();

    }


}
