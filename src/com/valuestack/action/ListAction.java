package com.valuestack.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.pojo.User;

public class ListAction extends ActionSupport{
	
	//list 向值栈 传值
	private List<User> list = new ArrayList<User>();
	
	public List<User> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		User user1 = new User();
		user1.setUsername("hexiao");
		user1.setPassword("123");
		
		User user2 = new User();
		user2.setUsername("hexia位6uio");
		user2.setPassword("123345678");
		
		list.add(user1);
		list.add(user2);
		return "success";
	}
	
	
}
