package com.demohabernate;

import org.hibernate.Transaction;

import com.demohabernateUtil.demohabernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	
	private static final SessionFactory FACTORY = demohabernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
		
	Session session = FACTORY.openSession();
	Transaction transaction = session.beginTransaction();
	
	User u = new User();
	u.setUsername("long");
	u.setPassword("013252");
	u.setDiachi("quy nhơn");
	
	session.save(u);
	transaction.commit();
	}
	
}
