package com.lw.file.service;

import com.lw.file.bean.Account;

public interface AccountService {

	/**
	 *  ��¼
	 * @param account �û�
	 * @return ʧ�ܷ��� null
	 */
	Account login(Account account);
	
	/**
	 * ע��
	 * @param account �û�
	 * @return ʧ�ܷ���null
	 */
	Account register(Account account) ;
}
