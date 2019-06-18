package com.wangkakyi.IO系统.缓冲流;

import java.io.*;

public class Demo01 {
    public static void main(String[] args){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        File src = new File("/home/wky/IdeaProjects/Java/src/IO系统/缓冲流/core.txt");
        File dest = new File("/home/wky/IdeaProjects/Java/src/IO系统/缓冲流/coreback.txt");
        System.out.println("源文件长度:" + src.length() + "字节");
        System.out.println("目标文件长度:" + dest.length() + "字节");
        try {
            br = new BufferedReader(new FileReader(src));
            bw = new BufferedWriter(new FileWriter(dest));
            String temp = null;
            bw.write(new String("社会主义核心价值观"));
            bw.newLine();
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
                String regex="[^\\u4e00-\\u9fa5]";
                String term = temp.replaceAll(regex, "");
                bw.write(term, 0, temp.length());
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                //fr.close();
                br.close();
                bw.flush();
                //fw.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
