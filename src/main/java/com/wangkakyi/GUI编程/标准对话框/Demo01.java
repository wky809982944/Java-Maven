package com.wangkakyi.GUI编程.标准对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo01 {
    private JFrame frame = new JFrame("标准对话框");
    private JLabel lblNorth = new JLabel("请选择操作");
    private JTextArea txt = new JTextArea(10, 20);
    private JPanel panSouth = new JPanel(new FlowLayout());
    private JButton btnMsg = new JButton("显示");
    private JButton btnInput = new JButton("输入");
    private JButton btnCon = new JButton("确认清空");
    private JButton btnOption = new JButton("选择字体");


    public void init() {
        frame.setSize(400, 300);
        frame.setLocation(500, 200);
        frame.setLayout(new BorderLayout());
        frame.add(lblNorth, BorderLayout.NORTH);
        frame.add(new JScrollPane(txt), BorderLayout.CENTER);
        panSouth.add(btnMsg);
        panSouth.add(btnInput);
        panSouth.add(btnCon);
        panSouth.add(btnOption);
        frame.add(panSouth, BorderLayout.SOUTH);
        btnMsg.addActionListener(new ActionListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnMsg, "撸起袖子加油干", "消息", JOptionPane.INFORMATION_MESSAGE);
                txt.append("显示消息对话框\n");
            }
        });
        btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strTemp = JOptionPane.showInputDialog(btnInput, "请输入下一个字符");
                try {
                    double num = Double.parseDouble(strTemp);
                    txt.append(num + "+" + num + "+" + "=" + (num + num) + "\n");
                } catch (NumberFormatException ex) {
                    txt.append(strTemp + "不是数字字符串，请重新输入");
                }
            }
        });
        btnCon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = JOptionPane.showConfirmDialog(btnCon, "您确定要删除文本框中的内容么", "确认", JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    txt.setText("");

                } else {
                    txt.append("显示确认对话框，您选择了否");
                }
            }
            });
        btnOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] fonts = {"宋体", "隶书", "楷体"};
                int option = JOptionPane.showOptionDialog(btnOption, "选择字体", "选择", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fonts, fonts[0]);
                if (option != JOptionPane.CLOSED_OPTION) {
                    txt.append("显示选择对话框！字体：" + fonts[option] + "\n");
                    txt.setFont(new Font(fonts[option].toString(), Font.BOLD, 30));

                }
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public static void main(String[] args) {
        new Demo01().init();
    }
    }

