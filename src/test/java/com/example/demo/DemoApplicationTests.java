package com.example.demo;

import com.example.demo.bean.UserBean;
import com.example.demo.bean.UserData;
import com.example.demo.service.UserService;
import com.example.demo.util.JsonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.awt.*;
import java.awt.image.ImageObserver;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class DemoApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		boolean bo= userService.delect("11123");
		System.out.println(bo);

	}

}
