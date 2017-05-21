package com.hjl.permission.service.impl;

import com.hjl.common.model.dao.URoleMapper;
import com.hjl.permission.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * RoleServiceImpl
 *
 * @author hjl
 * @date 2017/5/21
 */
@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
	}
	
	
	@Autowired
	private URoleMapper uRoleMapper;
	
	
	@Override
	public Set<String> findRolesByUserName(String username) {
		return uRoleMapper.selectRolesByUserName(username);
	}
	
	@Override
	public Set<String> findRolesByUserId(Long userId) {
		return uRoleMapper.selectRolesByUserId(userId);
	}
}
