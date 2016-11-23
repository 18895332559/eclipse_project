package com.lw.file.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate的工具类
 * @author lw
 *
 */
public class HibernateUtil {

	private static SessionFactory sf ;
	
	static{
		sf = new Configuration().configure().buildSessionFactory() ;
	}
	/**
	 *  获取session对象
	 * @return 会话对象
	 */
	public static Session getSession(){
		return sf.openSession() ;
	}
}
