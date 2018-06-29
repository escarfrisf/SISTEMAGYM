<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link href="../resources/fonts/font-awesome-4.7.0/fonts/glyphicons-halflings-regular.woff2">


 <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 

<link rel="stylesheet" href="resources/css/style2.css">

<link rel="stylesheet" href="resources/css/bootstrap-datetimepicker.css">
<link rel="stylesheet" href="resources/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="resources/css/chosen.css">
    <title>Dashboard Template for Bootstrap</title>

</head>
<body style="background-image:url('resources/images/imagengy.jpg');background-size: cover;
    min-height: 100%; ">
    
    
    <div id="container" >
 <div id="capa">
					<div class="container" >
						<h1
							style="margin-left: 400px; font-family: Georgia; color: #3385FF;">
							Busqueda de cliente</h1>

						<div class="input-group" style="left: 250px; margin: auto; margin:40px;">
							
								
								<select style="width:200px !important" name="miselect" id="selectclientes" class="chosen" data-placeholder="Elige un cliente">

</select>
						</div>
    
       
    

    
    
						<table  class="table table-hover"   style="display:none;">
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
									<th>Registrar Matricula</th>


								</tr>
							</thead>
							<tbody class="buscar" id="data2">
								<!--           <tr><td>1UuaX3kHs5iKD1mFFsArHq</td><td>1</td><td>Till The Sky Falls Down - Vocal Mix</td><td><a target="_blank" alt="Till The Sky Falls Down - Vocal Mix" title="Till The Sky Falls Down - Vocal Mix" href=https://api.spotify.com/v1/tracks/1UuaX3kHs5iKD1mFFsArHq >Ver Detalles</a></td><td><a target="_blank" alt="Till The Sky Falls Down - Vocal Mix" title="Till The Sky Falls Down - Vocal Mix" href=https://open.spotify.com/track/1UuaX3kHs5iKD1mFFsArHq >Reproducir</a></td></tr><tr><td>4f0dhdt7rjOgUEv7HmF4rM</td><td>2</td><td>Man On The Run - Original Vocal Mix</td><td><a target="_blank" alt="Man On The Run - Original Vocal Mix" title="Man On The Run - Original Vocal Mix" href=https://api.spotify.com/v1/tracks/4f0dhdt7rjOgUEv7HmF4rM >Ver Detalles</a></td><td><a target="_blank" alt="Man On The Run - Original Vocal Mix" title="Man On The Run - Original Vocal Mix" href=https://open.spotify.com/track/4f0dhdt7rjOgUEv7HmF4rM >Reproducir</a></td></tr><tr><td>4U2zGQMK5L3mRuoGZA4WDy</td><td>3</td><td>Wired</td><td><a target="_blank" alt="Wired" title="Wired" href=https://api.spotify.com/v1/tracks/4U2zGQMK5L3mRuoGZA4WDy >Ver Detalles</a></td><td><a target="_blank" alt="Wired" title="Wired" href=https://open.spotify.com/track/4U2zGQMK5L3mRuoGZA4WDy >Reproducir</a></td></tr><tr><td>44DRt5JbAtRrt5vxH1lazp</td><td>4</td><td>Waiting - Original Mix</td><td><a target="_blank" alt="Waiting - Original Mix" title="Waiting - Original Mix" href=https://api.spotify.com/v1/tracks/44DRt5JbAtRrt5vxH1lazp >Ver Detalles</a></td><td><a target="_blank" alt="Waiting - Original Mix" title="Waiting - Original Mix" href=https://open.spotify.com/track/44DRt5JbAtRrt5vxH1lazp >Reproducir</a></td></tr><tr><td>2bUsni4knblLirfRD7DUS6</td><td>5</td><td>Never Cry Again - Original Mix</td><td><a target="_blank" alt="Never Cry Again - Original Mix" title="Never Cry Again - Original Mix" href=https://api.spotify.com/v1/tracks/2bUsni4knblLirfRD7DUS6 >Ver Detalles</a></td><td><a target="_blank" alt="Never Cry Again - Original Mix" title="Never Cry Again - Original Mix" href=https://open.spotify.com/track/2bUsni4knblLirfRD7DUS6 >Reproducir</a></td></tr><tr><td>36QfRyd9lQyPKL9eFmmSXa</td><td>6</td><td>To Be The One - Original Mix</td><td><a target="_blank" alt="To Be The One - Original Mix" title="To Be The One - Original Mix" href=https://api.spotify.com/v1/tracks/36QfRyd9lQyPKL9eFmmSXa >Ver Detalles</a></td><td><a target="_blank" alt="To Be The One - Original Mix" title="To Be The One - Original Mix" href=https://open.spotify.com/track/36QfRyd9lQyPKL9eFmmSXa >Reproducir</a></td></tr><tr><td>0KpehNMSwZQZ13KlwaFLyP</td><td>7</td><td>End Of Silence</td><td><a target="_blank" alt="End Of Silence" title="End Of Silence" href=https://api.spotify.com/v1/tracks/0KpehNMSwZQZ13KlwaFLyP >Ver Detalles</a></td><td><a target="_blank" alt="End Of Silence" title="End Of Silence" href=https://open.spotify.com/track/0KpehNMSwZQZ13KlwaFLyP >Reproducir</a></td></tr><tr><td>1zvFKlkIriv5yCp1HYGZTy</td><td>8</td><td>The Night Time</td><td><a target="_blank" alt="The Night Time" title="The Night Time" href=https://api.spotify.com/v1/tracks/1zvFKlkIriv5yCp1HYGZTy >Ver Detalles</a></td><td><a target="_blank" alt="The Night Time" title="The Night Time" href=https://open.spotify.com/track/1zvFKlkIriv5yCp1HYGZTy >Reproducir</a></td></tr><tr><td>6jXUnH9po91agPvwJPHINq</td><td>9</td><td>Renegade - Original Mix</td><td><a target="_blank" alt="Renegade - Original Mix" title="Renegade - Original Mix" href=https://api.spotify.com/v1/tracks/6jXUnH9po91agPvwJPHINq >Ver Detalles</a></td><td><a target="_blank" alt="Renegade - Original Mix" title="Renegade - Original Mix" href=https://open.spotify.com/track/6jXUnH9po91agPvwJPHINq >Reproducir</a></td></tr><tr><td>4IzhqrjLOwNuh3W7JryWqx</td><td>10</td><td>Janeiro</td><td><a target="_blank" alt="Janeiro" title="Janeiro" href=https://api.spotify.com/v1/tracks/4IzhqrjLOwNuh3W7JryWqx >Ver Detalles</a></td><td><a target="_blank" alt="Janeiro" title="Janeiro" href=https://open.spotify.com/track/4IzhqrjLOwNuh3W7JryWqx >Reproducir</a></td></tr><tr><td>6ShnXpRHu79ElednDKNfnJ</td><td>11</td><td>Feel U Here - Original Mix</td><td><a target="_blank" alt="Feel U Here - Original Mix" title="Feel U Here - Original Mix" href=https://api.spotify.com/v1/tracks/6ShnXpRHu79ElednDKNfnJ >Ver Detalles</a></td><td><a target="_blank" alt="Feel U Here - Original Mix" title="Feel U Here - Original Mix" href=https://open.spotify.com/track/6ShnXpRHu79ElednDKNfnJ >Reproducir</a></td></tr><tr><td>1UMKL51JlWiuKoqXoRwlpp</td><td>12</td><td>The New Daylight</td><td><a target="_blank" alt="The New Daylight" title="The New Daylight" href=https://api.spotify.com/v1/tracks/1UMKL51JlWiuKoqXoRwlpp >Ver Detalles</a></td><td><a target="_blank" alt="The New Daylight" title="The New Daylight" href=https://open.spotify.com/track/1UMKL51JlWiuKoqXoRwlpp >Reproducir</a></td></tr><tr><td>54G96vyYvYpq8JiU9sAxtD</td><td>13</td><td>Surround Me - Bonus Track</td><td><a target="_blank" alt="Surround Me - Bonus Track" title="Surround Me - Bonus Track" href=https://api.spotify.com/v1/tracks/54G96vyYvYpq8JiU9sAxtD >Ver Detalles</a></td><td><a target="_blank" alt="Surround Me - Bonus Track" title="Surround Me - Bonus Track" href=https://open.spotify.com/track/54G96vyYvYpq8JiU9sAxtD >Reproducir</a></td></tr> -->
							</tbody>
						</table>
			 </div>			
    </div>
     </div> 
    
 <div class="container" id="advanced-search-form" style="wight:50%; margin-top:1px" >
    <button type="button" class="btn btn-danger" style="margin-right:30px;width:110px;margin-bottom:-20px;margin-top:-20px;"><a  style="color:white;" href="javascript:window.history.back();">&laquo; Volver atras</a></button>
		

        <h2 style=" font-family:Georgia;color:blue;">Realizar Matricula</h2>
        <form>
            <div class="form-group" >
                <label for="first-name" style=" color:#0b0b1b">Nombre</label>
                <input type="text" class="form-control" placeholder="ejmp:dan jamin ..." id="nombrec">
            </div>
            <div class="form-group">
                <label for="last-name" style=" color:#0b0b1b">Apellidos</label>
                <input type="text" class="form-control" placeholder="ejmp:apellidos" id="apellc">
            </div>
            <div class="form-group">
                <label for="country" style=" color:#0b0b1b"> DNI</label>
                <input type="text" class="form-control" placeholder="ejmp:4589...." id="dnic">
            </div>
           <div class="form-group">
        <label class="form" >Servicio</label>
        <div class="form">
            <select class="form-control" id="servicios" name="size" onchange="mostrars()">
               <option>Seleccionar Servicio</option>
                
            </select>
        </div>
    </div>
            <div class="form-group">
                <label for="age" style=" color:black;">MONTO</label>
                <input type="text" class="form-control" id="costo" value="costo" readonly="readonly">
            </div>
            <div class="form-group">
                <label for="email" style=" color:black;" >TIEMPO</label>
                <input type="text" class="form-control" id="tiempoS" value="Dias" readonly="readonly">
            </div>
             <div class="form-group">
                <label for="age" style=" color:#0b0b1b">Beneficio Sauna</label>
                <input type="text" class="form-control"  id="beneficiosauna" readonly="readonly">
            </div>
            
          <div class="form-group">
                <label for="education" style=" color:#0b0b1b">Fecha Inicio</label>
                <input type="text" class="form-control" placeholder="00/00/00" id="datetimepicker1" readonly="readonly">
            </div>
            <div class="form-group">
                <label for="education" style=" color:#0b0b1b" >Fecha Fin</label>
                <input type="text" class="form-control" placeholder="00/00/00" id="datetime" readonly="readonly">
            </div>
<!--             <div class="form-group"> -->
<!--                 <label>Gender</label> -->
<!--                 <div class="radio"> -->
<!--                     <label class="radio-inline"> -->
<!--                         <input type="radio" name="optradio">Male</label> -->
<!--                     <label class="radio-inline"> -->
<!--                         <input type="radio" name="optradio">Female</label> -->
<!--                 </div> -->
<!--             </div> -->
            <div class="clearfix"></div>
            <a   class="btn btn-info btn-lg btn-responsive" id="realizarMatricula"> <span class="glyphicon glyphicon-search"></span> Matricular Cliente</a>
        </form>
    </div>
     <script src="resources/js/jquery.js"></script>
      <script src="resources/js/bootstrap.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
   

<script src="resources/js/jquery.min.js"></script>

	<script src="resources/js/jquery-3.1.1.min.js"></script>
	<script src="resources/js/chosen.jquery.js"></script>
	<script src="resources/js/RealizarMatricula.js"></script>
	
	
		<script src="resources/js/bootstrap-datetimepicker.js"></script>
	<script src="resources/js/bootstrap-datetimepicker.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

	
<script type="text/javascript">
$(document).ready(function() {
	 $(".chosen").chosen();
	
	(function($) {
		$('#filtrar').keyup(function() {
			var rex = new RegExp($(this).val(), 'i');
			$('.buscar tr').hide();
			$('.buscar tr').filter(function() {
				return rex.test($(this).text());
			}).show();
		})
	}(jQuery));
});


$(function() {
	$("#datetimepicker1").datetimepicker({
	    format: 'yyyy-mm-dd hh:ii'
	});
	});


$(function() {
$("#datetime").datetimepicker({
    format: 'yyyy-mm-dd hh:ii'
});
});



</script>

	
</body>
</html>