package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.helper.FactoryProvider;
import com.map.Answer;
import com.map.Question;

public class CascadeExample {

	public static void main(String[] args) {
		SessionFactory factory = FactoryProvider.getFactory();
		Session s = factory.openSession();
		
		Question q = new Question();
		q.setQuestionId(450);
        q.setQuestion("What is Swing?");
        
        List<Answer> ans = new ArrayList<Answer>();
        
        Answer a1 = new Answer(789, "Used for develpment");
        Answer a2 = new Answer(784, "Easy to use");
        
        ans.add(a1);
        ans.add(a2);
        
        q.setAnswer(ans);
        
        Transaction tx = s.beginTransaction();
        s.delete(q);
		tx.commit();
		s.close();
		factory.close();

	}

}
