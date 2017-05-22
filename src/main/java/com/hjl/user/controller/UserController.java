package com.hjl.user.controller;

import com.hjl.common.model.domain.UUser;
import com.hjl.user.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hjl on 2017/5/22.
 */
@Controller
@RequestMapping
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("userInfo")
	@ResponseBody
	@RequiresUser
	public UUser userInfo(String username){
		
		return userService.getUserByUserName(username);
	}
	
	@RequestMapping("login")
	@ResponseBody
	public UUser login(String username ,String password){
		SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
		// 登录后存放进shiro token
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		Subject subject = SecurityUtils.getSubject();
		subject.login(token);
		
		return (UUser) subject.getPrincipal();
	}
	
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
	}
}
