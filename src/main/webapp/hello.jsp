<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello page</title>
</head>
<body>
<h1><b:write name="user" property="name"/></h1>
<h2><b:write name="user" property="age" format="#####"/></h2>

</body>
</html>