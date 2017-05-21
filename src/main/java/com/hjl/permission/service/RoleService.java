package com.hjl.permission.service;

import java.util.Set;

public interface RoleService {
	
	Set<String> findRolesByUserName(String username);
	
	Set<String> findRolesByUserId(Long userId);
}
