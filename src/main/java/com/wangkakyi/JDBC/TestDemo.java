/*
package com.wangkakyi.JDBC;


import com.wangkakyi.Util.JDBCUtil;
import org.junit.Test;

import java.sql.*;

*/
/**
 * 使用JUnit实行单元测试
 *//*

public class TestDemo {

    public void testQuery() {
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
            String sql = "select *from t_stu";
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

    @Test
    public void testInsert() {
        Connection con = null;

        Statement st = null;

        try {
            // 获取数据库连接
            con = con = JDBCUtil.getConn();
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");
            //创建statement,跟数据库打交道，一定需要这个对象
            st = con.createStatement();
            //执行添加

            String sql = "insert into student.t_stu values (null ,'aobama',59)";
            int result = st.executeUpdate(sql);
            if (result > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("数据库操作失败！");
        } finally {
            JDBCUtil.release(con, st);
        }
    }

    @Test
    public void testDelete() {
        Connection con = null;

        Statement st = null;

        try {
            // 获取数据库连接
            con = con = JDBCUtil.getConn();
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");
            //创建statement,跟数据库打交道，一定需要这个对象
            st = con.createStatement();
            //执行添加

            String sql = "delete from student.t_stu where name='aobama' ";
            int result = st.executeUpdate(sql);
            if (result > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("数据库操作失败！");
        } finally {
            JDBCUtil.release(con, st);
        }
    }

    @Test
    public void testUpdate() {
        Connection con = null;

        Statement st = null;

        try {
            // 获取数据库连接
            con = con = JDBCUtil.getConn();
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");
            //创建statement,跟数据库打交道，一定需要这个对象
            st = con.createStatement();
            //执行添加

            String sql = "update  student.t_stu set age =55 where name='aobama' ";
            int result = st.executeUpdate(sql);
            if (result > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("数据库操作失败！");
        } finally {
            JDBCUtil.release(con, st);
        }
    }

    @Test
    public void testTransaction() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
             conn = JDBCUtil.getConn();
             //默认的连接，事务默认就是自动提交的。关闭自动提交
            conn.setAutoCommit(false);
            String sql = "update account set money =money-? where id=?";
            ps = conn.prepareStatement(sql);
            //扣ID为1 100块钱
            ps.setInt(1,100 );
            ps.setInt(2,1 );
            ps.executeUpdate();
            //给ID 为2加100块
            ps.setInt(1,-100 );
            ps.setInt(2,2 );
            ps.executeUpdate();
           //成功：提交事务
            conn.commit();
        } catch (SQLException e) {
            //回滚
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }

}
*/
