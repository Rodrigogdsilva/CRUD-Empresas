<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/editaEmpresa" var="pathServletEditaEmpresa"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>

		<form action = "${pathServletEditaEmpresa }" method = "post">
		
			Nome: <input type = "text" name = "nome" value="${empresa.nome}"/>
			Data Abertura: <input type = "date" name = "dataAbertura" value="${empresa.dataAbertura }"/>
			<input type="hidden" name="id" value="${empresa.id }">			
			<input type = "submit" />
		
		</form>

	</body>
</html>