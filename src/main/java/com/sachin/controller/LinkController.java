package com.sachin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {

	@RequestMapping("/hello-page")
	public ModelAndView goToHelloPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");

		String str = "MVC Spring is here";

		view.addObject("message", str);

		return view;
	}

	@RequestMapping("/")
	public String getLoginPage() {
		return "index";
	}
}
