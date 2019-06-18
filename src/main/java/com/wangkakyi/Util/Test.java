package com.wangkakyi.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            Connection conn = JDBCUtil02.getConn();
            conn.prepareStatement(null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
