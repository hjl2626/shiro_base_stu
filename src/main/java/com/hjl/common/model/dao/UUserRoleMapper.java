package com.hjl.common.model.dao;

import com.hjl.common.model.domain.UUserRole;

public interface UUserRoleMapper {
    int insert(UUserRole record);

    int insertSelective(UUserRole record);
}