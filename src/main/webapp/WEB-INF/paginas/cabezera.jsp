<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="./js.jsp"%>


<title></title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				
				<div class="btn-group">
					<br>
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Pedido <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a  href="pedido/pedidos">Lista Pedidos</a></li>
						<li><a  href="pedido/nuevo">Nuevo Pedido</a></li>
					</ul>
				</div>
				<div class="btn-group">
					<br>
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Mesas <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a  href="mesa/mesas">Lista Mesas</a></li>
						<li><a  href="mesa/nuevo">Nueva Mesa</a></li>
					</ul>
				</div>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">


					<li><a href="#">Administracion</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<br>
	<br>
	<br>