<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	this is welcome page
	<br />

	<h:button property="hello" value="hello"></h:button>

	<form action="hello.do?method=addUser" method="post">
		<input type="submit" value="Add " />
	</form>
	<form action="hello.do?method=delUser" method="post">
		<input type="submit" value="del " />
	</form>
	<form action="hello.do?method=updateUser" method="post">
		<input type="submit" value="update " />
	</form>
	<form action="hello.do?method=viewUser" method="post">
		<input type="submit" value="view " />
	</form>

	<h:form action="hello">
		<h:submit>Heooooooo</h:submit>
	</h:form><br /><br />
	

	<form action="add-Product.do" method="post">
		<input type="submit" value="Add Product" />
	</form>
	<form action="dell-Product.do" method="post">
		<input type="submit" value="Delete Product" />
	</form>
	<form action="update-Product.do" method="post">
		<input type="submit" value="Update Product" />
	</form>
	<form action="view-Product.do" method="post">
		<input type="submit" value="View Product" />
	</form>
	
	<form action="list-Product.do" method="post">
		<input type="submit" value="List Product" />
	</form>
	




</body>
</html>