package com.sachin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachin.bean.Login;

@Controller
public class LoginController {

	@RequestMapping("/home.html")
	public String processLogin (@ModelAttribute Login login) {
		System.err.println(login);
		return "studentDetails";
	}
}
