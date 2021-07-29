package com.example.demo.bean;


public class UserBean {
    private String mobile;
    private int id;
    private String name;
    private String password;
    private String create_time;
    private String region;

    public String getMobile() {
    return mobile;
}

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "mobile='" + mobile + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", create_time='" + create_time + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
