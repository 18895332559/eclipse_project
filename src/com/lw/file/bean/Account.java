package com.lw.file.bean;

import java.io.Serializable;
/**
 * �˺�bean
 * @author lw
 */
public class Account implements Serializable{
	
	private Integer accountId ;//����
	private String accountName ;//�˺���
	private String accountPsd ;//����
	private char isAdmin  ; //�Ƿ����Ա  y:����Ա;n:��ͨ�û�
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
