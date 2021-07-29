package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.bean.UserData;
import com.example.demo.service.UserService;
import com.example.demo.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class infoController {

    @Autowired
    UserService userService;




    @RequestMapping("/info")
    public String show(){
        return "info";
    }

    @RequestMapping("/regis")
    public  String regisShow() {
        return  "regis";
    };

    @RequestMapping("/login")
    public  String loginShow() {
        return  "login";
    };




    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<UserBean> info(String mobile){
        UserBean userBean=userService.info(mobile);
        if (userBean!=null){
            return new JsonResult<>(userBean);
        }else {

            return new JsonResult("01","手机号输入错误");
        }
    }

    @RequestMapping(value = "/getAllInfo/{name}",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult<List> getAllInfo( @PathVariable String name){
        List<UserBean> beans=userService.getAllInfo(name);
        if (beans!=null){
            return  new JsonResult<>(beans,"","00");
        }
        return new JsonResult("00","SECEESS");
    }


    @RequestMapping(value = "/regis", method=RequestMethod.POST)
    @ResponseBody
    public JsonResult regis(@PathVariable String mobile, String password , String name, String region){

         userService.regis(mobile,password,name,region);
         if (userService.info(mobile)!=null){
             return new JsonResult("00","注册成功");
         }else{
             return new JsonResult("01","注册失败" );

         }

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<UserData> login(String mobile ,String password){
        UserData userData=userService.login(mobile,password);
        if (userData!=null){
            return new JsonResult(userData,"登录成功","00");
        }


            return new JsonResult("01","检查账号密码");

    }

    @RequestMapping(value = "/delect" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResult delect(String mobile){
         boolean bo= userService.delect(mobile);
         System.out.println(bo+"---------------------------------");
         if (bo==true){
             return new JsonResult("00","注销成功");
         }
         return new JsonResult("01","输入错误");
    }


    @PostMapping(value = "/show")
    @ResponseBody
    public JsonResult show(int id,String name){
        UserBean userBean=userService.show(id,name);
        return new JsonResult(userBean,"sd","00");

    }

    @PostMapping(value = "/update")
    @ResponseBody
    public JsonResult update(String password,String mobile){
        Boolean status=userService.updatePassword(password,mobile);

        if (status==true){
            return new JsonResult("00","修改成功");
        }
        return new JsonResult("01","修改失败");
    };

}


