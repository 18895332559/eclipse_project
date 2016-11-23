package com.lw.file.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate�Ĺ�����
 * @author lw
 *
 */
public class HibernateUtil {

	private static SessionFactory sf ;
	
	static{
		sf = new Configuration().configure().buildSessionFactory() ;
	}
	/**
	 *  ��ȡsession����
	 * @return �Ự����
	 */
	public static Session getSession(){
		return sf.openSession() ;
	}
}
