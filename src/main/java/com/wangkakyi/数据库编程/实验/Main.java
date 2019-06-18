package com.wangkakyi.数据库编程.实验;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

public class Main extends JFrame {
    DefaultTableModel tableModel;
    private static final int GAME_WIDTH = 1100;
    private static final int GAME_HEIGTH = 600;
    JPanel panelUP;	//增加信息的面板
    JTable table;
    Connection conn;
    PreparedStatement ps;
    /**
     * 构造方法
     */
    public Main() {
        setTitle("主界面");
        setSize(GAME_WIDTH, GAME_HEIGTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Vector rowData = PutinStorage.getRows();
        Vector columnNames = PutinStorage.getHead();
// 新建表格
        tableModel = new DefaultTableModel(rowData,columnNames);
        table = new JTable(tableModel);
        JScrollPane s = new JScrollPane(table);
        this.add(s);

        setBackground(Color.darkGray);
        setLocationRelativeTo(null);// 居中显示
        setVisible(true);


    }


}
