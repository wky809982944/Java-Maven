package com.wangkakyi.数据库编程.DML;




import com.wangkakyi.数据库编程.数据库查询.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class SQLStudent {
    private Statement stmt;
    private ResultSet rs;
    private String driverName;
    private String uri;
    private Connection conn;

    public SQLStudent(String driverName, String uri) {
        try {
            this.driverName = driverName;
            this.uri = uri;
            conn = getConn();
            this.stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection getConn() {
        return MyConnection.getConnection(driverName, uri);
    }

    public void queryStudent(String sql) {
        try {
            rs = stmt.executeQuery(sql);
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println("\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String sql) {
        try {
            this.stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(String sql) {
        try {
            this.stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(String sql) {
        try {
            this.stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeALL() {
        try {
            if (rs != null) {
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Demo01 {
    public static void main(String[] args) {
        String driverName = "com.mysql.cj.jdbc.Driver";
        String uri = "jdbc:mysql://localhost:3306/jsu?user=root&password=feng_sha&useSSL=true";
        SQLStudent sqlStudent = new SQLStudent(driverName, uri);
       /* String sql1 = "insert into student values('jsu008','观音','女',28,88,82,'13574400008','1990-09-12')";
        sqlStudent.insertStudent(sql1);*/
        String sql2 = "delete from student where math>90";
        sqlStudent.deleteStudent(sql2);
        String sql3 = "update student set phone ='15874400001' where name ='猪八戒'";
        sqlStudent.updateStudent(sql3);
        String sql5 = "select * from student";
        sqlStudent.queryStudent(sql5);

    }
}
