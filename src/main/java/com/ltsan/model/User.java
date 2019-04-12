package com.ltsan.model;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2701581141609235896L;
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
