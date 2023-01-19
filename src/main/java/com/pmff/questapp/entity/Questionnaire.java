package com.pmff.questapp.entity;

import java.util.List;

public class Questionnaire {
	
	private int id;
	
	private String title;
	
	private String subject;
	
	private int level;
	
	private List<Test> tests;

	public Questionnaire() {
	}

	public Questionnaire(String title, String subject, int level) {
		this.title = title;
		this.subject = subject;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
}
