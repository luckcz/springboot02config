package com.kaicom.springboot02config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.kaicom.springboot02config.bean.PeopleBean;
import com.kaicom.springboot02config.bean.UserBean;
/**
 * @author PF22H0G
 * springboot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02configApplicationTests {

	@Autowired
	private PeopleBean peopleBean ;

	@Autowired
	private UserBean userBean ;

	@Autowired
	private ApplicationContext ioc ;

	@Test
	public void containsBean() {
		boolean flag = ioc.containsBean("helloWorldService");
		System.out.println(flag);
	}


	@Test
	public void contextLoads() {
		System.out.println(peopleBean);
	}

	@Test
	public void getUser() {
		System.out.println(userBean);
	}

}
