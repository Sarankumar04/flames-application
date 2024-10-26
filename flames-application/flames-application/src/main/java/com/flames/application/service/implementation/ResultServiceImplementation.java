package com.flames.application.service.implementation;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.flames.application.dto.Lovers;
import com.flames.application.services.ResutService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class ResultServiceImplementation implements ResutService {

	
	public static String removeDuplicate(String fullName) {
		
		Set<Character> set=new TreeSet<>();
		
		for(int i=0;i<fullName.length();i++) {
			
			char c=fullName.charAt(i);
			
			if(Character.isWhitespace(c)==false) {
				set.add(c);
			}
		}
		
		String removedDuplicate="";
		
		for(Character f:set) {
			removedDuplicate+=f;
		}
		
		return removedDuplicate;
	}
	
	
	private String getFinalResult(int finalValue) {
		
		int finalReminder=finalValue%6;
		
		String result="";
		switch(finalReminder)
		{
		
		case 0:result= "Friends";
				break;
		
		case 1:result= "Lovers";
				break;
		case 2:result= "Affection";
				break;
		case 3:result= "Marriage";
				break;
		case 4:result= "Enemies";
				break;
		case 5:result= "Sister";
				break;
		}
		return result;
	}
	
	
	
	@Override
	public String getResult(Lovers lovers,HttpServletRequest req) {
		
		String yourName=lovers.getYourName();
		String loverName=lovers.getGfName();
		
		String fullName=(yourName+loverName).toUpperCase();
		
		String duplicateRemoved=removeDuplicate(fullName);
		
		String result=getFinalResult(duplicateRemoved.length());
		
		HttpSession httpSession	=req.getSession();
		httpSession.setAttribute("yourName",yourName);
		httpSession.setAttribute("result", result);
		return result;
	}

}
