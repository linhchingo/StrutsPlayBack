<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="view-Product.do">
Ten San Pham: <input name="name" type="text" />
So Luong: <input name="quantity" type="text" />
<input type="submit" value="Them" />
</form> -->
	<p style="color: red">
		<h:errors />
	</p>


	<h:form action="view-Product.do" method="post">
		<p>
			<b:message key="product.name" />
		</p>

		<h:messages id="name_error" property="product.name.require">
			<p style="color: red">
				<b:write name="name_error"/>
			</p>
		</h:messages>


		<h:text property="name" name="product"></h:text>
		<br />
		<br />
		<p>
			<b:message key="product.quantity" />
		</p>
		
		<h:messages id="quantity_error" property="product.quantity.require">
			<p style="color: red">
				<b:write name="quantity_error"/>
			</p>
		</h:messages>
		<h:text property="quantity" name="product"></h:text>
		<br />
		<br />
		<p>
			<b:message key="product.sex" />
		</p>
		<h:radio property="sex" value="true" name="product">Nam</h:radio>
		<h:radio property="sex" value="false" name="product">Nữ</h:radio>
		<br />
		<br />
		<p>
			<b:message key="product.feature" />
		</p>
		<h:textarea property="feature" name="product"></h:textarea>
		<br />
		<br />
		<p>
			<b:message key="product.type" />
		</p>
		<h:checkbox property="type" name="product" value="Tay dai">Tay Dai</h:checkbox>
		<h:checkbox property="type" name="product" value="Thun">Thun</h:checkbox>
		<h:checkbox property="type" name="product" value="Co co">Co co</h:checkbox>
		<br />
		<br />
		<p>
			<b:message key="product.supplier" />
		</p>
		<h:select property="supplier" name="product">
			<h:option value="AP">Apple</h:option>
			<h:option value="XM">Xiaomi</h:option>
			<h:option value="SS">Sam Sung</h:option>
			<h:option value="LV">Levis</h:option>
			<h:option value="AP">Apple</h:option>
		</h:select>
		<br />
		<br />
		<h:submit>Them</h:submit>
	</h:form>

</body>
</html>