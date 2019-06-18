package com.wangkakyi.数据库编程.预编译语句;



import com.wangkakyi.数据库编程.数据库查询.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DMLDemo {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String driverName;
    private String uri;

    public DMLDemo(String driverName, String uri) {
        this.driverName = driverName;
        this.uri = uri;
        this.conn = MyConnection.getConnection(driverName, uri);
    }

    public void queryStudent(ResultSet rs) {
        try {
            int colCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i < colCount; i++) {
                    System.out.print(rs.getString(i) + "\t");

                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void query_1(String sql, String name) {
        try {
            this.pstmt = conn.prepareStatement(sql);
            this.pstmt.setString(1, name);
            rs = this.pstmt.executeQuery();
            queryStudent(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void query_2(String sql, String minMath,String maxMath) {
        try {
            this.pstmt = conn.prepareStatement(sql);
            this.pstmt.setString(1, minMath);
            this.pstmt.setString(2, maxMath);
            rs = this.pstmt.executeQuery();
            queryStudent(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insert_3(String sql, String id,String name,String age,String birthday) {
        try {
            this.pstmt = conn.prepareStatement(sql);
            this.pstmt.setString(1, id);
            this.pstmt.setString(2, name);
            this.pstmt.setString(3, age);
            this.pstmt.setString(4, birthday);
            this.pstmt.executeUpdate();
            queryStudent(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update_4(String sql, String english, String phone) {
        try {
            this.pstmt = conn.prepareStatement(sql);
            this.pstmt.setString(1, english);
            this.pstmt.setString(2,phone);
            this.pstmt.executeUpdate();
            queryStudent(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        String driverName = "com.mysql.cj.jdbc.Driver";
        Connection conn;
        String uri = "jdbc:mysql://localhost:3306/jsu?user=root&password=feng_sha&useSSL=true";
        String sql;
        DMLDemo dml = new DMLDemo(driverName, uri);
        System.out.println("显示所有");
        String sql2 = "";
        ResultSet rs2 = dml.conn.createStatement().executeQuery(sql2);
        dml.queryStudent(rs2);
        sql = "select name,phone from student where name =?";
        dml.query_1(sql, "观音");
        String sql3 = "select *from student where ?<math and math < ?";
        dml.query_2(sql3,"90", "60");
        String sql4 = "insert into student(id,name,age,birthday) values(?,?,?,?)";
        dml.insert_3(sql4, "jsu999", "玉皇大帝", "50", "1968-01-01");
        dml.close();
    }
}
