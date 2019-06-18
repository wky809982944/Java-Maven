package com.wangkakyi.JDBC;



import com.wangkakyi.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;

        try {
            // 获取数据库连接
            con = con = JDBCUtil.getConn();
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");
            //创建statement,跟数据库打交道，一定需要这个对象
            st = con.createStatement();
            //执行查询，得到结果集
            String sql = "";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("id = " + id);
                System.out.println("name = " + name);
                System.out.println("age = " + age);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("获取数据库连接失败！");
        } finally {
            JDBCUtil.release(con, st, rs);
        }

        }

    }


