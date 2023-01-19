package com.pmff.questapp.entity;

public class CandidateAnswer {
	
	private int id;
	
	private int questionary_id;
	
	private int test_id;
	
	private int question_id;
	
	private int answer_id;
	
	private boolean candidateAnswer;

	public CandidateAnswer() {

	}

	public CandidateAnswer(boolean candidateAnswer) {
		
		this.candidateAnswer = candidateAnswer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionary_id() {
		return questionary_id;
	}

	public void setQuestionary_id(int questionary_id) {
		this.questionary_id = questionary_id;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
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

	public boolean isCandidateAnswer() {
		return candidateAnswer;
	}

	public void setCandidateAnswer(boolean candidateAnswer) {
		this.candidateAnswer = candidateAnswer;
	}
	
	

}
