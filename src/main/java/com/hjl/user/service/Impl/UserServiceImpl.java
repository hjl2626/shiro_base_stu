package com.hjl.user.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjl.common.model.dao.UUserMapper;
import com.hjl.common.model.domain.UUser;
import com.hjl.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * UserServiceImpl
 *
 * @author hjl
 * @date 2017/5/21
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UUserMapper uUserMapper;
	
	@Override
	public UUser getUserById(Long id) {
		return uUserMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public UUser getUserByUserName(String username) {
		return uUserMapper.selectByUsername(username);
	}
	
	@Override
	public UUser login(String username, String password) {
		return uUserMapper.login(username , password);
	}
	
	@Override
	public Set<String> getPermissionsByUserId(Long userId) {
		return uUserMapper.selectPermissionsByUserId(userId);
	}
	
	@Override
	public Set<String> getPermissionsByUserName(String username) {
		return uUserMapper.selectPermissionsByUserName(username);
	}
	
	@Override
	public Integer updateByPrimaryKeySelective(UUser user) {
		return uUserMapper.updateByPrimaryKeySelective(user);
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
