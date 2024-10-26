package com.flames.application.services;

import org.springframework.stereotype.Service;

import com.flames.application.dto.Email;

@Service
public interface EmailService {

	public String sendEmailTo(Email email,String result);
	
}
