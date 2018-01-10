package com.canerpinar.loginUserService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolver {

	@RequestMapping("/")
	public String indexLoadPage(){
		return "index";
	}
	@RequestMapping("/login/login")
	public String loginLoadPage(){
		return "login/admin";
	}
}
