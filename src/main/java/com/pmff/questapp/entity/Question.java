package com.pmff.questapp.entity;

import java.util.List;

public class Question {
	
	private int id;
	
	private String text;
	
	private String subject;
	
	private int level;
	
	private List<Answer> answers;

	public Question() {

	}

	public Question(String text, String subject, int level) {
		this.text = text;
		this.subject = subject;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}
