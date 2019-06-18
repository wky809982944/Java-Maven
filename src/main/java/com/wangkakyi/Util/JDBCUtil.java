package com.wangkakyi.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    private static String url=null;
    private static String name=null;
    private static String password=null;
    private static String driverClass=null;
    static {
        //1.创建一个属性配置对象

        try {
            //1.创建一个属性配置对象
            Properties properties = new Properties();
            InputStream is= new FileInputStream("src/JDBC/jdbc.properties");
            //导入输入流
            properties.load(is);
            //读取属性
            driverClass =properties.getProperty("driverClass");
            url = properties.getProperty("url");
            name = properties.getProperty("name");
            password = properties.getProperty("password");

            properties.getProperty("driverClass");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        Connection conn = null;

        try {
            Class.forName(driverClass);

                conn = DriverManager.getConnection(url, name,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }
     public  static void release(Connection conn,Statement st, ResultSet rs){
         closeRs(rs);
         closeSt(st);
         closeConn(conn);
     }
     public  static void release(Connection conn,Statement st){
         closeSt(st);
         closeConn(conn);
     }

        private static void closeRs(ResultSet rs){
            try{
                if(rs !=null){
                    rs.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                rs = null;
            }
        }
        private static void closeSt(Statement st){
            try{
                if(st !=null){
                    st.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                st = null;
            }
        }
        private static void closeConn(Connection conn){
            try{
                if(conn !=null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                conn = null;
            }
        }

}
