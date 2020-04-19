<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>值栈的结构</title>
</head>
<body>
	<!-- 使用struts2 标签查看值栈的结构 -->
	
	
	<s:debug></s:debug>
	
	
	<!-- 获取值栈的字符串 -->
	<h1>获取值栈的字符串</h1>
	<s:property value="name"/>
	<hr>
	
	<!-- 获取值栈的对象 -->
	<h1>获取值栈的对象</h1>
	<s:property value="user.username"/>
	<s:property value="user.password"/>
	
	<hr>
	
	<!-- 第一种：获取值栈的list -->
	<h1>第一种：获取值栈的list</h1>
	<s:property value="list[0].username"/>
	<s:property value="list[0].password"/>
	<br>
	<!-- 第二种：获取值栈的list -->
	<h1>第二种：获取值栈的list</h1>
	<s:iterator value="list">
		<s:property value="username"/>
		<s:property value="password"/>
	</s:iterator>
	
	<br>
	<!-- 第三种：获取值栈的list -->
	<h1>第三种：获取值栈的list</h1>
	<s:iterator value="list" var="user">
		<s:property value="#user.username"/>
		<s:property value="#user.password"/>
	</s:iterator>
	
	<hr>
	
	<!-- 值栈的set方法设置的值          通过user（名字）  取值 -->
	<h1>值栈的set方法设置的值          通过user（名字）  取值</h1>
	<%-- 
	<s:property value="user"/>
--%>
	<hr>
	
	<!-- 值栈的push方法设置的值          取值 -->
	<h1>值栈的push方法设置的值          取值</h1>
	<s:property value="[0].top"/>
	
	<hr>
	<!-- 使用foreach 标签+el表达式获取值栈list集合数据 -->
	<h1> 使用foreach 标签+el表达式获取值栈list集合数据</h1>
	
	<c:forEach items="${list }" var="user"> 
		${user.username }
		${user.password }
		<br>
	</c:forEach>
</body>
</html>