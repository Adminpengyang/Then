package com.cssl.mapper;

import com.cssl.pojo.Users;

public interface usersDao {

	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public Users login(Users user);
	/**
	 * 注册
	 * 
	 */
	public int save(Users user);
}
