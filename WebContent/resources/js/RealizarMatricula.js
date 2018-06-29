$(document).ready(function() {
	
	
	$("#realizarMatricula").click(function(e){
		guardarMatri();
	});
	function guardarMatri() {
	
		// alert("matricula");
		var fechaInicio = $("#datetimepicker1").val();
		var fechaFin = $("#datetime").val();
		var tipodepago = "tipopgo1";
		var servicios_idservicios = $("#servicios").val();
		var idcliente = $("#selectclientes").val();

		$.post("ClienteController", {
			fechaInicio : fechaInicio,
			fechaFin : fechaFin,
			tipodepago : tipodepago,
			idcliente : idcliente,
			servicios_idservicios : servicios_idservicios,
			op: 10
		}, function(data) {
			console.log("exito?",data);
		
			if (data == 1) {
				
			}
		});
	}
					$(".chosen").chosen();
					listarCliente();
					mostrarServicio();

					// buscar();

					function listarCliente() {
						// alert("antes del get");
						$
								.get(
										"ClienteController",
										{
											op : 6
										},

										function(obj) {
											// alert(obj);
											var x = JSON.parse(obj);
											// alert(x)
											// console.log(obj);
											var s = "";
											var selectitems = "";
											for (var i = 0; i < x.length; i++) {
												 const jsonData = {"id":x[i].idcliente,"name":x[i].nombrec,last_name:x[i].apellidosc,dni:x[i].dnic};
												 // {id:"+x[i].idcliente+",name:'"+x[i].nombrec+"',last_name:'"+x[i].apellidosc+"',dni:'"+x[i].dnic+"'}
												selectitems = selectitems
														+"<option data-value="+JSON.stringify(jsonData)+" value='"+ x[i].idcliente +"'>"+ x[i].nombrec + x[i].apellidosc +"</option>";
													
												s += "<tr><td>";
												s += x[i].idcliente;
												s += "</td><td>";
												s += x[i].nombrec;
												s += "</td><td>";
												s += x[i].apellidosc;
												s += "</td><td>";
												s += x[i].dnic;
												s += "</td><td>";
												s += x[i].gmail;
												s += "</td><td>";
												s += x[i].telefono;
												s += "</td><td>";
												s += x[i].estado;

												s += "</td>";

												s += '<td><button id="open" class="btn" href="" onclick="'
														+ x[i].idcliente + '">';
												s += '<i class="idc"></i></button></td>';
												s += "</tr>";
											}
											$("#selectclientes").append(
													selectitems);
											$('#selectclientes').trigger(
													"chosen:updated");
											$('#selectclientes').change(function(e) {
												var item =  $(this).find(":selected").data("value");
												console.log("clientes",item);
												$("#nombrec").val(item.name);
												$("#apellc").val(item.last_name);
												$("#dnic").val(item.dni);
												});

											// alert("luego del get" + s);
											// console.log(s);
											$("#data2").empty();
											$("#data2").append(s);
											// $(".table
											// table-hover").dataTable();
										});
					}
					;

				});

function mostrarServicio() {

	$.post("ClienteController", {
		op : 7
	}, function(data) {
		var lista = JSON.parse(data);

		$.each(lista, function(index, obj) {

			$("#servicios").append(
					'<option value="' + obj.idservicios + '"  >' + obj.nombres
							+ '</option>');

		});

	});
}

function mostrars() {

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

// function buscar(){
//	
// var id = $("#data2").val();
// $.post("ClienteController",{
// op:9, id:id
// },function(data){
// alert(data)
// var lista = data;
// $id = $lista[id];
// $nombre = $lista[nombre];
//		   
//		   
//	
// //
// $("#autocomplete").autocomplete({
// source: nombres
// });
//		   
// });
// }
//	   

// 

