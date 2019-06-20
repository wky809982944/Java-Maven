package com.wangkakyi.Util;


import org.junit.Test;

import java.sql.*;


public class CommonCRUDUtil {

    class A implements ResultSetHandler<Account> {

        /*public void handle(ResultSet rs){
            try {
                while (rs.next()) {
                    String name = rs.getString("name");
                    int money = rs.getInt("money");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }*/
        public Account handle(ResultSet rs) {
            try {
                Account account = new Account();
                while (rs.next()) {

                    String name = rs.getString("name");
                    int money = rs.getInt("money");
                    account.setName(name);
                    account.setMoney(money);
                }
                return account;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

    }
    @Test
    public void testQuery(){
/*
        Account account = query("select *from account where id =?", new A(), 3);
*/
        /*Account account = query("select *from account where id =?", new ResultSetHandler<List<Account>>() {
            @Override
            public List<Account> handle(ResultSet rs) {
                return null;
            }
        }, 3);*/
        //System.out.println(account.toString());
    }
    @Test
    public void testUpdate(){
         //update("insert into account values(null,?,?)", "aa",10);
         //update("delete from account where id =?",8);
        update("update account set money=? where id =?", 800,3);
    }
    //通用的增删改功能

    /**
     *
     * @param sql 需要操作的sql语句
     * @param args 可变参数
     */
    public void update(String sql,Object ...args)  {

        PreparedStatement ps = null;
        Connection conn = null;
        try {
             conn = JDBCUtil02.getConn();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil02.release(conn, ps);
        }

    }
    public void update02(String sql,Object ...args)  {

        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = JDBCUtil02.getConn();
            ps = conn.prepareStatement(sql);
            /*for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }*/
            //元数据
            ParameterMetaData metaData = ps.getParameterMetaData();
            int count = metaData.getParameterCount();
            for (int i = 0; i < count; i++) {
                ps.setObject(i+1, args[i]);
            }

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil02.release(conn, ps);
        }

    }
    public  <T>T query(String sql, ResultSetHandler<T> handler, Object ...args){
        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = JDBCUtil02.getConn();
            ps = conn.prepareStatement(sql);
            ParameterMetaData metaData=ps.getParameterMetaData();
            int count = metaData.getParameterCount();

            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            ResultSet rs = ps.executeQuery();
            T t = (T) handler.handle(rs);
            return t;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil02.release(conn, ps);
        }
        return null;
    }
}
