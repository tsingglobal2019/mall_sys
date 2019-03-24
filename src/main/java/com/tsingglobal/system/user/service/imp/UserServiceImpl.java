package com.tsingglobal.system.user.service.imp;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.common.utils.CommonUtil;
import com.common.utils.SnowflakeIdWorker;
import com.tsingglobal.system.org.domain.OrganizationModel;
import com.tsingglobal.system.user.dao.UserDao;
import com.tsingglobal.system.user.domain.UserModel;
import com.tsingglobal.system.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public UserModel loadUser(long id) {
		// TODO Auto-generated method stub
		return userDao.loadUser(id);
	}

	@Override
	public List<UserModel> queryUser(UserModel user) {
		
		return userDao.queryUsers(user);
	}

	@Override
	public long saveUser(UserModel user) {
		
		user.setId(new SnowflakeIdWorker(0, 0).nextId());
		
		user.setRegisterTime(Calendar.getInstance().getTime());
		
		userDao.saveUser(user);
		
		return user.getId();
	}

	@Override
	public long updateUser(UserModel user) {

		userDao.updateUser(user);
		
		return user.getId();
	}

	@Override
	public long delUser(long id) {

		userDao.delUser(id);
		
		return id;
	}

	@Override
	public long delUserByOrg(final String orgCode) {
		
		userDao.delUserByOrg(orgCode);
		
		return 0;
	}

	@Autowired
	private UserDao userDao;

	@Override
	public List<UserModel> queryUserByOrg( final OrganizationModel org, final UserModel user) {

		Map<String, Object> conditionMap = new HashMap<String, Object>();
		conditionMap.put("org", org);
		conditionMap.put("user", user);
		return userDao.queryUsersByOrg(conditionMap);
	}

	@Override
	public void delUsers(String ids) {
		
		if( CommonUtil.isEmpty(ids) ) {
			
			return ;
		}
		
		userDao.delUsers(ids.split(","));
	}

	@Override
	public long lockUser(final UserModel user) {
		
		UserModel lockUser = this.userDao.loadUser(user.getId());
		
		lockUser.setLockedOK(user.getLockedOK()) ;
		
		return this.updateUser( lockUser );		
	}

	@Override
	@Transactional
	public UserModel registerUser( final UserModel user) {
		
		if( !this.validateRegisterUser(user) ) {
			
			return user;
		}
		
		
		final UserModel registerUser = new UserModel();
		
		BeanUtils.copyProperties(user, registerUser);
		
		registerUser.setId(CommonUtil.genarateID());
		
		//注册用户处于锁定状态。
		registerUser.setLockedOK(1);
		
		registerUser.setRegisterTime(Calendar.getInstance().getTime());
		
		registerUser.setPassword("1");
		
		registerUser.setOrgID(0);
		
		userDao.delUser(registerUser.getId());
		
		this.userDao.saveUser(registerUser);
		
		return registerUser;
	}
	
	/**
	 * 验证用户注册的邮箱地址是否存在。顾客注册的邮箱地址就是其未来的账户，不能重复。
	 * 验证用户提交的注册码是否一致发送给用户邮箱的注册码一致。
	 * @param user	待注册用户
	 * @return	是否存在注册的邮箱地址。 true=存在 false=不存在
	 */
	public boolean validateRegisterUser( final UserModel user ) {
		
		List<UserModel> usres = userDao.queryUsers(user);

		return usres.isEmpty();
	}

	@Override
	public UserModel commitRegisterCode( final UserModel user) {

		if( !this.validateRegisterUser(user) ) {
			
			userDao.saveUser(user);
			
			return user;
		}
		
		return null;
	}
}
