package com.api.models;

public class Admin extends Account{
	private String code;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(String userName, String password, String code) {
		super(userName, password);
		this.code = code;
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
