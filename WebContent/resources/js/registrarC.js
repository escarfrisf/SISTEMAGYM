$(document).ready(function(){
//	alert("prueba final1");
	traerid();
	lista();
	mostrartc();
});
function lista(){
	$('#datosm').hide(); 
	$('#datosf').hide(); 
	$("#mostrar").on( "click", function() {
		$('#datosp').show(); 
		$('#datosm').hide(); 
		$('#datosf').hide();
	 });
	$("#mostrar2").on( "click", function() {
		$('#datosm').show(); 
		$('#datosf').hide(); 
		$('#datosp').hide();
		});
	$("#mostrar3").on( "click", function() {
		$('#datosf').show(); 
		$('#datosm').hide(); 
		$('#datosp').hide(); 
	});
}
function traerid(){
$.post("ClienteController", {
	op: 4
}, function(data) {
 	var id = JSON.parse(data);
 	

 	
// 	var idnuevo = parseInt(id) + parseInt(1);
 	
 	var idn = JSON.parse(id);
//	alert("nuevo idn" + idn);
	var idm = parseFloat(idn)+parseInt(1);
//alert("id" + idm);
 	$("#ultimo").val(idm);
});
//guardardatosm();
//guardarficha();
}


function mostrarI() {

	var id = $("#servicios").val();
	$.post("ClienteController", {
		op : 8,
		id : id
	}, function(data) {
		var dat = JSON.parse(data);
		// alert(dat[0].tiempoS);
		$("#costo").val(dat[0].costo);
		$("#tiempoS").val(dat[0].tiempoS);
		$("#beneficiosauna").val(dat[0].beneficiosauna);
	});
}


   function guardardatosm(){
  alert("se registro datosdamiliares");
	   var nombrePadre =$("#nombrePadre").val();
	   var apellidoPadre =$("#apellidoPadre").val();
	   var telefonop =$("#telefonop").val();
	   var nombreMadre =$("#nombreMadre").val();
	   var apellidoMadre =$("#apellidoMadre").val();
	   var telefonom =$("#telefonom").val();
	   var cliente_idcliente =$("#ultimo").val();
///   alert(cliente_idcliente);
	   $.post("ClienteController", {
		   nombrePadre : nombrePadre,
		   apellidoPadre : apellidoPadre,
		   telefonop : telefonop,
		   nombreMadre: nombreMadre,
		   apellidoMadre:apellidoMadre,
		   telefonom: telefonom,
		   cliente_idcliente : cliente_idcliente,
			op: 2
		}, function(data) {
			if(data == 1){
				alert(data);
			}
	});	   
   }
   
   function mostrartc(){
//	   alert("llegomostratc");
	   $.post("ClienteController",{
		   op:5
	   },function(data){
		   var lista=JSON.parse(data);
		   $('#tipocc').html('');
		   $("#tipocc").append('<option value="0" > seleccionar Tipo matri</option>');
		   $.each(lista,function(index,obj){
			   $("#tipocc").append('<option value='+ obj.idtipocliente+ ' > '  + obj.tipoc+  '</option>');
		   });
		   
	   });
	   
   }
function guardarficha(){
	alert("se registro ficha medica");
	var discapacidadFisica=$("#discapacidadFisica").val();
	var enfermedad=$("#enfermedadActual").val();
	var peso=$("#peso").val();
	var talla=$("#talla").val();
	var masa=$("#masaCorporal").val();
	var cliente_idcliente=$("#ultimo").val();
	$.post("ClienteController", {
		discapacidadFisica : discapacidadFisica,
		enfermedad : enfermedad,
		peso : peso,
		talla :  talla,
		masa :  masa,
		cliente_idcliente : cliente_idcliente,
		op: 3
	}, function(data) {
		if(data == 1){
		}
});
}
function guardar(){
	alert("se Registro cliente");
	alert("llego a guardar");
	var nombrec=$("#nombrec").val();
	var  apellidosc= $("#apellidosc").val();
	var dnic=$("#dnic").val();
	var telefono=$("#telefono").val();	
	var gmail=$("#gmail").val();
	var idmatricula = 0;
	var tipocliente_idtipocliente = $("#tipocc").val();
	
	
	$.post("ClienteController",
			{
		
			nombrec:nombrec,
			apellidosc : apellidosc,
			dnic:       dnic,
			telefono :  telefono,
			gmail :  gmail,
		
			idmatricula : idmatricula,
			tipocliente_idtipocliente : tipocliente_idtipocliente,
			op: 1

		
		}, function(data) {
			var data = JSON.parse(data);
			alert("data" + data);
			if (data == 1) {
			}
		

		 
		});
	guardardatosm();
	guardarficha();
	
}
function calc_imc(){
  var talla=document.getElementById("talla").value;
  talla=talla.toString().replace(',','.');
  var tallaMetro=talla/100;
  var peso=document.getElementById("peso").value;
        /*CALCULO IMC*/
        var tallaCuadrado=tallaMetro*tallaMetro;
        var imc=peso/tallaCuadrado;
        document.getElementById("masaCorporal").value=Math.round(imc*100)/100;     
        /*CALCULO DESCRIPCION IMC*/
// 	        if(imc<16){
// 	          document.getElementById("IMCdetallado").value="Delgadez Severa";    
// 	        }
//	        else if(imc<17){
//	          document.getElementById("IMCdetallado").value="Delgadez Moderada";    
//	        }
//	        else if(imc<18.5){
//	          document.getElementById("IMCdetallado").value="Delgadez Aceptable";   
//	        }
//	        else if(imc<25){
//	          document.getElementById("IMCdetallado").value="Peso Normal";    
//	        }
//	        else if(imc<30){
//	          document.getElementById("IMCdetallado").value="Sobrepeso";    
//	        }
//	        else if(imc<35){
//	          document.getElementById("IMCdetallado").value="Obeso: Tipo I";    
//	        }
//	        else if(imc<40){
//	          document.getElementById("IMCdetallado").value="Obeso: Tipo II";   
//	        }
//	        else if(imc>=40){
//	          document.getElementById("IMCdetallado").value="Obeso: Tipo III";    
//	        }
//       }
//   }
    
        
        
}