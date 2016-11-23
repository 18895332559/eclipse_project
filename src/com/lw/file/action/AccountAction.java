package com.lw.file.action;

import com.lw.file.bean.Account;
import com.lw.file.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport {
	//ͨ��Spring IOC����ע��
	private AccountService accountService ;

	private Account account = new Account() ;
	
	/**
	 *  ע��
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
	 *  ��¼
	 * @return
	 * @throws Exception
	 */
	public String login()throws Exception{
		System.out.println("��¼֮ǰ�� " + account );
		Account acc = accountService.login(account) ;
		System.out.println("��¼֮��login()-----------" + acc); 
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
