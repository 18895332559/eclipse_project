package com.lw.file.action;

import com.lw.file.bean.Account;
import com.lw.file.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport {
	//通过Spring IOC容器注入
	private AccountService accountService ;

	private Account account = new Account() ;
	
	/**
	 *  注册
	 * @return
	 * @throws Exception
	 */
	public String register() throws Exception {
		System.out.println("account------" + account);
		System.out.println("accountService------" + accountService);
		if(accountService != null){
			accountService.register(account); 
		}
		return SUCCESS  ;
	}
	
	/**
	 *  登录
	 * @return
	 * @throws Exception
	 */
	public String login()throws Exception{
		System.out.println("登录之前： " + account );
		Account acc = accountService.login(account) ;
		System.out.println("登录之后：login()-----------" + acc); 
		return "success"  ;
	}
	
	
	public AccountService getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	

	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
}
