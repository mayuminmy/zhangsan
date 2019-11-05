<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>永和大王门店管理系统</title>
	</head>
	<body style="padding: 20px;">
		<div style="padding: 5px;">
			<h1>永和大王门店管理系统-订单管理</h1>
		</div>
		<a href="orderAdd">新增</a>
		<table border="1" cellspacing="0">
			<tr align="center">
				<th>序号</th>
				<th>订单号</th>
				<th>类型</th>
				<th>人数</th>
				<th>收银员</th>
				<th>下单时间</th>
				<th>结账时间</th>
				<th>支付类型</th>
				<th>价格</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${orderList}" var="o" varStatus="i">
				<tr>
					<td align="center">${i.index+1}</td>
					<td>${o.orderNo}</td>
					<td align="center">${o.orderType}</td>
					<td align="center">${o.personNum}</td>
					<td align="center">${o.cashier}</td>
					<td align="center"><fmt:formatDate value="${o.createdTime}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td align="center"><fmt:formatDate value="${o.endTime}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td align="center">${o.paymentType}</td>
					<td align="right">${o.price}</td>
					<td>
						<a href="toUpdateOrder?id=${o.id}">修改</a> 
						<a href="delete?id=${o.id}">删除</a> 
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
