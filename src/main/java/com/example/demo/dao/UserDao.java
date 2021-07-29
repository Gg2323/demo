package com.example.demo.dao;

import com.example.demo.bean.UserBean;
import com.example.demo.bean.UserData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

      UserBean getInfo(String mobile);

      //返回数组类型的数据
      List<UserBean> getAllInfo(String name);

      UserData login(String mobile ,String password);

      void regis(String mobile ,String password,String name,String region);

      boolean updatePassword(String password,String mobile);

      boolean delete(String mobile);

      UserBean show(@Param(value = "id") Integer id, @Param(value = "name") String name);


}
