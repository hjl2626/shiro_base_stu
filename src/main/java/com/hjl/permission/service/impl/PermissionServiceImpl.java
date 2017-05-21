package com.hjl.permission.service.impl;

import com.hjl.common.model.dao.UPermissionMapper;
import com.hjl.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * PermissionServiceImpl
 *
 * @author hjl
 * @date 2017/5/21
 */
@Service(value = "permissionService")
public class PermissionServiceImpl implements PermissionService {
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
	}
	
	
	@Autowired
	private UPermissionMapper uPermissionMapper;
	
	
	@Override
	public Set<String> findPermissionsByUserId(Long userId) {
		return uPermissionMapper.selectPermissionsByUserId(userId);
	}
	
	@Override
	public Set<String> findPermissionsByUserName(String username) {
		return uPermissionMapper.selectPermissionsByUserName(username);
	}
}
