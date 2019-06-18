package com.wangkakyi.Util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil02 {
    static ComboPooledDataSource dataSource = null;

    static {
        dataSource = new ComboPooledDataSource();
    }
    public static Connection getConn() throws SQLException {



        return dataSource.getConnection();

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
