<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="./cabezera.jsp"%>

<html>
<%@ page session="false"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pedido Nuevo</title>
</head>
<body>
	<div align="center">
		<form:form action="pedido/guardar" method="GET"
			modelAttribute="mesa" class="form-horizontal">

			<div class="form-group">
				<label class="col-sm-2 control-label">Mesas Activas</label>
				<div class="col-sm-5">
					<form:select path="idMesa" class="form-control">
						<c:forEach var="m" items="${lstMesa}">
							<form:option value="${m.getIdMesa()}">${m.getMesa()}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>

			<table style="width: 20%">
				<tr>
					<td><a href="/bar" class="btn btn-primary">Cancelar</a></td>
					<td>
						<button class="btn btn-primary" type="submit">Guardar</button>
					</td>
				</tr>
			</table>


		</form:form>
	</div>

</body>
</html>