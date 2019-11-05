<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>永和大王门店管理系统</title>
</head>
<body style="padding: 20px;">

	<div style="padding: 5px;">
		<h1>永和大王门店管理系统-门店更新</h1>
	</div>

	<form action="update" method="post">
	
<input type="hidden" name="id" value="${door.id}"/>

		名称：<input type="text" name="doorName" value="${door.doorName}"/>
		电话：<input type="text" name="tel" value="${door.tel}"/>
		
		<input type="submit" value="提交">
	</form>
</body>

</html>
