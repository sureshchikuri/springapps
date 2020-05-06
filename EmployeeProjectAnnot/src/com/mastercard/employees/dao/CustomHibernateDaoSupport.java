package com.mastercard.employees.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomHibernateDaoSupport extends HibernateDaoSupport {

	private void anyMethidName(SessionFactory sessionFactory) {

		setSessionFactory(sessionFactory);
	}
}
