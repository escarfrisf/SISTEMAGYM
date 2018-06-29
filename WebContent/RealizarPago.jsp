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
<style type="text/css">
body {
  font-family: Avenir Next, Avenir, SegoeUI, sans-serif;
}


form {
  margin: 2em 0;
}
/**
* Make the field a flex-container, reverse the order so label is on top.
*/
 
.field {
  display: flex;
  flex-flow: column-reverse;
  margin-bottom: 1em;
}
label, input {
  transition: all 0.2s;
  touch-action: manipulation;
}

input {
  font-size: 1.5em;
  border: 0;
  border-bottom: 1px solid #ccc;
  font-family: inherit;
  -webkit-appearance: none;
  border-radius: 0;
  padding: 0;
  cursor: text;
}

input:focus {
  outline: 0;
  border-bottom: 1px solid #666;
}

label {
  text-transform: uppercase;
  letter-spacing: 0.05em;
}
/**
* Translate down and scale the label up to cover the placeholder,
* when following an input (with placeholder-shown support).
* Also make sure the label is only on one row, at max 2/3rds of the
* field—to make sure it scales properly and doesn't wrap.
*/
input:placeholder-shown + label {
  cursor: text;
  max-width: 66.66%;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  transform-origin: left bottom;
  transform: translate(0, 2.125rem) scale(1.5);
}
/**
* By default, the placeholder should be transparent. Also, it should 
* inherit the transition.
*/
::-webkit-input-placeholder {
  opacity: 0;
  transition: inherit;
}
/**
* Show the placeholder when the input is focused.
*/
input:focus::-webkit-input-placeholder {
  opacity: 1;
}
/**
* When the element is focused, remove the label transform.
* Also, do this when the placeholder is _not_ shown, i.e. when 
* there's something in the input at all.
*/
input:not(:placeholder-shown) + label,
input:focus + label {
  transform: translate(0, 0) scale(1);
  cursor: pointer;
}
</style>
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
    
       

			 </div>			
    </div>
     </div> 
    
 <div class="container" id="advanced-search-form" style="wight:50%; margin-top:1px" >
 
    <button type="button" class="btn btn-danger" style="margin-right:30px;width:110px"><a  style="color:white;margin-bottom:-20px;margin-top:-20px;" href="javascript:window.history.back();">&laquo; Volver atras</a></button>
				

        <h2 style=" font-family:Georgia;color:#1CAF3B   ;">Realizar Pago </h2>
        <form action="">
        <div  class="row" style="width:100%">
        
        <div class="col-sm-4">
        
        
        <div class="form-group" style="width:160px">
                <label for="first-name" style=" color:#1C3FD3;">Nombre</label>
                <input type="text" class="form-control"  id="nombrec" style="border-color:#1CAF3B ;">
            </div>
        
        </div>
          <div class="col-sm-4">     
          
            <div class="form-group"  style="width:170px">
                <label for="last-name" style=" color:#1C3FD3">Apellidos</label>
                <input type="text" class="form-control"  id="apellc" style="border-color:#1CAF3B ;">
            </div>
          </div>
            <div class="col-sm-4">  
            <div class="form-group"  style="width:170px">
                <label for="country" style=" color:#1C3FD3">  Servicio</label>
                <input type="text" class="form-control"  id="nombre_servicio" style="border-color:#1CAF3B;">
            </div>
             </div>
         
            
            <div class="form-group"  style="width:175px; padding-left:20px" >
                <label for="country" style=" color:#1C3FD3"> Monto</label>
                <input type="text" value="0" class="form-control calcularT" placeholder="ejmp:4589...." id="costo" style="border-color:#1CAF3B ;" readonly="readonly">
            </div>
        
        
        </div>
           
         
            

<!--             <div class="form-group"> -->
<!--                 <label for="age" style=" color:black;">MONTO</label> -->
<!--                 <input type="text" class="form-control" id="costo" value="costo" readonly="readonly"> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--                 <label for="email" style=" color:black;" >TIEMPO</label> -->
<!--                 <input type="text" class="form-control" id="tiempoS" value="Dias" readonly="readonly"> -->
<!--             </div> -->
<!--              <div class="form-group"> -->
<!--                 <label for="age" style=" color:#0b0b1b">Beneficio Sauna</label> -->
<!--                 <input type="text" class="form-control"  id="beneficiosauna" readonly="readonly"> -->
<!--             </div> -->
            
<!--           <div class="form-group"> -->
<!--                 <label for="education" style=" color:#0b0b1b">Fecha Inicio</label> -->
<!--                 <input type="text" class="form-control" placeholder="00/00/00" id="datetimepicker1" readonly="readonly"> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--                 <label for="education" style=" color:#0b0b1b" >Fecha Fin</label> -->
<!--                 <input type="text" class="form-control" placeholder="00/00/00" id="datetime" readonly="readonly"> -->
<!--             </div> -->


<div  class="row" style="width:100%">
  
             
           <div class="form-group" >
        <label class="form" style="font-weight: normal;width:170px;padding-left:20px" ">Servicio extra</label>
               
               
        <div class="form" style="width:120px;padding-left:20px" ">
            <select class="form-control" id="servicios" name="size" style="width:190px;">
              
                
            </select>
        </div>
    </div>
  
   <div class="form-group">
                <label for="country" style=" color:#0b0b1b;font-weight: normal" > Monto</label>
                <input type="text" value="0" class="form-control calcularT"  placeholder="ejmp:4589...." id="costo2" readonly="readonly">
            </div>
             <div class="col-sm-4"> 
            
  <div class="field">
    <input type="email" class="calcularT" value="0" name="email" id="descuento" placeholder="minimo">
    <label for="email" style="font-size: 10px;font-weight: normal">Descuento</label>
  </div> 
            
            </div>    
            
            
            
           
            
            
  </div>

  <div  class="row" style="width:100%">
  
    <div class="col-sm-4">
     <div class="field" class="" >
    <input type="text" name="fullname" id="pago" value="0" placeholder="00.00">
    <label for="fullname" style="font-size: 10px;font-weight: normal"> Pago</label>
  </div>
     </div>    
            <div class="col-sm-4">
            <div class="form-group" style="width:120px;">
                <label for="country" style=" color:#0b0b1b;width:120px;font-weight: normal"  readonly="readonly"> Monto total</label>
                <input type="text" class="form-control" placeholder="ejmp:4589...." style="width:130px" id="costo3" readonly="readonly">
            </div>
             </div>    
           
              <div class="col-sm-4">
              
  <div class="form-group" style="width:130px">
                <label for="country" style=" color:#0b0b1b;font-weight: normal" >Restante</label>
                <input type="text" class="form-control" placeholder="ejmp:4589...." id="restante" style="width:130px" readonly="readonly">
            </div>
               </div>    


  
  
  </div>

<div  class="row" style="width:100%">
 <div class="col-sm-4">
 <div class="form-group">
                <label for="education" style=" color:#0b0b1b" >Fecha</label>
                <input type="text" class="form-control"  id="fechaactual" readonly="readonly" style="width:120px">
            </div>

</div>
 
 </div>
 
 </form>
 
<!--    <form action="" style=" margin: 2em 0;"> -->
 
<!--   </form> -->
 
            <div class="clearfix" ></div>
            <a   class="btn btn-info btn-lg btn-responsive" id="realizarMatricula"  style="background-color:#1CAF3B ;"> <span  class="glyphicon glyphicon-search"></span> Realizar Pago</a>
       
    </div>
    


     <script src="resources/js/jquery.js"></script>
      <script src="resources/js/bootstrap.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
   

<script src="resources/js/jquery.min.js"></script>

	<script src="resources/js/jquery-3.1.1.min.js"></script>
	<script src="resources/js/chosen.jquery.js"></script>
<script src="resources/js/Realizarpago.js"></script>
	
	
		<script src="resources/js/bootstrap-datetimepicker.js"></script>
	<script src="resources/js/bootstrap-datetimepicker.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

	
<script type="text/javascript">

$(document).ready(function() {
	
	
$(function () {
    $.datepicker.setDefaults($.datepicker.regional["es"]);
    $("#fechaactual").datepicker({
        dateFormat: 'dd/mm/yy',
        firstDay: 1
    });
});
});


	

</script>

<!-- </script> -->

	
</body>
