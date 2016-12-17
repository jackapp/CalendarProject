package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class CrunchifyHelloWorld {
 
	@RequestMapping(value = "/welcome")
	public String helloWorld(Model model) {
 
		String message = "hiiiiii";
		String temp = "this is temp";
		model.addAttribute("temp",temp);
		model.addAttribute("message",message);
		return "welcome";
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		String message = "Blah";
		return new ModelAndView("welcome", "message", message);
	}
}