package com.lihetech.thcar.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lihetech.thcar.service.impl.THCarQueryServiceImpl;

@Controller
public class THCarTest {
	
	//@Resource(name="THCarQueryServer")
	@Autowired
	THCarQueryServiceImpl queryService;
	
	@RequestMapping("hello")
	public String helloTHCar(Map<String,Object> map){
		System.out.println(queryService.getUser("18237603109"));
		map.put("user", queryService.getUser("18237603109"));
		return "success";
	}
	
	@RequestMapping("home")
	public String home(){
		System.out.println("home");
		return "register_step1";
	}
}
