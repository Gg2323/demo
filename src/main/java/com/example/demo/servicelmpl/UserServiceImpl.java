package com.example.demo.servicelmpl;

import com.example.demo.bean.UserBean;
import com.example.demo.bean.UserData;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



    @Override
    public UserBean info(String mobile) {
        return userDao.getInfo(mobile);
    }

    @Override
    public UserData login(String mobile , String password){
            return userDao.login(mobile,password);
    }

    @Override
    public void regis(String mobile ,String password,String name,String region){
        userDao.regis(mobile,password,name,region);

    }



    @Override
    public boolean delect(String mobile){
          Boolean  boobea=userDao.delete(mobile);
          return  boobea;

    };

    @Override
    public boolean updatePassword(String passwrod, String mobile) {
        Boolean status=userDao.updatePassword(passwrod,mobile);
        return  status;
    }



    @Override
    public List<UserBean> getAllInfo(String name){

        return userDao.getAllInfo(name);
    };

    @Override
    public UserBean show(int id,String name){
        return userDao.show(id,name);
    };


}
