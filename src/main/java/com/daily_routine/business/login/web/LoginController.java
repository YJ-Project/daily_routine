package com.daily_routine.business.login.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daily_routine.business.login.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/")
	public void start() {
		System.out.println("----------");
	}
	
	@RequestMapping(value="/hello")
	public void getNow() {
		System.out.println("000000000000");
		System.out.println(loginService.getNow());
	}
}
