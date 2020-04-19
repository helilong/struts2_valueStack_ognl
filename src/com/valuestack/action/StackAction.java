package com.valuestack.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/***
 * 获取值栈对象
 * @author xiaohe
 *
 */
public class StackAction extends ActionSupport{
	
	
	@Override
	public String execute() throws Exception {
		//1.获取ActionContext类对象
		 ActionContext context	= ActionContext.getContext();
		//2.调节方法得到值栈对象
		 ValueStack stack = context.getValueStack();
		 
		 
		 ValueStack stack2 = context.getValueStack();
		 //每个值栈对象只有一个 （对象地址对比     true）
		 System.out.println(stack==stack2);
		return NONE;
	}
	


}
