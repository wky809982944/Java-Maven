package com.wangkakyi.GUI编程.制作菜单;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyMenu{
    private JFrame frame=new JFrame("文件1-----文本编辑器");
    private JMenuBar bar=new JMenuBar();
    private JMenu menuFile=new JMenu("文件");
    private JMenu menuEdit=new JMenu("编辑");
    //菜单项
    private JMenuItem menuItemNew=new JMenuItem("新建");
    private JMenuItem menuItemOpen=new JMenuItem("打开");
    private JMenuItem menuItemClose=new JMenuItem("关闭");
    private JMenuItem menuItemSave=new JMenuItem("保存");
    private JMenuItem menuItemCopy=new JMenuItem("复制");
    private JMenuItem menuItemPaste=new JMenuItem("粘贴");
    private JTextArea text=new JTextArea();
    private String copyInfo;//保存复制信息
    //构造方法初始化菜单
    public MyMenu(){
        //准备窗体
        frame.setSize(600,300);
        frame.setLocation(450,200);
        //在面板中加入带滚动条的文本框
        text.setFont(new Font("华文新魏",Font.BOLD,20));
        frame.getContentPane().add(new JScrollPane(text));
        //1.把菜单条加入到JFrame中
        frame.setJMenuBar(bar);
        //2.把菜单加入到JMenuBar中
        bar.add(menuFile);
        bar.add(menuEdit);
        //3.把菜单项加入到菜单中
        //===3.1向文件菜单和编辑菜单加入菜单项
        menuFile.add(menuItemNew);
        menuFile.add(menuItemOpen);
        menuFile.add(menuItemClose);
        menuFile.addSeparator();
        menuFile.add(menuItemSave);
        //3.2向编辑菜单加入菜单项
        menuEdit.add(menuItemCopy);
        menuEdit.add(menuItemPaste);
        //4.向所有菜单增加监听器
        menuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("开始新建一个文件\n");
            }
        });
        menuItemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("开始打开一个文件\n");
            }
        });
        menuItemClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("关闭文件\n");
            }
        });
        menuItemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("保存文件\n");
            }
        });
        menuItemCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyInfo=text.getSelectedText();//取得文本框中选中的文本
                System.out.println("复制信息："+copyInfo+"\n");
            }
        });
        menuItemPaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append(copyInfo+"\n");
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class Demo01 {
    public static void main(String[] args) {
        new MyMenu();
    }
}
