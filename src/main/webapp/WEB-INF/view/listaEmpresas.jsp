<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada?acao=MostraEmpresa" var="pathServletMostraEmpresa"/>
<c:url value="/entrada?acao=RemoveEmpresa" var="pathServletRemoveEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Stand Taglib</title>
</head>
	<body>
	
		<c:if test="${not empty empresa}" >
			Empresa ${empresa} cadastrada com sucesso !	
		</c:if>

		Lista de empresas:	<br />
		
		<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li> ${ empresa.nome } - ${empresa.dataAbertura}
			<a href= "${pathServletMostraEmpresa}&id=${empresa.id}">Editar</a>
			<a href= "${pathServletRemoveEmpresa}&id=${empresa.id}">Remover</a>			
			 </li>
		</c:forEach>
		
		</ul>

	</body>
</html>