package com.wangkakyi.数据库编程.实验;

public class User {
    private String password;
    private String username;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
