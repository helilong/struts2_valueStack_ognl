<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>获取context里面的数据 写ognl时候 首先添加符号      #context的key名称。域对象名称</h1>
<s:property value="#request.req"/>

<hr>


<s:textarea name="username" value="%{#request.req}"></s:textarea>
</body>
</html>