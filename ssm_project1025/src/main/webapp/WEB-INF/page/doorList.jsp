<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>永和大王门店管理系统</title>
</head>
<body style="padding: 20px;">

	<div style="padding: 5px;">
		<h1>永和大王门店管理系统-门店列表</h1>
	</div>

	<div>
		<a href="addDoor">新增</a>
		<table border="1" cellspacing="0">
			<tr align="center" style="font-weight: bold;">
				<td>序号</td>
				<td>门店名称</td>
				<td>联系电话</td>
				<td>操作</td>
			</tr>
		<c:forEach items="${doorList}" var="o" varStatus="i">
				<tr>
					<td align="center">${i.index+1}</td>
					<td>${o.doorName}</td>
					<td>${o.tel}</td>
					<td>
						
						<a href="toUpdate?id=${o.id }">修改</a>
						<a href="delete?id=${o.id }">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>
