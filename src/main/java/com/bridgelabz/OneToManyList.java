package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Answer;
import model.Question;

public class OneToManyList {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure("resources/data.xml");

	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction t = session.beginTransaction();
	
	Question q=new Question();
	q.setQid(471);
	q.setQname("What is Java ?");
	
	Answer answer=new Answer();
	answer.setAid(651);
	answer.setAnsName("Java is Programming Language ");
	answer.setPostedBy("Pushpa Navik");
	
	Question q1=new Question();
	q1.setQid(254);
	q1.setQname("Features of Java");
	
	
	Answer answer1=new Answer();
	answer1.setAid(456);
	answer1.setAnsName("Java is platform independent and robust");
	answer1.setPostedBy("Mr Nagoor Babu");
	
	List<Answer> a=new LinkedList<Answer>();
	a.add(answer);
	
	List<Answer> a1=new LinkedList<Answer>();
	a1.add(answer);
	
	q.setAnswer(a);
	q1.setAnswer(a1);
	session.save(answer);
	session.save(answer1);
	session.save(q);
	session.save(q1);
	session.flush();
	t.commit();
	
	session.close();
	sessionFactory.close();
	
}
}
