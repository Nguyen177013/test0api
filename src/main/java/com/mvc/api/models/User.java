package com.mvc.api.models;

public class User extends Account{
	private int score;
	
	public User(String userName, String password, int score) {
		// TODO Auto-generated constructor stub
		super(userName, password);
		this.score = score;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
