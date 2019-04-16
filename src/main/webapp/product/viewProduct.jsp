<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<b:write name="product" property="name" scope="request"/>
	</h1>
	<h2>
		<b:write name="product" property="quantity" format="#####" />
	</h2>
	<h2>
		<b:write name="product" property="sex"  />
	</h2>
	<h2>
		<b:write name="product" property="feature"  />
	</h2>
	<h2>
		<b:write name="product" property="type"  />
	</h2>
	<h2>
		<b:write name="product" property="supplier"  />
	</h2>

</body>
</html>