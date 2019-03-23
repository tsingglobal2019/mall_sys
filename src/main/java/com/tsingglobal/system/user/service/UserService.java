package com.tsingglobal.system.user.service;

import java.util.List;

import com.tsingglobal.system.org.domain.OrganizationModel;
import com.tsingglobal.system.user.domain.UserModel;

public interface UserService {
	
	/**
	 * 
	    * @Title: loadUser
	    * @Description: TODO(按ID加载用户信息)
	    * @param @param id	用户ID
	    * @return UserModel    返回用户信息
	 */
	public UserModel loadUser( final long id);
	
	/**
	 * 
	    * @Title: queryUser
	    * @Description: TODO(按条件查询用户信息)
	    * @param @param user 查询条件
	    * @return List<UserModel>    用户信息
	 */
	public List<UserModel> queryUser( final UserModel user) ;
	
	
	/**
	 * 
	    * @Title: saveUser
	    * @Description: TODO(保存用户)
	    * @param @param user 用户
	    * @return long    返回类型 用户ID
	 */
	public long saveUser( final UserModel user ) ;
	
	/**
	 * 
	    * @Title: updateUser
	    * @Description: TODO(更新用户)
	    * @param @param user 用户
	    * @return long    返回类型 用户ID
	 */
	public long updateUser( final UserModel user ) ;
	
	
	/**
	 * 
	    * @Title: 锁定账户
	    * @Description: TODO(锁定账户)
	    * @param @param user 用户
	    * @return long    返回类型 用户ID
	 */
	public long lockUser( final UserModel user ) ;
	
	/**
	 * 
	    * @Title: delUser
	    * @Description: TODO(删除用户)
	    * @param @param id 用户ID
	    * @return long    返回类型 用户ID
	 */
	public long delUser( final long id ) ;
	
	/**
	 * 
	    * @Title: delUserByOrg
	    * @Description: TODO(删除指定机构下的全部用户)
	    * @param @param id 机构编码
	    * @return long    返回类型 用户ID
	 */
	public long delUserByOrg( final String orgCode ) ;

	/**
	 * 
	    * @Title: queryUserByOrg
	    * @Description: TODO(按机构查询用户)
	    * @param @param org	机构对象
	    * @param @param user用户对象
	    * @param @return    参数 指定机构下用户信息
	    * @return List<UserModel>    返回类型
	    * @throws
	 */
	public List<UserModel> queryUserByOrg( final OrganizationModel org, final UserModel user);

	/**
	 * 
	    * @Title: delUsers
	    * @Description: TODO(批量删除用户)
	    * @param @param ids    待删除用户ID
	    * @return void    返回类型
	    * @throws
	 */
	public void delUsers(String ids);

	/**
	 * 注册用户信息
	 * @param user 待注册用户，至少包括用户名和账户（邮件格式）
	 * @return 保存后的注册用户，含ID和注册时间、注册码(userCode)
	 */
	public UserModel registerUser( final UserModel user);
	
	/**
	 * 验证用户注册的邮箱地址是否存在。顾客注册的邮箱地址就是其未来的账户，不能重复。
	 * @param user	待注册用户
	 * @return	是否存在注册的邮箱地址。 true=存在 false=不存在
	 */
	public boolean validateRegisterUser( final UserModel user );
	
	/**
	 * 提交注册码。
	 * @param user 待注册用户，其中含有用户输入的注册码，或者自动生成的注册码。
	 * @return 注册后的用户。注册失败返回Null。
	 */
	public UserModel commitRegisterCode( final UserModel user );
}
