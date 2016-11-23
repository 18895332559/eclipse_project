package com.lw.file.bean;

import java.io.Serializable;
/**
 * 账号bean
 * @author lw
 */
public class Account implements Serializable{
	
	private Integer accountId ;//主键
	private String accountName ;//账号名
	private String accountPsd ;//密码
	private char isAdmin  ; //是否管理员  y:管理员;n:普通用户
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPsd() {
		return accountPsd;
	}
	public void setAccountPsd(String accountPsd) {
		this.accountPsd = accountPsd;
	}
	public char getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(char isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountPsd=" + accountPsd
				+ ", isAdmin=" + isAdmin + "]";
	}
	
	
}
