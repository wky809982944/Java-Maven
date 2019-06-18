/*
package com.wangkakyi.连接池;


import com.wangkakyi.Util.JDBCUtil;
import com.wangkakyi.Util.MyDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.SQLException;

public class TestPool {
    @Test
    public void testPool(){
        Connection conn = null;
        PreparedStatement ps = null;
        MyDataSource dataSource = new MyDataSource();
        try {
             conn = dataSource.getConnection();
            String sql="insert into account values (null,'xilali',10)";
             ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //dataSource.addBack(conn);
            JDBCUtil.release(conn,ps );
        }
    }
}
*/
