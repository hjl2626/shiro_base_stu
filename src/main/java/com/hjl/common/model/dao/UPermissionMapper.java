package com.hjl.common.model.dao;

import com.hjl.common.model.domain.UPermission;

import java.util.Set;

public interface UPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UPermission record);

    int insertSelective(UPermission record);

    UPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UPermission record);

    int updateByPrimaryKey(UPermission record);
	
	Set<String> selectPermissionsByUserId(Long userId);
    
    Set<String> selectPermissionsByUserName(String username);
}