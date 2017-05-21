package com.hjl.core.shiro;

import com.hjl.common.model.domain.UUser;
import com.hjl.permission.service.PermissionService;
import com.hjl.permission.service.RoleService;
import com.hjl.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.util.Password;

import java.util.Date;
import java.util.Set;

/**
 * MysqlRealm
 *
 * @author hjl
 * @date 2017/5/21
 */
public class MysqlRealm extends AuthorizingRealm {
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PermissionService permissionService;
	
	@Autowired
	private RoleService roleService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		//根据自己系统规则的需要编写获取授权信息，这里为了快速入门只获取了用户对应角色的资源url信息
		String username = (String) principalCollection.fromRealm(getName()).iterator().next();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//根据用户ID查询角色（role），放入到Authorization里。
		Set<String> roles = roleService.findRolesByUserName(username);
		info.setRoles(roles);
		//根据用户ID查询权限（permission），放入到Authorization里。
		Set<String> permissions = permissionService.findPermissionsByUserName(username);
		info.setStringPermissions(permissions);
		return info;
	}
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		// 通过表单接收的用户名
		UUser user = userService.login(token.getUsername() , new String(token.getPassword()));
		if(null == user){
			throw new AccountException("帐号或密码不正确！");
			/**
			 * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
			 */
		}else if(UUser._0.equals(user.getStatus())){
			throw new DisabledAccountException("帐号已经禁止登录！");
		}else{
			//更新登录时间 last login time
			user.setLastLoginTime(new Date());
			userService.updateByPrimaryKeySelective(user);
		}
		return new SimpleAuthenticationInfo(user,user.getPswd(), getName());
	}
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
	}
}
