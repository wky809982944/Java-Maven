package com.wangkakyi.数据库编程.实验;

import com.mysql.jdbc.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * 用户登录
 * @author 大南海
 *
 */
public class Login extends JFrame{

    private JPanel contentPane;
    private JButton btn1,btn2,btn3;
    private JTextField userName;
    private JPasswordField password;
    private JLabel label1,label2;

    private int LOGIN_WIDTH=360;
    private int LOGIN_HEIGTH=350;


    Connection conn;
    Statement stam;
    PreparedStatement ps;
    public Login() {

        setTitle("贪吃鬼");  //设置窗体标题
        setBounds(100, 50, LOGIN_WIDTH, LOGIN_HEIGTH	);  //设置窗体坐标以及打下
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置窗体可关闭
        setResizable(false);  //设置窗体大小不可以改变
        setVisible(true);    //设置窗体可见
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
        label1=new JLabel("账号");
        label1.setBounds(80,76, 54, 28);
        contentPane.add(label1);


        //密码标签
        label2=new JLabel("密码");
        label2.setBounds(80, 135, 54, 28);
        contentPane.add(label2);

        //账号输入框
        userName=new JTextField();
        userName.setBounds(139, 80, 161, 25);
        contentPane.add(userName);

        //密码输入框
        password=new JPasswordField();
        password.setBounds(139, 140, 161, 25);

        contentPane.add(password);


        //按钮—登录
        btn1=new JButton("登录");
        btn1.setBounds(95, 210, 80, 23);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn1) {
                    try {
                        conn=jdbcUtil.getConnection();//获取数据库连接
                        /*stam= (Statement) conn.createStatement();  //创建sql语句执行对象
                        //编写sql语句
                        String sql="select * from user where username='"+userName.getText()+"'  and password='"+password.getText()+"'     ";
                        //执行sql语句
                        ResultSet rs=stam.executeQuery(sql);*/
                        String sql = "select * from user where username=? and password =?";
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, userName.getText());
                        ps.setString(2, password.getText());
                        ResultSet rs = ps.executeQuery();
                        if(rs.next()) {
                            dispose();//关闭当前窗口
                            new Main();
                        }
                    }catch (Exception e0) {
                        e0.printStackTrace();
                    }finally {
                        jdbcUtil.result(conn, stam);

                    }
                }
            }
        });
        contentPane.add(btn1);
        //按钮—退出
        btn2=new JButton("退  出");
        btn2.setBounds(210, 210, 80, 23);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn2) {
                    dispose();
                }
            }
        });


        contentPane.add(btn2);
        //按钮-注册
        btn3=new JButton("注        册");
        btn3.setBounds(95,240,200, 23);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();//关闭登录窗体
                new Register().addMan(); // 打开注册窗体

            }
        });
        contentPane.add(btn3);
       contentPane.updateUI();
    }

    public static void main(String[] args) {
        new Login();
    }


}
