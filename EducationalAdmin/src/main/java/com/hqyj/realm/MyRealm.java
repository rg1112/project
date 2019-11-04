package com.hqyj.realm;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hqyj.entity.Role;
import com.hqyj.entity.Stu;
import com.hqyj.entity.Teacher;
import com.hqyj.service.StuService;
import com.hqyj.service.TeacherService;

@Controller
public class MyRealm extends AuthorizingRealm {
	@Autowired
	private TeacherService userService;
	@Autowired
	private StuService userService1;
	HttpServletRequest request;
	/**
	 * 
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// 1. 从PrincipalCollection中来获取登陆用户的信息
		Object principal = principals.getPrimaryPrincipal();
		String principal1=(String) principal;
		System.out.println("当前登陆的用户:"+principal);
		String regex1="^s{1}[0-9]*$";
		if(principal1.matches(regex1)){
			// 2. 利用登陆的用户信息来获取用户当前的角色以及权限(可能查询数据库)
			
						Set<String> set = new HashSet<String>();
//						set.add("lye");
						
						
						Stu user = userService1.findByName((String)principal);
						Role role = user.getRole();
						set.add(role.getRname());
						/*User user = userService.findUser((String) principal);
						System.out.println(user.getRoleList());
						List<Role> roles = user.getRoleList();
						for(Role role : roles){
							set.add(role.getRname());
							System.out.println(role.getRname());
						}*/
						
						System.out.println("set里的值:"+set);
						// 3. 创建SimpleAuthorizationInfo,并设置其reles属性
						SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
						simpleAuthorizationInfo.addRoles(set);
						// 4. 返回SimpleAuthorizationInfo对象
						return simpleAuthorizationInfo;
		}
		else{
			// 2. 利用登陆的用户信息来获取用户当前的角色以及权限(可能查询数据库)
			
			Set<String> set = new HashSet<String>();
//			set.add("lye");
			
			
			Teacher user = userService.findByName((String)principal);
			Role role = user.getRole();
			set.add(role.getRname());
			/*User user = userService.findUser((String) principal);
			System.out.println(user.getRoleList());
			List<Role> roles = user.getRoleList();
			for(Role role : roles){
				set.add(role.getRname());
				System.out.println(role.getRname());
			}*/
			
			System.out.println("set里的值:"+set);
			// 3. 创建SimpleAuthorizationInfo,并设置其reles属性
			SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
			simpleAuthorizationInfo.addRoles(set);
			// 4. 返回SimpleAuthorizationInfo对象
			return simpleAuthorizationInfo;
		}
		
	}

	/**
	 * 认证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		
		//获取用户名
		String ton = (String) token.getPrincipal();
		System.out.println(ton);
		System.out.println("1ggggg");
		String regex1="^s{1}[0-9]*$";
		System.out.println("123456");
		System.out.println(ton.matches(regex1));
		if(ton.matches(regex1)){
			Stu user = userService1.findByName(ton);
			System.out.println(user);
			/*User user = userService.findUser(userName);
			System.out.println(user);*/
			
			Subject currentUser = SecurityUtils.getSubject();
			Session session = currentUser.getSession();
			session.setAttribute("username", user.getSno());
			/*session.setAttribute("userName", userName);
			session.setAttribute("headImg", user.getHeadImg());*/
			// 获取盐，通常用账号
			ByteSource credentialsSalt = ByteSource.Util.bytes(ton);
			// 盐值加密
			SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(ton,user.getSpwd(),credentialsSalt,getName());
			// SimpleAuthenticationInfo simpleAuthenticationInfo = new
			// SimpleAuthenticationInfo(user,
			// "64c8b1e43d8ba3115ab40bcea57f010b",getName());
			return simpleAuthenticationInfo;
		}else{
			Teacher user = userService.findByName(ton);
			System.out.println(user);
			/*User user = userService.findUser(userName);
			System.out.println(user);*/
			
			Subject currentUser = SecurityUtils.getSubject();
			Session session = currentUser.getSession();
			session.setAttribute("username", user.getTon());
			/*session.setAttribute("userName", userName);
			session.setAttribute("headImg", user.getHeadImg());*/
			// 获取盐，通常用账号
			ByteSource credentialsSalt = ByteSource.Util.bytes(ton);
			// 盐值加密
			SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(ton,user.getTpwd(),credentialsSalt,getName());
			// SimpleAuthenticationInfo simpleAuthenticationInfo = new
			// SimpleAuthenticationInfo(user,
			// "64c8b1e43d8ba3115ab40bcea57f010b",getName());
			return simpleAuthenticationInfo;
		}
		
	}

}
