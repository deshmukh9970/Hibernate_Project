package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cgf = new Configuration();
		cgf.configure("hibernate.cnf.xml");

		SessionFactory factory = cgf.buildSessionFactory();

		// Creating Student Object for value store
		Student st = new Student();
		st.setId(101);
		st.setName("Prasad");
		st.setCity("Pune");

		System.out.println(st);

		// Saving Student data in mysql database to some write code here
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();

	}
}
