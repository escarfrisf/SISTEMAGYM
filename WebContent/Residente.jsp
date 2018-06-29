<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<jsp:include page="general.jspf"></jsp:include>
<title>Dashboard Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<!--     <link href="../../dist/css/bootstrap.min.css" rel="stylesheet"> -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!--     <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet"> -->

<!-- Custom styles for this template -->
<link href="resources/css/dashboard.css" rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="resources/fonts/font-awesome-4.7.0/fonts/glyphicons-halflings-regular.woff2">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!--     <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
			<a class="navbar-brand" href="#" style="font-family: fantasy;">GIBORYIM</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Dashboard</a></li>

				<li><a href="#">PERFIL</a></li>
				<li><a href="#">AYUDA</a></li>
			</ul>
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search...">
			</form>
		</div>
	</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar" style="background: #241f1f;">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">MENU PRINCIPAL <span
							class="sr-only">(current)</span></a></li>

				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Busqueda de Usuario</a></li>
					<li><a href="registarC.jsp" id="boton"  >Registrar cliente</a></li>
					<li><a href="RealizarM.jsp" id= "">Realizar matriucula</a></li>
					<li><a href="RealizarPago.jsp">Gestionaar pago</a></li>
					<li><a href="">Gestionaar Boleta</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Registrar asistencia</a></li>
					<li><a href="">Gestionar estado cliente</a></li>
					
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<div id="capa">

					<div class="container" id="tabla">
						<h1
							style="margin-left: 340px; font-family: Georgia; color: #3385FF;">Realizar
							Busqueda de cliente</h1>

						<div class="input-group" style="left: 260px; margin: auto;">
							<span class="input-group-addon">Buscar</span> <input id="filtrar"
								type="text" class="form-control" style="width: 50%;"
								placeholder="Ingresa la canción de este Disco que deseas Buscar...">
						</div>

						<table class="table table-hover">
							<thead>
								<tr>
									<th>ID</th>
									<th>Nombre</th>
									<th>Apellidos</th>
									<th>DNI</th>
									<th>Correo</th>
									<th>Telefono</th>
									<th>Estadocliente</th>
									<!--             <th>idmatricula</th>             -->
									<!--             <th>tipicliente</th> -->
									<th>Modificar</th>


								</tr>
							</thead>
							<tbody class="buscar" id="data2">
								<!--           <tr><td>1UuaX3kHs5iKD1mFFsArHq</td><td>1</td><td>Till The Sky Falls Down - Vocal Mix</td><td><a target="_blank" alt="Till The Sky Falls Down - Vocal Mix" title="Till The Sky Falls Down - Vocal Mix" href=https://api.spotify.com/v1/tracks/1UuaX3kHs5iKD1mFFsArHq >Ver Detalles</a></td><td><a target="_blank" alt="Till The Sky Falls Down - Vocal Mix" title="Till The Sky Falls Down - Vocal Mix" href=https://open.spotify.com/track/1UuaX3kHs5iKD1mFFsArHq >Reproducir</a></td></tr><tr><td>4f0dhdt7rjOgUEv7HmF4rM</td><td>2</td><td>Man On The Run - Original Vocal Mix</td><td><a target="_blank" alt="Man On The Run - Original Vocal Mix" title="Man On The Run - Original Vocal Mix" href=https://api.spotify.com/v1/tracks/4f0dhdt7rjOgUEv7HmF4rM >Ver Detalles</a></td><td><a target="_blank" alt="Man On The Run - Original Vocal Mix" title="Man On The Run - Original Vocal Mix" href=https://open.spotify.com/track/4f0dhdt7rjOgUEv7HmF4rM >Reproducir</a></td></tr><tr><td>4U2zGQMK5L3mRuoGZA4WDy</td><td>3</td><td>Wired</td><td><a target="_blank" alt="Wired" title="Wired" href=https://api.spotify.com/v1/tracks/4U2zGQMK5L3mRuoGZA4WDy >Ver Detalles</a></td><td><a target="_blank" alt="Wired" title="Wired" href=https://open.spotify.com/track/4U2zGQMK5L3mRuoGZA4WDy >Reproducir</a></td></tr><tr><td>44DRt5JbAtRrt5vxH1lazp</td><td>4</td><td>Waiting - Original Mix</td><td><a target="_blank" alt="Waiting - Original Mix" title="Waiting - Original Mix" href=https://api.spotify.com/v1/tracks/44DRt5JbAtRrt5vxH1lazp >Ver Detalles</a></td><td><a target="_blank" alt="Waiting - Original Mix" title="Waiting - Original Mix" href=https://open.spotify.com/track/44DRt5JbAtRrt5vxH1lazp >Reproducir</a></td></tr><tr><td>2bUsni4knblLirfRD7DUS6</td><td>5</td><td>Never Cry Again - Original Mix</td><td><a target="_blank" alt="Never Cry Again - Original Mix" title="Never Cry Again - Original Mix" href=https://api.spotify.com/v1/tracks/2bUsni4knblLirfRD7DUS6 >Ver Detalles</a></td><td><a target="_blank" alt="Never Cry Again - Original Mix" title="Never Cry Again - Original Mix" href=https://open.spotify.com/track/2bUsni4knblLirfRD7DUS6 >Reproducir</a></td></tr><tr><td>36QfRyd9lQyPKL9eFmmSXa</td><td>6</td><td>To Be The One - Original Mix</td><td><a target="_blank" alt="To Be The One - Original Mix" title="To Be The One - Original Mix" href=https://api.spotify.com/v1/tracks/36QfRyd9lQyPKL9eFmmSXa >Ver Detalles</a></td><td><a target="_blank" alt="To Be The One - Original Mix" title="To Be The One - Original Mix" href=https://open.spotify.com/track/36QfRyd9lQyPKL9eFmmSXa >Reproducir</a></td></tr><tr><td>0KpehNMSwZQZ13KlwaFLyP</td><td>7</td><td>End Of Silence</td><td><a target="_blank" alt="End Of Silence" title="End Of Silence" href=https://api.spotify.com/v1/tracks/0KpehNMSwZQZ13KlwaFLyP >Ver Detalles</a></td><td><a target="_blank" alt="End Of Silence" title="End Of Silence" href=https://open.spotify.com/track/0KpehNMSwZQZ13KlwaFLyP >Reproducir</a></td></tr><tr><td>1zvFKlkIriv5yCp1HYGZTy</td><td>8</td><td>The Night Time</td><td><a target="_blank" alt="The Night Time" title="The Night Time" href=https://api.spotify.com/v1/tracks/1zvFKlkIriv5yCp1HYGZTy >Ver Detalles</a></td><td><a target="_blank" alt="The Night Time" title="The Night Time" href=https://open.spotify.com/track/1zvFKlkIriv5yCp1HYGZTy >Reproducir</a></td></tr><tr><td>6jXUnH9po91agPvwJPHINq</td><td>9</td><td>Renegade - Original Mix</td><td><a target="_blank" alt="Renegade - Original Mix" title="Renegade - Original Mix" href=https://api.spotify.com/v1/tracks/6jXUnH9po91agPvwJPHINq >Ver Detalles</a></td><td><a target="_blank" alt="Renegade - Original Mix" title="Renegade - Original Mix" href=https://open.spotify.com/track/6jXUnH9po91agPvwJPHINq >Reproducir</a></td></tr><tr><td>4IzhqrjLOwNuh3W7JryWqx</td><td>10</td><td>Janeiro</td><td><a target="_blank" alt="Janeiro" title="Janeiro" href=https://api.spotify.com/v1/tracks/4IzhqrjLOwNuh3W7JryWqx >Ver Detalles</a></td><td><a target="_blank" alt="Janeiro" title="Janeiro" href=https://open.spotify.com/track/4IzhqrjLOwNuh3W7JryWqx >Reproducir</a></td></tr><tr><td>6ShnXpRHu79ElednDKNfnJ</td><td>11</td><td>Feel U Here - Original Mix</td><td><a target="_blank" alt="Feel U Here - Original Mix" title="Feel U Here - Original Mix" href=https://api.spotify.com/v1/tracks/6ShnXpRHu79ElednDKNfnJ >Ver Detalles</a></td><td><a target="_blank" alt="Feel U Here - Original Mix" title="Feel U Here - Original Mix" href=https://open.spotify.com/track/6ShnXpRHu79ElednDKNfnJ >Reproducir</a></td></tr><tr><td>1UMKL51JlWiuKoqXoRwlpp</td><td>12</td><td>The New Daylight</td><td><a target="_blank" alt="The New Daylight" title="The New Daylight" href=https://api.spotify.com/v1/tracks/1UMKL51JlWiuKoqXoRwlpp >Ver Detalles</a></td><td><a target="_blank" alt="The New Daylight" title="The New Daylight" href=https://open.spotify.com/track/1UMKL51JlWiuKoqXoRwlpp >Reproducir</a></td></tr><tr><td>54G96vyYvYpq8JiU9sAxtD</td><td>13</td><td>Surround Me - Bonus Track</td><td><a target="_blank" alt="Surround Me - Bonus Track" title="Surround Me - Bonus Track" href=https://api.spotify.com/v1/tracks/54G96vyYvYpq8JiU9sAxtD >Ver Detalles</a></td><td><a target="_blank" alt="Surround Me - Bonus Track" title="Surround Me - Bonus Track" href=https://open.spotify.com/track/54G96vyYvYpq8JiU9sAxtD >Reproducir</a></td></tr> -->
							</tbody>
						</table>

					</div>
				</div>









			</div>





		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			


			$('#datosm').hide(); //muestro mediante clase
			$('#datosf').hide(); //muestro mediante clase

			$("#boton").on("click", function() {

				$("#capa").load('registarC.jsp');
				$('#tabla').hide();
				$('#capa').show();

			});
// 			$("#boton2").on("click", function() {

// 				$("#capa").load('RealizarM.jsp');
// 				$('#tabla').hide();
// 				$('#capa').show();

			});

			
			(function($) {
				$('#filtrar').keyup(function() {
					var rex = new RegExp($(this).val(), 'i');
					$('.buscar tr').hide();
					$('.buscar tr').filter(function() {
						return rex.test($(this).text());
					}).show();
				})
					}(jQuery));
	
		
		
	</script>
	<script src="resources/js/jquery-3.1.1.min.js"></script>
	<script src="resources/js/ListarCliente.js"></script>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!--     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> -->
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<!--     <script src="../../assets/js/vendor/holder.min.js"></script> -->
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!--     <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>
