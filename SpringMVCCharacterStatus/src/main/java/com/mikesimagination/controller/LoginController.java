package com.mikesimagination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mikesimagination.characters.Hero;
import com.mikesimagination.service.HeroService;

@Controller
public class LoginController {
	
	@Autowired
	private HeroService heroService;

	@RequestMapping("/")
	public String loginHomePage(){
		System.out.println("login page");
		return "/static/login.html";
	}
	@RequestMapping("/poop")
	public String poopPage(){
		System.out.println("login page");
Hero hero = new Hero();
		
		hero.setName("bob");
		System.out.println(hero);
		heroService.createHero(hero);
		return "/static/poop.html";
	}
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView home(){
//		System.out.println("HomePageCtrl");
//		return new ModelAndView("/static/login.html");
//	}
}
