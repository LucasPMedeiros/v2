<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style>
	.error {color: red}
</style>
<meta charset="UTF-8">
<title>Pessoa Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="Pessoa">
	
		Nome: <form:input path="Nome"/>
		<form:errors path="Nome" cssClass="error"/>
		<br>
				
		Genero: <form:input path="Genero"/>
				<form:errors path="Genero" cssClass="error"/>
		<br>
		
		Idade: 
		<form:input path="Idade"/>
		<form:errors path="Idade" cssClass="error"/>
		<br>
			
		<form:select path="servico">
			<form:options items="${pessoa.Servico}" />
		</form:select>
		
		<br><br>
						
		<input type="submit" value="Submit"/>
		
	</form:form>

</body>
</html>