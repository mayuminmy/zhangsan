<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>永和大王门店管理系统</title>
</head>
<body style="padding:20px;">
<div style="padding: 5px;">
		<h1>永和大王门店管理系统-订单修改</h1>
	</div>
<form action="update" method="post">
	<input type="hidden" name="id" value="${order.id}"/>
	
	<div>
		<table border="1">
			<tr>
				<td>所属门店：</td>
				<td>
					<select name="doorId">
						<option value="">--请选择--</option>
						<c:forEach items="${doorList}" var="d">
							<option value="${d.id}"
								<c:if test="${d.id==order.doorId}">selected</c:if>
							>${d.doorName}</option>
						</c:forEach>
					</select>
				</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>订单号：</td>
				<td><input type="text" name="orderNo" value="${order.orderNo}"/></td>
				<td>订单类型：</td>
				<td><input type="text" name="orderType" value="${order.orderType}"/></td>
			</tr>
			<tr>
				<td>人数：</td>
				<td><input type="text" name="personNum" value="${order.personNum}"/></td>
				<td>收银员：</td>
				<td><input type="text" name="cashier" value="${order.cashier}"/></td>
			</tr>
			<tr>
				<td>开单时间：</td>
				<td><input type="text" name="createdTime" value="<fmt:formatDate value="${order.createdTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
				<td>结账时间：</td>
				<td><input type="text" name="endTime" value="<fmt:formatDate value="${order.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
			</tr>
			<tr>
				<td>支付方式：</td>
				<td><input type="text" name="paymentType" value="${order.paymentType}"/></td>
				<td>支付金额：</td>
				<td><input type="text" name="price" value="${order.price}"/></td>
			</tr>
		</table>
		
		<br/>
		&nbsp;&nbsp;
		<input type="submit" name="ok" value="提交"/>
	</div>
</form>
</body>
</html>
