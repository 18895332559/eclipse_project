package com.lw.file.dao;

import com.lw.file.bean.Account;

public interface AccountDao {

	/**
	 *  登录
	 * @param account 用户
	 * @return 失败返回 null
	 */
	Account login(Account account);
	
	/**
	 * 注册
	 * @param account 用户
	 * @return 失败返回null
	 */
	Account register(Account account) ;
}
