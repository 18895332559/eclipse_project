package com.lw.file.service;

import com.lw.file.bean.Account;

public interface AccountService {

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
