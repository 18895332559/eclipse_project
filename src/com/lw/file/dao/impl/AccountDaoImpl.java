package com.lw.file.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.lw.file.bean.Account;
import com.lw.file.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
	//������Spring���Ѿ���ʼ��
	private SessionFactory sessionFactory ;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public Account login(Account account) {
		Session session = sessionFactory.openSession();
		//��ȡ�������
		Transaction tx = session.beginTransaction();
		//HQL��ѯ
		Query query = session.createQuery("from Account where account_name = '" + account.getAccountName() + "' and account_psd = '" + account.getAccountPsd() + "'");
		List<Account> list = query.list();
		//��¼�ɹ�
		if(list != null && list.size() != 0 ){
			return list.get(0) ;
		}
		return null ;
	}

	@Override
	public Account register(Account account) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Account acc = (Account) session.save(account);
		tx.commit(); //�����ύ
		return acc ;
	}

}
