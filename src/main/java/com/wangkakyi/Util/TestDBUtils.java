package com.wangkakyi.Util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class TestDBUtils {
    @Test
    public void testInsert() throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        queryRunner.update("insert into account values(null,?,?)", "aa", 1000);

    }
    @Test
    public void testQuery() throws SQLException{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);

            List<Account> list = queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
            for (Account account : list) {
                System.out.println(account);
            }

    }
}
