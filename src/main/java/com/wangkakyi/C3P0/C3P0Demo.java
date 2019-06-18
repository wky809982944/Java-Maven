/*
package com.wangkakyi.C3P0;

import Util.JDBCUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.*;

public class C3P0Demo {
    @Test
    public void test(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = dataSource.getConnection();
String sql = "insert into account values(null,?,?)";
            ps.setString(1, "wangwu");
            ps.setInt(2, 1000);
            ps.executeUpdate();

             sql="select * from account where id=?";
            //4.获取执行sql语句的对象
            ps = conn.prepareStatement(sql);

            //5.设置参数
            ps.setInt(1,1);
            //6.执行
            ResultSet rs = ps.executeQuery();
            //7.处理结果集
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn, ps);
        }

    }
}
*/
