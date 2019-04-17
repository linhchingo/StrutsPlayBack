<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="l"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<l:empty name="products">
		<p>Khong co nguoi dung nao ca</p>
	</l:empty>

	<l:notEmpty name="products">
		<table>
			<tr>
				<th><b:message key="product.id"/> </th>
				<th><b:message key="product.name"/></th>
				<th><b:message key="product.quantity"/></th>
				<th><b:message key="product.sex"/></th>
				<th><b:message key="option"/></th>
			</tr>
			<l:iterate id="product" name="products">
			<tr>
			<td><b:write name="product" property="id"/> </td>
			<td><b:write name="product" property="name"/> </td>
			<td><b:write name="product" property="quantity"/> </td>
			<td>
			<l:equal value="false" name="product" property="sex">Male</l:equal>
			<l:equal value="true" name="product" property="sex">Female</l:equal>
			 </td>
			<td>Sua | Xoa | Chi Tiet</td>
			</tr>
			</l:iterate>
			
		</table>
	</l:notEmpty>
</body>
</html>