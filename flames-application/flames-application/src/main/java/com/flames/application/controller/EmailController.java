package com.flames.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flames.application.dto.Email;
import com.flames.application.service.implementation.EmailServiceImplementation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmailController {
	
	@Autowired
	private EmailServiceImplementation emailService;
	
	
	@RequestMapping("/sendemail")
	public String sendEmail(@ModelAttribute("email") Email email) {
		return "sendemail";
	}
	
	@RequestMapping("/processemail")
	public String processEmail(@ModelAttribute("email") Email email,HttpSession session) {	
	String result	=session.getAttribute("result").toString();
    String res=emailService.sendEmailTo(email,result);
	System.out.println(res);
    
	return "process";
	}
}
