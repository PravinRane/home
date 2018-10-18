package com.springboot.demo.controller;

@org.springframework.stereotype.Controller

@org.springframework.web.bind.annotation.RequestMapping("/mvc")
public class HomeController {
	@org.springframework.web.bind.annotation.RequestMapping("/home")
	public org.springframework.web.servlet.ModelAndView homeView(){
		org.springframework.web.servlet.ModelAndView view = new org.springframework.web.servlet.ModelAndView();
		view.setViewName("jsp/home");
		return view;
	}
	
}
