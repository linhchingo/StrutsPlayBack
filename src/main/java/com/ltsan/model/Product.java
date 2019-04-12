package com.ltsan.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Product extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2509128635669196568L;
	private String name;
	private int quantity;
	private boolean sex;
	private String feature;
	private String type;
	private String supplier;

	

	public Product(String name, int quantity, boolean sex, String feature, String type, String supplier) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.sex = sex;
		this.feature = feature;
		this.type = type;
		this.supplier = supplier;
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new  ActionErrors();
		
		if (StringUtils.isEmpty(this.getName())) {
			actionErrors.add("product.name.require", new ActionMessage("errors.product.name.require"));
		}
		if (this.getQuantity() < 0) {
			actionErrors.add("product.quantity.require",new ActionMessage("errors.product.quantity.require"));
		}
		
		
		
		return actionErrors;
				
	}
	

}
