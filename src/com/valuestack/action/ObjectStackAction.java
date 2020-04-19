package com.valuestack.action;


import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.pojo.User;

/***
 * 获取值栈对象
 * @author xiaohe
 *
 */


	


public class ObjectStackAction extends ActionSupport{
	
	//创建对象
	private User user = new User();
	
	//get方法
	public User getUser() {
		return user;
	}


	@Override
	public String execute() throws Exception {
		
		//放值
		user.setUsername("xioahe");
		user.setPassword("1234567");
		return "success";
	}
	


}
