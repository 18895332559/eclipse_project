package com.lw.file.action;

import java.util.Map;

import com.lw.file.bean.Account;
import com.lw.file.service.AccountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport {
	//Í¨¹ýSpring IOCÈÝÆ÷×¢Èë
	private AccountService accountService ;
	
	private Account account = new Account() ;
	
	/**
	 *  ×¢²á
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
	 *  µÇÂ¼
	 * @return
	 * @throws Exception
	 */
	public String login()throws Exception{
		Account loginAccount = accountService.login(account) ;
		System.out.println("account---login:" + loginAccount );
		//½«²éÑ¯µ½µÄÊý¾Ý´æÈërequest
		ActionContext ac = ActionContext.getContext() ;
		Map<String, Object> request = ac.getContextMap();
		if(loginAccount == null ){// µÇÂ¼Ê§°Ü
//			Map<String, Object> session = ac.getSession();
			request.put("msg", "µÇÂ¼Ê§°Ü");
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
