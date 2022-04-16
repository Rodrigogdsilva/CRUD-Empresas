<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="pathServletEntrada" />
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:import url="logout.jsp" />

	<form action="${pathServletEntrada}" method="post">

		Nome: <input type="text" name="nome" value="${empresa.nome}" /> Data
		Abertura: <input type="date" name="dataAbertura"
			value="${empresa.dataAbertura }" /> <input type="hidden" name="id"
			value="${empresa.id }"> <input type="hidden" name="acao"
			value="EditaEmpresa" /> <input type="submit" />

	</form>

</body>
</html>