package com.lw.file.dao;

import com.lw.file.bean.Account;

public interface AccountDao {

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
