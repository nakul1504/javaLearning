package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Question q = new Question();
		q.setQuestionId(200);
        q.setQuestion("What is Java?");
        
        //List of answers
        List<Answer> ans = new ArrayList<Answer>();
        
        //creating answer
        Answer answer = new Answer();
        answer.setAnswerId(501);
        answer.setAnswer("Java is a programming language");
        answer.setQ(q);
        
        Answer answer1 = new Answer();
        answer1.setAnswerId(502);
        answer1.setAnswer("Contains many frameworks");
        answer1.setQ(q);
        
        Answer answer2 = new Answer();
        answer2.setAnswerId(503);
        answer2.setAnswer("To make tasks easier for the user");
        answer2.setQ(q);
        
        ans.add(answer);
        ans.add(answer1);
        ans.add(answer2);
       
        q.setAnswer(ans);
        
                //session
		Session s = factory.openSession();
        
		Transaction tx = s.beginTransaction();
		
		s.save(q);
        s.save(answer);
        s.save(answer1);
        s.save(answer2);


		tx.commit();

		// fetching......
//		Question q = (Question) s.load(Question.class, 200);
//		System.out.println(q.getQuestion());
//		for (Answer ans : q.getAnswer()) {
//			System.out.println(ans.getAnswer());
//		}

		s.close();
		factory.close();
	}

}
