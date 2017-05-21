package com.hjl.user.service;

import com.hjl.common.model.domain.UUser;

import java.util.Set;

/**
 * UserService
 *
 * @author hjl
 * @date 2017/5/21
 */
public interface UserService {
	
	UUser getUserById(Long id);
	
	UUser getUserByUserName(String usernamel);
	
	UUser login(String usernameOrEmail , String password);
	
	Set<String> getPermissionsByUserId(Long userId);
	
	Set<String> getPermissionsByUserName(String username);
	
	Integer updateByPrimaryKeySelective(UUser user);
}
