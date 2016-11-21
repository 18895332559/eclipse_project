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
	private boolean isAdmin  ; //是否管理员
}
