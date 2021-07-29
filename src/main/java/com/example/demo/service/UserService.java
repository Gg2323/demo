package com.example.demo.service;

import com.example.demo.bean.UserBean;
import com.example.demo.bean.UserData;

import java.util.List;

public interface UserService {

    UserBean info(String mobile);
    UserData login(String mobile , String password);
    void regis(String mobile ,String password,String name,String region);
    boolean delect (String mobile);
    List<UserBean> getAllInfo(String name);
    UserBean show(int id,String name);
    boolean updatePassword(String passwrod,String mobile);



}
