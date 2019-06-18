package com.wangkakyi.GUI编程.制作表格;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
class WinTable extends JFrame implements ActionListener,FocusListener{
    private Container con=this.getContentPane();
    private Object data[][]= {{"孙悟空","88","99","0"},
            {"猪八戒","55","69","0"},
            {"唐僧","92","89","0"}};
    private Object title[]= {"姓名","英语成绩","数学成绩","总成绩"};
    private JButton button=new JButton("计算每人总成绩");
    private JTable table=new JTable(data,title);
    public WinTable() {
        this.setTitle("表格案例");
        this.setSize(500, 300);
        this.setLocation(500, 300);
        con.add(new JLabel("修改输入数据后，需回车确认"),BorderLayout.NORTH);
        con.add(button, BorderLayout.SOUTH);
        table.setRowHeight(30);
        table.setFont(new Font("宋体",Font.BOLD,20));
        table.getTableHeader().setFont(new Font("宋体",Font.BOLD,20));
        con.add(new JScrollPane(table), BorderLayout.CENTER);
        button.addActionListener(this);
        table.addFocusListener(this);
        this.setVisible(true);
        this.validate();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void calculateTotal() {
        for(int i=0;i<data.length;i++) {
            double sum=0;
            boolean boo=true;
            for(int j=1;j<=2;j++) {
                try {
                    sum=sum+Double.parseDouble(data[i][j].toString());
                }catch(Exception e) {
                    boo=false;
                    table.repaint();
                }
                if(boo==true) {
                    data[i][3]=""+sum;
                    table.repaint();
                }
            }
        }
    }
    public void focusGained(FocusEvent e) {
    }
    public void focusLost(FocusEvent e) {

    }
    public void actionPerformed(ActionEvent e) {
        this.calculateTotal();
    }

}
public class Demo01 {
    public static void main(String[] args) {
        new WinTable();
    }
}
