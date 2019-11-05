<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>永和大王门店管理系统</title>
	</head>
	<body style="padding:20px;">
		<div style="padding: 5px;">
			<h1>永和大王门店管理系统-订单添加</h1>
		</div>
		<form action="addOrder" method="post">
		<div>
			<table border="1" cellspacing="0">
				<tr>
					<td>所属门店：</td>
					<td>
						<select name="doorId">
							<option value="">--请选择--</option>
							<c:forEach items="${doorList}" var="door">
								<option value="${door.id}">${door.doorName}</option>
							</c:forEach>
						</select>
					</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>订单号：</td>
					<td><input type="text" name="orderNo" value=""/></td>
					<td>订单类型：</td>
					<td><input type="text" name="orderType" value=""/></td>
				</tr>
				<tr>
					<td>人数：</td>
					<td><input type="text" name="personNum" value=""/></td>
					<td>收银员：</td>
					<td><input type="text" name="cashier" value=""/></td>
				</tr>
				<tr>
					<td>开单时间：</td>
					<td><input type="text" name="createdTime" value=""/></td>
					<td>结账时间：</td>
					<td><input type="text" name="endTime" value=""/></td>
				</tr>
				<tr>
					<td>支付方式：</td>
					<td><input type="text" name="paymentType" value=""/></td>
					<td>支付金额：</td>
					<td><input type="text" name="price" value=""/></td>
				</tr>
			</table>
			
			<br/>
			&nbsp;&nbsp;
			<input type="submit" name="ok" value="提交"/>
			<input type="button" onclick="history.go(-1);" name="back" value="返回"/>
		</div>
	</form>
	</body>						
</html>
