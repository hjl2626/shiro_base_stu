package com.hjl.service;

import com.github.pagehelper.PageHelper;
import com.hjl.base.BaseTest;
import com.hjl.common.model.dao.UUserMapper;
import com.hjl.user.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserServiceTest
 *
 * @author hjl
 * @date 2017/5/21
 */
public class UserServiceTest extends BaseTest{
	
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UUserMapper uUserMapper;
	
	@Test
	public void testGetUserByUserNameOrEmail(){
		println(userService.getPermissionsByUserId(1L).size());
		
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
