package com.kaicom.springboot02config.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaicom.springboot02config.bean.PeopleBean;
import com.kaicom.springboot02config.bean.UserBean;

@RestController
public class FirstController {
	@Resource
	private PeopleBean peopleBean ;

	@Autowired
	private UserBean userBean ;

	@RequestMapping("/getMsg")
	public Map<String,Object> getMsg(){
		Map<String,Object> map = new LinkedHashMap<>();
		List<Map<String,Object>> list = new ArrayList<>();
		for(int i = 1 ; i <= 10 ; i++){
			Map<String,Object> mapTemp = new LinkedHashMap<>();
			mapTemp.put("userName", "张三"+i);
			mapTemp.put("userAge", i);
			mapTemp.put("type", "circle");
			list.add(mapTemp);
		}
		map.put("code", 200);
		map.put("msg", "请求成功");
		map.put("data", list);
		return map ;
	}

	@RequestMapping("/getPeople")
	public Map<String,Object> getPeople(){
		Map<String,Object> map = new LinkedHashMap<>();
		map.put("code", 200);
		map.put("msg", "请求成功");
		peopleBean.setcTime(new Date());
		peopleBean.setuTime(new Date());
		map.put("data", peopleBean);
		return map ;
	}

	@RequestMapping("/getUser")
	public Map<String,Object> getUser(){
		Map<String,Object> map = new LinkedHashMap<>();
		map.put("code", 200);
		map.put("msg", "请求成功");
		map.put("data", userBean);
		return map ;
	}
}
