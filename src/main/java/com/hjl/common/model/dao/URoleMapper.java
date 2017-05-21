package com.hjl.common.model.dao;

import com.hjl.common.model.domain.URole;

import java.util.Set;

public interface URoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(URole record);

    int insertSelective(URole record);

    URole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(URole record);

    int updateByPrimaryKey(URole record);
	
	Set<String> selectRolesByUserName(String username);
    
    Set<String> selectRolesByUserId(Long userId);
}