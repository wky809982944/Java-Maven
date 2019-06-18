package com.wangkakyi.GUI编程.制作树;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class WinTree extends JFrame implements TreeSelectionListener {
    private JTree tree;
    private JTextArea txt = new JTextArea(10, 20);
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("学校管理");
    private DefaultMutableTreeNode nodeTch = new DefaultMutableTreeNode("教师");
    private DefaultMutableTreeNode nodeStd = new DefaultMutableTreeNode("学生");
    private DefaultMutableTreeNode nodeKZ = new DefaultMutableTreeNode(new Teacher("孔子", 2600,"国学系"));
    private DefaultMutableTreeNode nodeMZ = new DefaultMutableTreeNode(new Teacher("孟子",2300,"国学系"));
    private DefaultMutableTreeNode nodeZL = new DefaultMutableTreeNode(new Student("子路", 20, "101"));
    private DefaultMutableTreeNode nodeZY = new DefaultMutableTreeNode(new Student("子游", 25, "202"));
    private DefaultMutableTreeNode nodeZYuan = new DefaultMutableTreeNode(new Student("子渊", 20, "203"));



    public WinTree() {
        this.setTitle("学校");
        this.setSize(new Dimension(400, 300));
        this.setLocation(new Point(500,300));
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(txt), BorderLayout.EAST);
        tree = new JTree(root);
        this.add(new JScrollPane(tree));
        root.add(nodeTch);
        root.add(nodeStd);
        nodeTch.add(nodeKZ);
        nodeTch.add(nodeMZ);
        nodeStd.add(nodeZL);
        nodeStd.add(nodeZY);
        nodeStd.add(nodeZYuan);
        tree.addTreeSelectionListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (node.isLeaf()) {
            Object per = node.getUserObject();
            txt.setText(per.toString());

        }else{
            txt.setText("请选择教师或学生");
        }
    }
}
