<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="pathServletNovaEmpresa"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>

		<form action = "${pathServletNovaEmpresa }" method = "post">
		
			Nome: <input type = "text" name = "nome"/>
			Data Abertura: <input type = "date" name = "dataAbertura"/>
			
			<input type = "submit" />
		
		</form>

	</body>
</html>