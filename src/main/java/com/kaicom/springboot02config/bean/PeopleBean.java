package com.kaicom.springboot02config.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
@ConfigurationProperties(prefix = "person") 默认从全局变量文件中读取
 */
//@PropertySource(value = {"classpath:application.yml"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class PeopleBean {
	//@Email
	//@Value(value = "${person.lastName}")
	private String lastName ;
	private Integer age ;
	private Boolean boss ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth ;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date cTime ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date uTime ;
	private Map maps ;
	private String[] like ;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map getMaps() {
		return maps;
	}
	public void setMaps(Map maps) {
		this.maps = maps;
	}
	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public Date getcTime() {
		return cTime;
	}
	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
	public Date getuTime() {
		return uTime;
	}
	public void setuTime(Date uTime) {
		this.uTime = uTime;
	}
	@Override
	public String toString() {
		return "PeopleBean [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", cTime="
				+ cTime + ", uTime=" + uTime + ", maps=" + maps + ", like=" + Arrays.toString(like) + "]";
	}
}
