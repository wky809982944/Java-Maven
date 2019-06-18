package com.wangkakyi.数据库编程.连接数据库;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo01 {
    public static void main(String[] args) {
        String driverName = "com.mysql.jdbc.Driver";
        Connection conn;
        String uri = "jdbc:mysql://localhost:3306/jsu?user=root&password=jsu&useSSL=true";
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(uri);
            System.out.println(conn.getMetaData().getUserName());
            System.out.println(conn.getMetaData().getDatabaseProductName());
            System.out.println(conn.getMetaData().getDatabaseMajorVersion());
            System.out.println(conn.getMetaData().getDriverName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
