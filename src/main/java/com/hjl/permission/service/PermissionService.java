package com.hjl.permission.service;

import java.util.Set;

public interface PermissionService {

	Set<String> findPermissionsByUserId(Long userId);
	
	Set<String> findPermissionsByUserName(String username);
}
