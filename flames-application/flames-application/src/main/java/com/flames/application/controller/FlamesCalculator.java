package com.flames.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flames.application.dto.Lovers;
import com.flames.application.services.ResutService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class FlamesCalculator {
	
	@Autowired
	private ResutService resultService;
	
	@GetMapping("/")
	public String getHome(@ModelAttribute("lover") Lovers lovers) {
		return "homePage";
	}
	
	@GetMapping("/claculate")
	public String getCalaculate(@ModelAttribute("lover") Lovers lovers,HttpServletRequest req) {
	
	String result=resultService.getResult(lovers,req);	
	return "result"; 
	}
}
