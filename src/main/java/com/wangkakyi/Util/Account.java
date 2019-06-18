package com.wangkakyi.Util;

public class Account {
    private int id;
    private String name;
    private int money;
    public int getId() {
        return id;
    }

    public Account() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
