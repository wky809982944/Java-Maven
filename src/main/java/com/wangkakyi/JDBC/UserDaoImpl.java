/*
package com.wangkakyi.JDBC;

import Util.JDBCUtil;

import java.sql.*;

public class UserDaoImpl implements UserDao{
   @Override
    public void findAll(){
         //1.获取连接对象
       Connection conn = JDBCUtil.getConn();
       //创建statement对象
       Statement st = null;
       ResultSet rs = null;
       try {
           st = conn.createStatement();
           String sql ="select *from t_user";
            rs = st.executeQuery(sql);
            while(rs.next()){
                String userName = rs.getString("username");
                String password = rs.getString("password");
                System.out.println("userName = " + userName);
                System.out.println("password = " + password);
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }finally {
           JDBCUtil.release(conn, st, rs);
       }


   }

    @Override
    public void login(String username, String password) {
        Connection conn = null;
       Statement st = null;
        ResultSet rs = null;
       try {
        //1.获取连接对象
        conn = JDBCUtil.getConn();
        //创建statement对象
        String sql = "select * from t_user where  username=? and password=?";
        //预先对sql语句执行语法的校验，？对应的内容，后面不管传递什么进来把它看成是字符串
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);

            rs = ps.executeQuery();;
            if(rs.next()){
                String userName = rs.getString("username");
                String pwd = rs.getString("password");
                System.out.println(userName+"="+pwd);
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn, st, rs);
        }
    }

    @Override
    public void insert(String userName, String password) {
        Connection conn = null;
        PreparedStatement ps=null;
        try {
             conn = JDBCUtil.getConn();
            String sql = "insert into t_user values(null,?,?)";
             ps = conn.prepareStatement(sql);
             //给占位符赋值 从左到右数过来 1代表第一个问好，永远从第一个开始
            ps.setString(1, userName);
            ps.setString(2, password);
            int rs = ps.executeUpdate();
            if(rs>0)
                System.out.println("添加成功");
            else{
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps );
        }
    }

    @Override
    public void delete(int id) {
        Connection conn = null;
        PreparedStatement ps=null;
        try {
            conn = JDBCUtil.getConn();
            String sql = "delete from t_user where id =?";
            ps = conn.prepareStatement(sql);
            //给占位符赋值 从左到右数过来 1代表第一个问好，永远从第一个开始
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if(rs>0)
                System.out.println("删除成功");
            else{
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps );
        }
    }

    @Override
    public void update(int id,String name) {
        Connection conn = null;
        PreparedStatement ps=null;
        try {
            conn = JDBCUtil.getConn();
            String sql = "update  t_user set username =? where id =?";
            ps = conn.prepareStatement(sql);
            //给占位符赋值 从左到右数过来 1代表第一个问好，永远从第一个开始
            ps.setString(1, name);
            ps.setInt(2, id) ;
            int rs = ps.executeUpdate();
            if(rs>0)
                System.out.println("更新成功");
            else{
                System.out.println("更新失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps );
        }

    }
}
*/
