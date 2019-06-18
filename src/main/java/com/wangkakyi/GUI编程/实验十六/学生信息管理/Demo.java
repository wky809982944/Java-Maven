package com.wangkakyi.GUI编程.实验十六.学生信息管理;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

class WinTable extends JFrame{
    private JFrame frame;
    private JButton previous=new JButton("上一页");
    private JButton next=new JButton("下一页");
    private Container con=this.getContentPane();
    private Object data[][]= {{"20160001","孙悟空","22","男","高级","88","花果山",
           },{"20160002","猪八戒","26","男","高级","82","福陵山云栈洞"}};
    private Object title[]= {"学号","姓名","年龄","性别","功力","成绩","住址"};
    private JTable table=new JTable(data,title);
    private JLabel label[]=new JLabel[10];
    public WinTable(){
        this.setTitle("学生信息管理系统");
        this.setSize(1200, 300);
        this.setLocation(500, 300);


        table.setRowHeight(30);
        table.setFont(new Font("宋体",Font.BOLD,20));
        table.getTableHeader().setFont(new Font("宋体",Font.BOLD,20));
        con.add(new JScrollPane(table), BorderLayout.CENTER);


        this.setVisible(true);
        this.validate();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
public class Demo {
    public static void main(String[] args) {
        new WinTable();
    }
}
