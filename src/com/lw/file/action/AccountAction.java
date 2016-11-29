package com.lw.file.action;

import java.util.Map;

import com.lw.file.bean.Account;
import com.lw.file.service.AccountService;
import com.opensymphony.xwork2.ActionContext;
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
		Account loginAccount = accountService.login(account) ;
		System.out.println("account---login:" + loginAccount );
		//����ѯ�������ݴ���request
		ActionContext ac = ActionContext.getContext() ;
		Map<String, Object> request = ac.getContextMap();
		if(loginAccount == null ){// ��¼ʧ��
//			Map<String, Object> session = ac.getSession();
			request.put("msg", "��¼ʧ��");
			return "loginFailed" ;
		}
		
		request.put("account", loginAccount); 
		return SUCCESS  ;
		
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
