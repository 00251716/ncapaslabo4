<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="user">
		
		<label> Ingrese un nombre: </label>
		<form:input type = "text" name="name" path="name"/>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors><br>
		
		<label> Ingrese un nombre de usuario: </label>
		<form:input type = "text" name="username" path="username"/><br>
		
		<label> Ingrese una clave: </label>
		<form:input type = "password" name="password" path="pass"/>
		<form:errors path="pass" cssStyle="color:#E81505;"></form:errors><br>
		
		<input type="submit" value="Agregar usuario">
	</form:form>
</body>
</html>
