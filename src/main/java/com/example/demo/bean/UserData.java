package com.example.demo.bean;

public class UserData {


    private int id;
    private int user_id;
    private double amount;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User_Data{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", amount=" + amount +
                ", level=" + level +
                '}';
    }
}
