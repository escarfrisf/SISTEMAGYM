<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">




<link rel="stylesheet" href="resources/css/registrarC.css">


</head>
<body>
<button type="button" class="btn btn-danger"><a  style="color:white;" href="javascript:window.history.back();">&laquo; Volver atrás</a></button>

<!-- <input name="button2" type="button"  -->
<!-- onclick='alert("DESEA VOLVER AL MENU PRINCIPAL.")' value="Atras" /> -->
	<div class="container">
		<div class="row col-list"  style="">
			<div class="col-md-4 t1">
				<div type="button" class="col-head text-center">
					<span class="glyphicon glyphicon-paperclip" aria-hidden="true"></span>
					<h2 type="button" id=mostrar >
						Informacion Personal<i
							style="font-size: 40px; margin-left: 10px; padding-button: 100px;"
							class="fa fa-angle-right f4x"></i>
					</h2>
				</div>

			</div>
			<div class="col-md-4 t2">
				<div class="col-head text-center">
					<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
					<h2 type="button" id=mostrar2>
						Informacion Medica<i class="fa fa-angle-right "></i>
					</h2>
				</div>

			</div>
			<div class="col-md-4 t3">
				<div class="col-head text-center">
					<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
					<h2 type="button" id=mostrar3>
						Datos Familiares<i class="fa fa-angle-right "></i>
					</h2>
				</div>

			</div>
		</div>
		<hr />
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<!--textarea id="textarea-list" class="col-md-12"></textarea-->
					<ul id="summary-list">
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>





	<div class="row">
		<div class="col-md-4 col-md-offset-4" id=datosp>
			<form class="form-horizontal" role="form" method="POST">
				<fieldset>

					<!-- Form Name -->
					<legend>Información Personal</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Nombres</label>
						<div class="col-sm-10">
							<input type="text" id="nombrec" placeholder="ejemplo:dan"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Apellidos</label>
						<div class="col-sm-10">
							<input type="text" id="apellidosc"
								placeholder="ejemplo:barriento mo....."
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Telefono</label>
						<div class="col-sm-10">
							<input type="text" id="telefono" placeholder="Ingrese nuemero"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Gmail</label>
						<div class="col-sm-5">
							<input type="text" id="gmail"
								placeholder="Ingrese correo ...@g..."
								class="form-control is-valid" required>
								<input type="hidden" id="ultimo" 
								class="form-control is-valid">
							<div class="valid-feedback"></div>
						</div>

						<label class="col-sm-2 control-label" for="textinput">DNI</label>
						<div class="col-sm-3">
							<input type="text" id="dnic" placeholder="ingrese dni"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>
				 <div class="form-group">
        <label class="col-xs-3 control-label">TipoCliente</label>
        <div class="col-xs-5 selectContainer">
            <select class="form-control" id="tipocc" name="size">
               
                
            </select>
        </div>
    </div>
					<!-- <div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="pull-right">
								<button type="submit" class="btn btn-default">Cancel</button>
								<button type="submit" class="btn btn-primary"
									onclick="guardar()">Registar</button>
							</div>
						</div>
					</div> -->

				</fieldset>
			</form>
		</div>
		<!-- /.col-lg-12 -->




		<div class="col-md-4 col-md-offset-4" id=datosm>
			<form class="form-horizontal" role="form">
				<fieldset>

					<!-- Form Name -->
					<legend>Informacion Medica</legend>

					<!-- Text input-->
					<!-- <div class="form-group">
						<label class="col-sm-3 control-label" for="textinput">Fracturas
							padecidas</label>
						<div class="col-sm-8">
							<input type="text" placeholder="ejemp:fractura de Tobillo"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div> -->

					<!-- Text input-->
<!-- 					<div class="form-group"> -->
<!-- 						<label class="col-sm-3 control-label" for="textinput">Enfermedades -->
<!-- 							padecidas</label> -->
<!-- 						<div class="col-sm-8"> -->
<!-- 							<input type="text" placeholder="ejep:Asma" -->
<!-- 								class="form-control is-valid" required> -->
<!-- 							<div class="valid-feedback"></div> -->
<!-- 						</div> -->
<!-- 					</div> -->

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-3 control-label" for="textinput">Discapacidad
							fisica</label>
						<div class="col-sm-8">
							<input type="text" id="discapacidadFisica" placeholder="ejem:lesion espianl"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-3 control-label" for="textinput">Enfermedad
							Actual</label>
						<div class="col-sm-8">
							<input type="text" id="enfermedadActual" placeholder="ejem:tiroides"
								class="form-control is-valid" required>
							<div class="valid-feedback"></div>
						</div>
					</div>


					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-1 control-label" for="textinput">Peso</label>
						<div class="col-sm-2">
							<input type="text" id="peso" placeholder="00" class="form-control is-valid"
								required>
							<div class="valid-feedback"></div>
						</div>

						<label class="col-sm-2 control-label"  for="textinput">Talla(cm)</label>
						<div class="col-sm-2">
							<input type="text" id="talla"   placeholder="0.00"
								class="form-control is-valid" required>
								
							<div class="valid-feedback"></div>
						</div>


						<label class="col-sm-2 control-label" for="textinput">IMC</label>
						<div class="col-sm-3">
						 <input type="button" value="calcular" onclick="calc_imc()"; return false;" />	
							<input type="text" id="masaCorporal" class="form-control "
								readonly="readonly">
						</div>
					</div>




					<!--           <div class="form-group"> -->
					<!--             <div class="col-sm-offset-2 col-sm-10"> -->
					<!--               <div class="pull-right"> -->
					<!--                 <button type="submit" class="btn btn-default">Cancel</button> -->
					<!--                 <button type="submit" class="btn btn-primary">Save</button> -->
					<!--               </div> -->
					<!--             </div> -->
					<!--           </div> -->

				</fieldset>
			</form>
		</div>
		<!-- /.col-lg-12 -->







		<div class="col-md-8 col-md-offset-3" id=datosf>
			<form class="form-horizontal" role="form">
				<fieldset style="wight: 100%; height: 100%; margin: auto;">
					<legend>Informacion Familiar</legend>
					<div class="col-sm-6">
						<div class="form-group">
							<label for="MainContent_text_reg_nombre"
								class="col-sm-4 control-label">Nombre Padre:</label>
							<div class="col-sm-8">
								<input name="ctl00$MainContent$text_reg_nombre"
									id="nombrePadre" class="form-control"
									type="text">
							</div>
						</div>
						<div class="form-group">
							<label for="MainContent_text_reg_telefono"
								class="col-sm-4 control-label">Apellido Padre</label>
							<div class="col-sm-8">
								<input name="ctl00$MainContent$text_reg_telefono"
									id="apellidoPadre" class="form-control"
									type="text">
							</div>
						</div>
						<div class="form-group">
							<label for="MainContent_text_reg_email"
								class="col-sm-4 control-label">Telefono:</label>
							<div class="col-sm-8">
								<input name="ctl00$MainContent$text_reg_email"
									id="telefonop" class="form-control"
									type="text">
							</div>
						</div>

					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<label for="MainContent_text_reg_direccion"
								class="col-sm-4 control-label">Nombre Madre:</label>
							<div class="col-sm-8">
								<input name="ctl00$MainContent$text_reg_direccion"
									id="nombreMadre" class="form-control"
									 type="text">
							</div>
						</div>
						<div class="form-group">
							<label for="MainContent_text_reg_localidad"
								class="col-sm-4 control-label">Nombre Apellidos:</label>
							<div class="col-sm-8">
								<input name="ctl00$MainContent$text_reg_localidad"
									id="apellidoMadre" class="form-control"
									 type="text">
							</div>
						</div>
						<div class="form-group">
							<label for="MainContent_text_reg_provincia"
								class="col-sm-4 control-label">Telefono:</label>
							<div class="col-sm-8">
							
								<input name="ctl00$MainContent$text_reg_provincia"
									id="telefonom" class="form-control"
									 type="text">
									 
							</div>
						</div>
						
		
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="pull-right">
									<button type="submit" class="btn btn-default">Cancel</button>
									<button type="submit" class="btn btn-primary" onclick=" guardar();">Registrar</button>
								</div>
							</div>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
		<!-- /.col-lg-12 -->



	</div>
	<!-- /.row -->
	
<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery-3.1.1.min.js"></script>
	<!-- 		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script> -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	
	<script src="resources/js/registrarC.js"></script>
	
	
	
</body>
</html>