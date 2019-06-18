package com.wangkakyi.数据库编程.数据库查询;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection(String driverName, String uri
    ) {
        Connection connection = null;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(uri);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return connection;
        }
    }

    public static Connection getConnection(String driverName, String uri,String user,String password
    ) {
        Connection connection = null;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(uri,user,password );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return connection;
        }
    }
}
