package com.pmff.questapp.entity;

public class QuestionAnswer {
	
	private int question_id;
	
	private int answer_id;
	
	private boolean correctAnswer;

	public QuestionAnswer() {

	}

	public QuestionAnswer(boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
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

	public boolean isCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	

}
