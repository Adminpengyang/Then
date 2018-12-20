package com.cssl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cssl.pojo.Users;
import com.cssl.service.usersService;

@RestController
public class UsersController {
	
	@Autowired
	private usersService us;
	
	@RequestMapping("/Uesrss-login")
	public String login(Users user,Model model,HttpSession session,HttpServletResponse respinse) throws IOException {
		user=us.login(user);
	//	PrintWriter out =respinse.getWriter();
	//	String hz;
		if(user!=null ) {
			session.setAttribute("us", user);
			System.out.println(user);
			//hz="Y";
			return "homepage";
		}
			//hz="N";
	
		model.addAttribute("msg", "密码错误，请重新登陆");
		
		return "login.html";
	}

}
