<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>Nuevo pedido Terminado</h1>
	<h1>${ultimoPedido.pedidoTerminado}</h1>
	<h1>Pedidos llamados anteriores</h1>


	<h2>Numero de pedido Hora</h2>

	<c:forEach items="${pedidosanteriores}" var="pedido">

		<c:set var="fecha" value="${pedido.fecha}" />
		<c:set var="hora" value="${fn:substring(fecha, 6, 12)}" />
		<c:set var="hh" value="${fn:substring(hora, 0, 2)}" />
		<c:set var="mm" value="${fn:substring(hora, 2, 4)}" />


		<h2>${pedido.pedidoTerminado}      ${hh}:${mm}</h2>







	</c:forEach>


</body>
</html>