package com.lw.file.service.impl;

import com.lw.file.bean.Account;
import com.lw.file.dao.AccountDao;
import com.lw.file.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao ;

	@Override
	public Account login(Account account) {
		return accountDao.login(account);
	}

	@Override
	public Account register(Account account) {
		return accountDao.register(account);
	}
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public AccountDao getAccountDao() {
		return accountDao;
	}

}
