package com.wangkakyi.GUI编程.实验十六.图片浏览器;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
public class T implements ActionListener{
    private Frame frame;
    private MyCanvas mc ;
    private String fpath;
    private String fname;
    private File[] files;
    private int findex ;
    private FileDialog fd_load;
    private MyFilter filter;
    private Button previous ;
    private Button next ;
    public static void main( String args[]) throws Exception {
        new T().init();
    }
    public void init(){
        frame = new Frame("PictureViewer");
        Panel pb = new Panel();
        Button select = new Button("选择图片");
        previous = new Button("上一张");
        next = new Button("下一张");
        select.addActionListener(this);
        previous.addActionListener(this);
        next.addActionListener(this);
        pb.add(select);
        pb.add(previous);
        pb.add(next);
        mc = new MyCanvas();
        mc.setBackground(new Color(200,210,230));
        mc.addComponentListener(mc);
        frame.add(pb,"North");
        frame.add(mc,"Center");
        frame.setSize(360,360);
        frame.setLocation(400,200);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.setVisible(true);
        this.validateButton();
        filter = new MyFilter();
        fd_load = new FileDialog(frame,"打开文件",FileDialog.LOAD);
        fd_load.setFilenameFilter(filter);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("选择图片")){
            fd_load.setVisible(true);
            fpath = fd_load.getDirectory();
            fname = fd_load.getFile();
            if((fpath != null) && (fname != null)){
                this.display(new File(fpath + fname));
                files = new File(fpath).listFiles(filter);
                this.setIndex();
            }
        }else if(command.equals("上一张")){
            findex--;
            if(findex<0)
                findex = 0;
            this.display(files[findex]);
        }else if(command.equals("下一张")){
            findex++;
            if(findex >= files.length)
                findex = files.length-1;
            this.display(files[findex]);
        }
        this.validateButton();
    }
    public void display(File f){
        try{
            BufferedImage bi = ImageIO.read(f);
            mc.setImage(bi);
            frame.setTitle("PictureViewer - [" +  f.getName() + "]");
        }catch(Exception e){
            e.printStackTrace();
        }
        mc.repaint();
    }
    public void setIndex(){
        File current = new File(fpath + fname);
        if(files != null){
            for(int i=0;i<files.length;i++){
                if(current.equals(files[i])){
                    findex = i;
                }
            }
        }
    }
    public void validateButton(){
        previous.setEnabled((files!=null) && (findex > 0));
        next.setEnabled((files!=null) && (findex<(files.length-1)));
    }
}
