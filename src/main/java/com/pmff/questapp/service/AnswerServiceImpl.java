package com.pmff.questapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pmff.questapp.dao.AnswerDAO;
import com.pmff.questapp.entity.Answer;

@Service
public class AnswerServiceImpl implements AnswerService {

	// need to inject customer dao
	@Autowired
	private AnswerDAO answerDAO;
		
	@Transactional
	public List<Answer> getAnswers() {
		
		return answerDAO.getAnswers();
	}

	@Transactional
	public void saveAnswer(Answer theAnswer) {
		
		answerDAO.saveAnswer(theAnswer);
	}

	@Transactional
	public Answer getAnswer(int theId) {
		
		return answerDAO.getAnswer(theId);
	}

	@Transactional
	public void deleteAnswer(int theId) {
		
		answerDAO.deleteAnswer(theId);
	}

}
