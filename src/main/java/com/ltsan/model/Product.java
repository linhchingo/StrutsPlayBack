package com.ltsan.model;

import org.apache.struts.action.ActionForm;

public class Product extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2509128635669196568L;
	private String name;
	private int quantity;

	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
