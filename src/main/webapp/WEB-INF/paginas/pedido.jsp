<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page import="datos.Mesa"%>
<%@page import="funciones.Funciones"%>

<%@ include file="./cabezera.jsp"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>
	<h3 align="center">Pedidos</h3>
	<div align="center">
		<table class="table table-striped" style="width: 80%">
			<tr class=info>
				<th>ID Pedido</th>
				<th>Fecha</th>
				<th>Hora Carga</th>
				<th>Mesa</th>
				<th>Mozo</th>
				<th></th>
			<tr>
				<c:forEach var="m" items="${lstPedidos}">
					<tr>
						<td>${m.idPedido}</td>
						<td>${Funciones.imprimirFecha(m.fecha)}</td>
						<td>${Funciones.imprimirHora(m.horaCarga)}</td>
						<td>${m.mesa.getMesa()}</td>
						<td>${m.mozo.getIdMozo()}</td>
						<td><a href="pedido/cargar/${m.idPedido}"
							class="btn btn-primary">Ver / Cargar</a></td>
					</tr>

				</c:forEach>
		</table>
		<!--
		<a data-toggle="modal" href="#confirmacion"
			class="btn btn-primary btn-large">Abrir ventana modal</a>

	</div>
	<div class="modal fade" id="confirmacion" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Confirmar</h4>
				</div>
				<div class="modal-body">
					<p>Seguro desea eliminar?&hellip;</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<a href="borrar/${m.idMesa}" class="btn btn-primary">Borrar:
						${m.idMesa}</a>
				</div>
			</div>
			<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
	</div>


</body>
</html>