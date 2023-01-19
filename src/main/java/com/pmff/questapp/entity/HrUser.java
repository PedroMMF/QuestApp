package com.pmff.questapp.entity;

import java.util.List;

public class HrUser {
	
	private int id;

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List<Questionnaire> questionnaires;
	
	private List<Candidate> Candidates;

	public HrUser() {
	}

	public HrUser(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Questionnaire> getQuestionnaires() {
		return questionnaires;
	}

	public void setQuestionnaires(List<Questionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}

	public List<Candidate> getCandidates() {
		return Candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		Candidates = candidates;
	}
	
	
}
