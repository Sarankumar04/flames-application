package com.flames.application.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.flames.application.dto.Email;
import com.flames.application.services.EmailService;

@Service
public class EmailServiceImplementation implements EmailService{

	
	@Autowired
	JavaMailSender javaMailSender;
	
	
	@Override
	public String sendEmailTo(Email email,String result) {		
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom("vsarankumarcs@gmail.com");
		mailMessage.setTo(email.getEmail());
		mailMessage.setSubject("Result from Flames Calculator");
		mailMessage.setText("Hi User \n \n \n"
				+ "Here your result from Flames calculator is : "+result);
		
		try {
			javaMailSender.send(mailMessage);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "Something went Wrong";
		}
		
		return "Mail Sent Successfully";
	}

}
