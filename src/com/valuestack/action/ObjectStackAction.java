package com.valuestack.action;


import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.pojo.User;

/***
 * ��ȡֵջ����
 * @author xiaohe
 *
 */


	


public class ObjectStackAction extends ActionSupport{
	
	//��������
	private User user = new User();
	
	//get����
	public User getUser() {
		return user;
	}


	@Override
	public String execute() throws Exception {
		
		//��ֵ
		user.setUsername("xioahe");
		user.setPassword("1234567");
		return "success";
	}
	


}
