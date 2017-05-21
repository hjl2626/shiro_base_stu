package com.hjl.common.model.dao;

import com.hjl.common.model.domain.URolePermission;

public interface URolePermissionMapper {
    int insert(URolePermission record);

    int insertSelective(URolePermission record);
}