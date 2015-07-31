package com.sachin.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sachin.bean.Register;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register")
	public String getRegister(@ModelAttribute Register register) {
		System.err.println(register);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String getRegisterConfirmation(@ModelAttribute Register register) {
		
//		if(bindingResult.hasErrors()){
			return "redirect:/";
//		}
//		System.err.println(register);
//		return "register";
	}
}
