<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page import="datos.TipoProducto"%>
<html>
<head>
<title></title>

</head>
<body>
	<br>
	<h3>Lista TipoProducto</h3>
	<div align="center">
		<table class="tg">
			<tr>
				<th width="80">TipoProducto ID</th>
				<th width="120">TipoProducto</th>
			<tr>



				<c:forEach var="m" items="${lst}">
					<tr>

						<td>${m.idTipoProducto}</td>
						<td>${m.tipoProducto}</td>

					</tr>
				</c:forEach>
		</table>
</body>
</html>