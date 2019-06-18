package com.wangkakyi.数据库编程.数据库查询;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        Statement statement = null;
        Result result;
        String driverName = "com.mysql.cj.jdbc.Driver";
        String uri = "jdbc:mysql://localhost:3306/jsu?user=root&password=feng_sha&useSSL=true";
        Connection connection = MyConnection.getConnection(driverName, uri);
        /*String sql = "select name,sex,phone from student";*/
        String sql = "select name,sex,phone from student where name ='牛魔王'";
         statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.print("姓名" +rs.getString(1)+" ");
            System.out.print("\t年龄" + rs.getString(2) + " ");
            System.out.print("\t电话" + rs.getString(3) + " ");
            System.out.println();
        }
        rs.close();
        statement.close();
        connection.close();
    }
}
