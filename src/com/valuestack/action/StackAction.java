package com.valuestack.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/***
 * ��ȡֵջ����
 * @author xiaohe
 *
 */
public class StackAction extends ActionSupport{
	
	
	@Override
	public String execute() throws Exception {
		//1.��ȡActionContext�����
		 ActionContext context	= ActionContext.getContext();
		//2.���ڷ����õ�ֵջ����
		 ValueStack stack = context.getValueStack();
		 
		 
		 ValueStack stack2 = context.getValueStack();
		 //ÿ��ֵջ����ֻ��һ�� �������ַ�Ա�     true��
		 System.out.println(stack==stack2);
		return NONE;
	}
	


}
