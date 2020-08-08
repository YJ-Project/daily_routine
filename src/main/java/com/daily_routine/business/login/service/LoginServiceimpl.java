package com.daily_routine.business.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily_routine.business.login.mapper.LoginMapper;

@Service
public class LoginServiceimpl implements LoginService{
	
	 @Autowired private LoginMapper loginMapper;
	 

	@Override
	public String getNow() {
		return loginMapper.getNow();
	}
	
}
