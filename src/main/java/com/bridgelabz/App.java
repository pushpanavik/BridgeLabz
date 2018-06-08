package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Actor;
import model.Movies;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("resources/db.config.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Movies m1 = new Movies();
		m1.setId(106);
		m1.setName("Tiger Zindha hai");

		Movies m2 = new Movies();
		m2.setId(104);
		m2.setName("hum Aapke hai kaun");
		
		Set<Movies> set = new HashSet<Movies>();
		set.add(m1);
		set.add(m2);
		
		Actor a1 = new Actor();
		a1.setAid(403);
		a1.setName("Salman Khan");
		a1.setMovies(set);
		

		Set<Actor> act = new HashSet<Actor>();
		act.add(a1);

		session.save(a1);
		session.save(m1);
		session.save(m2);
		t.commit();

		session.close();
		
		sessionFactory.close();
		
	}
}
