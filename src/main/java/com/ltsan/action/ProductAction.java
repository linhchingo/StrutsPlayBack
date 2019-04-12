package com.ltsan.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.ltsan.model.Product;

public class ProductAction extends MappingDispatchAction {


	public ActionForward addProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		
		return mapping.findForward("addProduct");
	}
	public ActionForward delProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Product product = (Product) form;
		
		product.setName("iphone");
		product.setQuantity(25);
		
		return mapping.findForward("delProduct");
	}
	public ActionForward updateProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Product product = (Product) form;
		
		product.setName("iphone");
		product.setQuantity(25);
		
		return mapping.findForward("updateProduct");
	}
	public ActionForward viewProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		Product product = (Product) form;
//		
//		String name = request.getParameter("name");
//		int quantity = Integer.valueOf(request.getParameter("quantity"));
//				
//		
//		product.setName(name);
//		product.setQuantity(quantity);
		
		return mapping.findForward("viewProduct");
		
	}
}
