package com.valuestack.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/***
 * 获取值栈对象
 * @author xiaohe
 *
 */


	


public class ValueStackAction extends ActionSupport{
	
	//定义
	 public String name;
	 //通过get给值栈传值
	public String getName() {
		return name;
	}
	@Override
	public String execute() throws Exception {
		//第一种方式   使用值栈对象的set方法
		
		//1.获取值栈对象
		ActionContext context = ActionContext.getContext();
		ValueStack stack = context.getValueStack();
		
		//2.调用方法set方法
		stack.set("user", "1234567");
		
		
		//第二种方法   push方法
		stack.push("1234");
		
		
		
		
		//第三种
		name = "sdafaaf";
		
		
		
		
		return "success";
		
		
	
		
	}
	


}
