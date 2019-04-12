package com.ltsan.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ltsan.model.User;

public class HelloAction extends DispatchAction {

	
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		
		user.setName("ltsan");
		user.setAge(25);
		
		return mapping.findForward("addUser");
	}
	
	public ActionForward delUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		
		user.setName("ltsan");
		user.setAge(25);
		
		return mapping.findForward("delUser");
	}
	
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		
		user.setName("ltsan");
		user.setAge(25);
		
		return mapping.findForward("updateUser");
	}
	
	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		
		user.setName("ltsan");
		user.setAge(25);
		
		return mapping.findForward("viewUser");
	}
}
