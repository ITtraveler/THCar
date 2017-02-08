package com.lihetech.thcar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lihetech.thcar.entity.RegisterInfo;

@Controller
public class THCarContraller {
	// 用户注册步骤
	@RequestMapping(value = "/register1")
	public String thCarRegister1(RegisterInfo registerInfo) {
		// System.out.println(name +" "+telephone+" "+prefixRegion+" ");
		System.out.println(registerInfo);
		return "register01";
	}

	// 用户付费步骤
	@RequestMapping("/register2")
	public String thCarRegister2() {
		return "register02";
	}

	//我的二维码界面
	@RequestMapping("/myQRCode")
	public String thCarQRCode() {
		return "myQRCode";
	}

	@RequestMapping("/touchStep1")
	public String thCarTouchStep1() {
		return "thcar_touch1";
	}

	@RequestMapping("/touchStep2")
	public String thCarTouchStep2() {
		return "thcar_touch2";
	}

}
