package com.flames.application.services;

import com.flames.application.dto.Lovers;

import jakarta.servlet.http.HttpServletRequest;


public interface ResutService {

	public String getResult(Lovers lovers,HttpServletRequest req);
}
