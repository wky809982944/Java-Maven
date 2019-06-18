package com.wangkakyi.数据库编程.实验;

import java.sql.*;
import java.util.Vector;

public class PutinStorage {
    // 得到数据库表数据
    public static Vector getRows(){
        Connection conn;
        PreparedStatement preparedStatement = null;

        Vector rows = null;
        Vector columnHeads = null;

        try {
            conn = jdbcUtil.getConnection();    //连接数据库
//			if(!conn.isClosed())
//				System.out.println("成功连接数据库");
            preparedStatement = conn.prepareStatement("select * from user");
            ResultSet result1 = preparedStatement.executeQuery();
            rows = new Vector();

            ResultSetMetaData rsmd = result1.getMetaData();

            while(result1.next()){
                rows.addElement(getNextRow(result1,rsmd));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("未成功加载驱动。");
            e.printStackTrace();
        }
        return rows;
    }

    // 得到数据库表头
    public static Vector getHead(){
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        Vector columnHeads = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");		//连接驱动
            conn = jdbcUtil.getConnection();	//连接数据库
//			if(!conn.isClosed())
//				System.out.println("成功连接数据库");
            preparedStatement = conn.prepareStatement("select * from user");
            ResultSet result1 = preparedStatement.executeQuery();

            boolean moreRecords = result1.next();
            columnHeads = new Vector();
            ResultSetMetaData rsmd = result1.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount(); i++)
                columnHeads.addElement(rsmd.getColumnName(i));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("未成功加载驱动。");
            e.printStackTrace();
        }
        return columnHeads;
    }

    // 得到数据库中下一行数据
    private static Vector getNextRow(ResultSet rs,ResultSetMetaData rsmd) throws SQLException{
        Vector currentRow = new Vector();
        for(int i = 1; i <= rsmd.getColumnCount(); i++){
            currentRow.addElement(rs.getString(i));
        }
        return currentRow;
    }

	/*//主函数
	 public static void main(String[] args){
		 getRows();
	}*/
}
