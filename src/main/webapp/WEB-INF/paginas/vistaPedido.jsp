<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@ page
	session="false"%>
<%@page import="datos.Mesa"%>
<%@page import="funciones.Funciones"%>

<%@ include file="./cabezera.jsp"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>


	<div align="center">

		<h3 align="center">Mesa: ${pedido.getMesa().getMesa()}</h3>
		<input id="pedido" value="${pedido.idPedido}" type="hidden">
		<table class="table table-striped" style="width: 80%">
			<tr class=info>
				<th>Producto</th>
				<th>Precio</th>
				<th>Cantidad</th>
				<th>Sub Total</th>
				<th></th>

			</tr>
			<tr>
				<td></td>
				<c:forEach var="m" items="${pedidoCant}">
					<tr>
						<td>${m.getProducto().getProducto()}</td>
						<td>${m.getProducto().getPrecio()}</td>
						<td>${m.cantidad}</td>
						<td>${m.cantidad}${m.getProducto().getPrecio()}</td>
						<td><a  href="pedido/borrarProducto/${m.getIdProductoCantidad()}">BORRAR</a></td>

					</tr>

				</c:forEach>
			<tr>
				<td>Total: ${m.getProducto().getProducto()}</td>


			</tr>


		</table>






		<div class="form-group">
			<label class="col-sm-2 control-label">Cargar Producto</label>
			<div class="col-sm-5">
				<select class="form-control" id="opcion">
					<option value="NONE">SELECCIONE TIPO PRODUCTO</option>
					<c:forEach var="m" items="${lstTipoProducto}">
						<option value="${m.idTipoProducto}">${m.tipoProducto}</option>
					</c:forEach>
				</select>
			</div>
		</div>



		<div class="form-group" id="resultado"></div>

	</div>
</body>
</html>
<%@ include file="./footer.jsp"%>
