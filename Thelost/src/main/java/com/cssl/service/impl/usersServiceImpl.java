package com.cssl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cssl.mapper.usersDao;
import com.cssl.pojo.Users;
import com.cssl.service.usersService;
@Service
public class usersServiceImpl implements usersService {

	@Autowired
	private usersDao us;
	
	/**
	 * 登陆
	 */
	@Override
	public Users login(Users user) {
		
		return us.login(user);
	}

}
