package com.ltsan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.ltsan.model.Product;
import com.ltsan.service.ProductService;

public class ProductAction extends MappingDispatchAction {


	public ActionForward addProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		
		return mapping.findForward("addProduct");
	}
	public ActionForward delProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		return mapping.findForward("delProduct");
	}
	public ActionForward updateProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
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
		
		int id = Integer.valueOf(request.getParameter("productId")) ;
		
		ProductService productService = new  ProductService();
		Product product = productService.findProductById(id);
		
		
		request.setAttribute("product", product);
		
		return mapping.findForward("viewProduct");
		
	}
	
	public ActionForward listProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ProductService productService = new ProductService();
		List<Product> products = productService.getProducts();
		
		request.setAttribute("products", products);
		
		return mapping.findForward("listProduct");
	}
}
