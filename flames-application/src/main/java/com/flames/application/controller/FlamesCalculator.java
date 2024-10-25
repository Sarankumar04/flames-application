package com.flames.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flames.application.dto.Lovers;

@Controller
public class FlamesCalculator {

	@RequestMapping("/")
	public String getHome(@ModelAttribute("lover") Lovers lovers) {
		return "NewFile";
	}
	
	@RequestMapping("/claculate")
	public String getCalaculate(@ModelAttribute("lover") Lovers lovers) {
		return""; 
	}
}
