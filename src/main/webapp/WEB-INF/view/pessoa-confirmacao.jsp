<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Pessoa Confirmada: ${ pessoa.Nome } 
	<br>
	
	Genero: ${ pessoa.Genero }
	
	<br>
	Idade: ${ pessoa.Idade }
	
	<br>
	
	Servi�o:
	<ul>
		<c:forEach var="opSys" items="${ pessoa.Servico }">
			
			<li> ${ opSys } </li>
		
		</c:forEach>
	</ul>
</body>
</html>