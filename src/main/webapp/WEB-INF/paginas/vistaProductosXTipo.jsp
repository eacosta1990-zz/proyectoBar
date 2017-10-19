<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@ page
	session="false"%>
<html>
<head>
<title></title>
</head>
<body>
	<br>
	<div align="center">
		<form:form action="guardarProducto" method="POST"
			modelAttribute="productoCantidad" class="form-horizontal">
			<div align="center">
				<div class="form-group">
					<label class="col-sm-2 control-label">Producto </label>
					<div class="col-sm-5">
						<form:select path="producto" class="form-control">
							<option value="NONE">SELECCIONE PRODUCTO</option>
							<c:forEach var="m" items="${lstProducto}">
								<form:option value="${m.idProducto}">${m.producto}</form:option>
							</c:forEach>
						</form:select>
						Cantidad
						<form:input type="number" path="cantidad" />
						<br>
						<form:input path="pedido" type="hidden" value="${idPedido}" />

					</div>
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