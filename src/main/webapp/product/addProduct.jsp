<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b" %>
 <%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="view-Product.do">
Ten San Pham: <input name="name" type="text" />
So Luong: <input name="quantity" type="text" />
<input type="submit" value="Them" />
</form> -->

<h:form action="view-Product.do" method="post">
Ten San Pham: <h:text property="name" name="product"></h:text><br/>
So Luong: <h:text property="quantity" name="product"></h:text><br/>
<h:submit>Them</h:submit>
</h:form>

</body>
</html>