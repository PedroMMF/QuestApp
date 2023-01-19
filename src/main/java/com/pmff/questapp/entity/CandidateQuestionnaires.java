package com.pmff.questapp.entity;

import java.util.Date;
import java.util.List;

public class CandidateQuestionnaires {
	
	private int question_id;
	
	private int answer_id;
	
	private Date date;
	
	private List<CandidateAnswer> candidateAnswers;

	public CandidateQuestionnaires() {
	
	}

	public CandidateQuestionnaires(Date date) {
		this.date = date;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<CandidateAnswer> getCandidateAnswers() {
		return candidateAnswers;
	}

	public void setCandidateAnswers(List<CandidateAnswer> candidateAnswers) {
		this.candidateAnswers = candidateAnswers;
	}
	
	

}
