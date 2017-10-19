<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page import="datos.Mesa"%>
<%@ include file="./cabezera.jsp"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>
	<h3 align="center">Lista Mesas</h3>
	<div align="center">
		<table class="table table-striped" style="width: 80%">
			<tr class=info>
				<th>ID</th>
				<th>Numero Mesa</th>
				<th>Activa</th>
				<th>Comensales</th>
			<tr>
				<c:forEach var="m" items="${lstMesas}">
					<tr>

						<td>${m.idMesa}</td>
						<td>${m.mesa}</td>
						<td>${m.activa}</td>
						<td>${m.cantidadComensales}</td>




						<td><a href="mesa/editar/${m.idMesa}"> <span
								class="glyphicon glyphicon-pencil"></span> <a
								href="mesa/borrar/${m.idMesa}"> <span
									class="glyphicon glyphicon-trash"></span></a>
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