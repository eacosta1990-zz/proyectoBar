<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {

		$('#agregarMesa').click(function() {
			var mensaje = $('#success').text();
			$('#success').text("");
			$('#success').removeClass('alert alert-success');
			var mensaje = $('#error').text();
			$('#error').text("");
			$('#error').removeClass('alert alert-danger');

			$.ajax({
				method : "GET",
				url : "mesa/nuevo",
				async : false
			}).done(function(data) {
				$("#resultado").html(data);
			})

		});

		$('#verMesas').click(function() {
			var mensaje = $('#success').text();
			$('#success').text("");
			$('#success').removeClass('alert alert-success');
			var mensaje = $('#error').text();
			$('#error').text("");
			$('#error').removeClass('alert alert-danger');

			$.ajax({
				method : "GET",
				url : "mesa/mesas",
				async : false
			}).done(function(data) {
				$("#resultado").html(data);
			})

		});

		$('#agregarPedido').click(function() {
			var mensaje = $('#success').text();
			$('#success').text("");
			$('#success').removeClass('alert alert-success');
			var mensaje = $('#error').text();
			$('#error').text("");
			$('#error').removeClass('alert alert-danger');

			$.ajax({
				method : "GET",
				url : "pedido/nuevo",
				async : false
			}).done(function(data) {
				$("#resultado").html(data);
			})

		});

		$('#verPedidos').click(function() {
			var mensaje = $('#success').text();
			$('#success').text("");
			$('#success').removeClass('alert alert-success');
			var mensaje = $('#error').text();
			$('#error').text("");
			$('#error').removeClass('alert alert-danger');

			$.ajax({
				method : "GET",
				url : "pedido/pedidos",
				async : false
			}).done(function(data) {
				$("#resultado").html(data);
			})

		});

		$("#opcion").change(function() {
			var id = $('select[id=opcion]').val();
			var pedido = $('#pedido').val();
alert(pedido);
			$.ajax({
				method : "POST",
				url : "productos",
				data : {
					id : id,
					pedido : pedido

				},
				async : false
			}).done(function(data) {
				$("#resultado").html(data);
			})

		});

	});
</script>