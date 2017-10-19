<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="./cabezera.jsp"%>


<html>
<%@ page session="false"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<div align="center">
		<h1>Editar Mesa</h1>
		<form:form action="guardar" method="post" modelAttribute="mesa"
			class="form-horizontal">

			<div class="form-group">
				<label class="col-sm-2 control-label"> Id Mesa</label>
				<div class="col-sm-5">
					<form:input type="text" path="idMesa" class="form-control"
						readonly="true" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Mesa</label>
				<div class="col-sm-5">
					<form:input type="text" path="mesa" class="form-control"
						required="required" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Activa</label>
				<div class="col-sm-5">
					<form:select path="activa" class="form-control">
						<form:option value="true">SI</form:option>
						<form:option value="false">NO</form:option>
					</form:select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">Comensales</label>
				<div class="col-sm-5">
					<form:input type="text" path="cantidadComensales"
						class="form-control" required="required" />
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
