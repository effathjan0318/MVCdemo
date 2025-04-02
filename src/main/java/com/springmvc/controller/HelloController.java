package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message","User!");
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String handleLogin(String username,String password,Model model) {
		if("user".equals(username) && "password".equals(password)) {
			model.addAttribute("username",username);
			return "welcome";
		}else {
			return "index";
		}
	}

}
