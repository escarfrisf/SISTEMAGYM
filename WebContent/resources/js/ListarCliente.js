$(document).ready(function() {
	listarCliente();

	
});
function listarCliente() {
//	alert("antes del get");
	$.get("ClienteController",{op:6},

	function(obj) {
		// alert(obj);
		var x = JSON.parse(obj);
//		alert(x)
//		console.log(obj);
		var s = "";
		for (var i = 0; i < x.length; i++) {

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

//		alert("luego del get" + s);
		// console.log(s);
		$("#data2").empty();
		$("#data2").append(s);
		// $(".table table-hover").dataTable();
	});
};
////
//function carm(){
//	$("").
