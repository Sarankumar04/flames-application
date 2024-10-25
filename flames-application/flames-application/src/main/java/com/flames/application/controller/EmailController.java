package com.flames.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flames.application.dto.Email;

@Controller
public class EmailController {
	
	@RequestMapping("/sendemail")
	public String sendEmail(@ModelAttribute("email") Email email) {
		return "sendemail";
	}
	
	@RequestMapping("/processemail")
	public String processEmail(@ModelAttribute("email") Email email) {
		return "process";
	}
}
