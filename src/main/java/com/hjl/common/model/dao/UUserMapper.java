package com.hjl.common.model.dao;

import com.hjl.common.model.domain.UUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);
    
    List<UUser> selectAll();
    
    UUser selectByUsername(@Param("username") String username);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
    
    Set<String> selectPermissionsByUserId(@Param("userId") Long userId);
    
    Set<String> selectPermissionsByUserName(@Param("username") String username);
    
    UUser login(@Param("username") String username, @Param("password") String password);
}