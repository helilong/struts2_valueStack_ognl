package com.valuestack.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/***
 * ��ȡֵջ����
 * @author xiaohe
 *
 */


	


public class ValueStackAction extends ActionSupport{
	
	//����
	 public String name;
	 //ͨ��get��ֵջ��ֵ
	public String getName() {
		return name;
	}
	@Override
	public String execute() throws Exception {
		//��һ�ַ�ʽ   ʹ��ֵջ�����set����
		
		//1.��ȡֵջ����
		ActionContext context = ActionContext.getContext();
		ValueStack stack = context.getValueStack();
		
		//2.���÷���set����
		stack.set("user", "1234567");
		
		
		//�ڶ��ַ���   push����
		stack.push("1234");
		
		
		
		
		//������
		name = "sdafaaf";
		
		
		
		
		return "success";
		
		
	
		
	}
	


}
