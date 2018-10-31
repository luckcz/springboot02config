package com.kaicom.springboot02config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Configuration:指明当前类是配置类，就是来代替之前的spring配置文件
 *
 */

import com.kaicom.springboot02config.service.HelloWorldService;
@Configuration
public class MyConfig {
	//将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
	@Bean
	public HelloWorldService helloWorldService(){
		return new HelloWorldService() ;
	}
}
