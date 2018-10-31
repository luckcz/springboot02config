package com.kaicom.springboot02config.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value = {"classpath:user.properties"})
@ConfigurationProperties(prefix = "user")
public class UserBean {
	private String id ;
	private String userName ;
	private Integer userAge ;
	private Map<String,Object> map ;
	private List<String>  like;
	private CatBean car ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<String> getLike() {
		return like;
	}
	public void setLike(List<String> like) {
		this.like = like;
	}
	public CatBean getCar() {
		return car;
	}
	public void setCar(CatBean car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", userAge=" + userAge + ", map=" + map + ", like="
				+ like + ", car=" + car + "]";
	}
}
