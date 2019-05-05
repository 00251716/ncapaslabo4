<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.form-style-2{
	max-width: 500px;
	padding: 20px 12px 10px 20px;
	font: 13px Arial, Helvetica, sans-serif;
}
.form-style-2-heading{
	font-weight: bold;
	font-style: italic;
	border-bottom: 2px solid #ddd;
	margin-bottom: 20px;
	font-size: 15px;
	padding-bottom: 3px;
}
.form-style-2 label{
	display: block;
	margin: 0px 0px 15px 0px;
}
.form-style-2 label > span{
	width: 100px;
	font-weight: bold;
	float: left;
	padding-top: 8px;
	padding-right: 5px;
}
.form-style-2 span.required{
	color:red;
}
.form-style-2 .tel-number-field{
	width: 40px;
	text-align: center;
}
.form-style-2 input.input-field, .form-style-2 .select-field{
	width: 48%;	
}
.form-style-2 input.input-field, 
.form-style-2 .tel-number-field, 
.form-style-2 .textarea-field, 
 .form-style-2 .select-field{
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	border: 1px solid #C2C2C2;
	box-shadow: 1px 1px 4px #EBEBEB;
	-moz-box-shadow: 1px 1px 4px #EBEBEB;
	-webkit-box-shadow: 1px 1px 4px #EBEBEB;
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	padding: 7px;
	outline: none;
}
.form-style-2 .input-field:focus, 
.form-style-2 .tel-number-field:focus, 
.form-style-2 .textarea-field:focus,  
.form-style-2 .select-field:focus{
	border: 1px solid #0C0;
}
.form-style-2 .textarea-field{
	height:100px;
	width: 55%;
}
.form-style-2 input[type=submit],
.form-style-2 input[type=button]{
	border: none;
	padding: 8px 15px 8px 15px;
	background: #FF8500;
	color: #fff;
	box-shadow: 1px 1px 4px #DADADA;
	-moz-box-shadow: 1px 1px 4px #DADADA;
	-webkit-box-shadow: 1px 1px 4px #DADADA;
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
}
.form-style-2 input[type=submit]:hover,
.form-style-2 input[type=button]:hover{
	background: #EA7B00;
	color: #fff;
}
</style>
<meta charset="UTF-8">
<title>Registro de producto</title>
</head>
<body>

<div class="form-style-2">
	<div class="form-style-2-heading"> Ingrese los detalles del producto </div>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">
	
		<label><span>Nombre: <span class="required">*</span></span><form:input type = "text" name="name" path="name"/> </label>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors> 
		
		
		<label><span>Marca: <span class="required">*</span></span><form:input type = "text" name="marca" path="marca"/> </label>	
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors>
		
		<label><span>Descripci&oacute;n: <span class="required">*</span></span><form:textarea name="description" path="description" rows="3" cols="20"/> </label>
		<span><form:errors path="description" cssStyle="color:#E81505;"></form:errors> </span>
		
		<label><span>Categor&iacute;a: <span class="required">*</span></span><form:input type="text" name="category" path="category" /> </label>
		<form:errors path="category" cssStyle="color:#E81505;"></form:errors> 
	
		
		<label><span>Precio: <span class="required">*</span></span><form:input type="number" step="0.01" name="price" path="price" /> </label>
		<form:errors path="price" cssStyle="color:#E81505;"></form:errors> 
		
		
		
		<label><span>Fecha de vencimiento:<span class="required">*</span> <span>(dd/mm/yyyy) </span> </span><form:input type="date" name="expirationDate" path="expirationDate" /> </label>
		<form:errors path="expirationDate" cssStyle="color:#E81505;"></form:errors> 

		<br><br>
		<label><span></span><input type="submit" value="Agregar producto"> </label>
		</form:form>
</div>


</body>
</html>
