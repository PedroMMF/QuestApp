package com.pmff.questapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pmff.questapp.entity.Answer;
import com.pmff.questapp.util.HibernateUtil;

@Repository
public class AnswerDAOImpl implements AnswerDAO{
	
	// session factory injection
	/*
	@Autowired
	private SessionFactory sessionFactory;
	*/
	
	@Autowired
	private HibernateUtil hibernateUtil;
	private SessionFactory sessionFactory;
	
	//Session session = HibernateUtil.getSessionFactory().openSession())

	public List<Answer> getAnswers() {
		
		// get the current hibernate session
		sessionFactory = hibernateUtil.getSessionFactory();
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query ... sort by text
		Query<Answer> theQuery =
				currentSession.createQuery("from Answer order by lastName", Answer.class);
				
		// execute query and get result list
		List<Answer> answers = theQuery.getResultList();
				
		return answers;
	}

	public void saveAnswer(Answer theAnswer) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/update the answer
		currentSession.saveOrUpdate(theAnswer);
	}

	public Answer getAnswer(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// retrieve/read from database using the primary key
		Answer theAnswer = currentSession.get(Answer.class, theId);
				
		return theAnswer;
	}

	public void deleteAnswer(int theId) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Answer where id=:answerId");
		theQuery.setParameter("answerId", theId);
				
		theQuery.executeUpdate();
	}

}
