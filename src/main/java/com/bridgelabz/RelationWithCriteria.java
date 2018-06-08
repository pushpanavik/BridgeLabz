package com.bridgelabz;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import model.Answer;
import model.Question;

public class RelationWithCriteria {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("resources/data.xml");
		Session session=cfg.buildSessionFactory().openSession();
		System.out.println(session);
		
		Question questions=session.get(Question.class,new Integer(1));
		System.out.println(questions);
		
		System.out.println("Question" + questions.getQname());
		
		List<Answer> list=questions.getAnswer();
		for(Answer a: list)
		{
			System.out.println(a.getAid()+ " "+a.getAnsName()+ " "+a.getPostedBy());
		}
		
	}
}
