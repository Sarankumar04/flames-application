package com.flames.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flames.application.dto.Lovers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class FlamesCalculator {

	@RequestMapping("/")
	public String getHome(@ModelAttribute("lover") Lovers lovers) {
		return "homePage";
	}
	
	@RequestMapping("/claculate")
	public String getCalaculate(Lovers lovers,Model model,HttpServletRequest req) {
	HttpSession httpSession	=req.getSession();
	httpSession.setAttribute("yourName",lovers.getYourName() );
	
	model.addAttribute("lover",lovers);
	return"result"; 
	}
}
