package com.wangkakyi.JDBC;

/**
 * 定义操作数据库的方法
 */
public interface UserDao {
    /**
     * 查询
     */
    void findAll();
    void login(String username, String password);
    /**
     * 执行添加
     */
    void insert(String userName, String password);
    void delete(int id);

    /**
     * 根据id更新名字
     * @param id
     * @param name
     */
    void update(int id, String name);

}
