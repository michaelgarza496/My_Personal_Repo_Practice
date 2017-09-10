package com.mikesimagination;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String loginHomePage(){
		System.out.println("login page");
		return "/static/login.html";
	}
	@RequestMapping("/poop")
	public String poopPage(){
		System.out.println("login page");
		return "/static/poop.html";
	}
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView home(){
//		System.out.println("HomePageCtrl");
//		return new ModelAndView("/static/login.html");
//	}
}
