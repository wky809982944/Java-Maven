package com.wangkakyi.Util;



import com.wangkakyi.连接池.ConnectionWrap;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 这是一个数据库连接池
 * 1.一开始先往池子里面放10个链接
 * 2.来的程序通过getConnection获取链接
 * 3.用完之后，使用addBack归还链接
 * 4.扩容
 * 问题
 * 1.需要额外记住addBack方法
 * 2.单例
 * 3.无法面向接口编程
 * 因为接口里面没有定义addBack方法。
 * 4。怎么解决
 *
 */
public class MyDataSource implements DataSource {
    List<Connection> list = new ArrayList<>();
    public MyDataSource() {
        for (int i = 0; i < 10; i++) {
            Connection conn = JDBCUtil.getConn();
            list.add(conn);
        }

    }

    //该连接池对外公布的获取方法
    @Override
    public Connection getConnection() throws SQLException {
        //来拿链接的时候，先看看，池子里面还有没有
        if (list.size() == 0) {
            for (int i = 0; i < 5; i++) {
                Connection conn = JDBCUtil.getConn();
                list.add(conn);
            }
        }
        Connection conn = list.remove(0);
        //在把这个对象抛出去的时候，对这个对象进行包装
        Connection connection = new ConnectionWrap(conn, list);
        return connection ;
    }

    public void addBack(Connection conn) {
        list.add(conn);
    }
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
