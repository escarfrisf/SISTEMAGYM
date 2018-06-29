$(document)
		.ready(
				function() {

					function calcularRestante() {
						var total = parseFloat($("#costo3").val());
						var pago = parseFloat($("#pago").val());
						var restante = total - pago;
						$("#restante").val(restante);
					}
					$("#pago").keyup(function(e) {
						calcularRestante();
					});
					mostrarServicio();
					function mostrarServicio() {

						$
								.post(
										"ClienteController",
										{
											op : 12
										},
										function(data) {
											var lista = JSON.parse(data);
											var selectitems = "";
											$
													.each(
															lista,
															function(index, obj) {
																console
																		.log(
																				"servicio",
																				obj);

																const jsonData = {
																	"idservicios" : obj.idservicios,
																	"nombres" : obj.nombres,
																	"costo" : obj.costo
																};

																selectitems = selectitems
																		+ "<option data-value="
																		+ JSON
																				.stringify(jsonData)
																		+ " value='"

																		+ obj.idservicios
																		+ "'>"
																		+ obj.nombres
																		+ " </option>";

															});
											$("#servicios")
													.append(
															'<option selected="selected" value=0 disabled="disabled" style="font-weight: normal"">Seleccionar Servicio</option>');
											$("#servicios").append(selectitems);

											$('#servicios')
													.change(
															function(e) {
																var item = $(
																		this)
																		.find(
																				":selected")
																		.data(
																				"value");
																console
																		.log(
																				"servicio_dicional",
																				item);
																$("#costo2")
																		.val(
																				item.costo);
																calcularTotal();
															});

										});

					}
					function calcularTotal() {
						var costoMatricula = parseFloat($("#costo").val());
						var costoServiAd = parseFloat($("#costo2").val());
						var descuento = parseFloat($("#descuento").val());
						var total = (costoMatricula + costoServiAd) - descuento;
						console.log("tOTAL0", total);

						$("#costo3").val(total);
					}
					$(".calcularT").keyup(function(e) {

						calcularTotal();
					});

					$("#realizarMatricula").click(function(e) {
						realizarPago();
					});

					function realizarPago() {

						// Cabecera
						var cliente = $("#selectclientes").val();
						if ($("#costo").val() == 0) {
							alert("Ingrese los datos")
						}
						var restante = parseFloat($("#restante").val());
						var monto = parseFloat($("#costo3").val());
						var estado = "parcial";
						if (restante <= 0) {
							var estado = "total";
						}

						var fecha = $("#fechaactual").val();

						// Detalle 1

						var itemServ = $('#selectclientes').find(":selected")
								.data("value");
						var descuento = parseFloat($("#descuento").val());
						var costo = parseFloat($("#costo").val());
						var restante = parseFloat($("#restante").val());
						var pago = parseFloat($("#pago").val());

						// Detalle 2
						var itemServExtra = $('#servicios').val();
						var costoServExtra = parseFloat($("#costo2").val());

						var params = {
							cliente : cliente,
							monto : monto,
							estado : estado,
							fecha : fecha,

							itemServ : itemServ.idservicio,
							descuento : descuento,
							costo : costo,
							restante : restante,
							pago : pago,

							itemServExtra : itemServExtra,
							costoServExtra : costoServExtra,

							op : 13
						};

						console.log("params:", params);

						$.post("ClienteController", params, function(data) {
							console.log("realizarPago?", data);
							if (data > 1) {
								alert("Pago realizado");
							}
						});

					}

					$(".chosen").chosen();
					listarCliente();

					// buscar();

					function listarCliente() {
						// alert("antes del get");
						$
								.get(
										"ClienteController",
										{
											op : 11
										},

										function(obj) {
											// alert(obj);
											var x = JSON.parse(obj);
											// alert(x)
											console.log("CLIENTE_SERVCIOS", x);
											var s = "";
											var selectitems = "";
											for (var i = 0; i < x.length; i++) {
												const jsonData = {
													"id" : x[i].idcliente,
													"name" : x[i].nombrec,
													last_name : x[i].apellidosc,
													dni : x[i].dnic,
													"servicio_nombre" : x[i].servicio_nombre,
													"servicio_costo" : x[i].servicio_costo,
													"idservicio" : x[i].idservicio
												};
												// {id:"+x[i].idcliente+",name:'"+x[i].nombrec+"',last_name:'"+x[i].apellidosc+"',dni:'"+x[i].dnic+"'}
												selectitems = selectitems
														+ "<option data-value="
														+ JSON
																.stringify(jsonData)
														+ " value='"
														+ x[i].idcliente + "'>"
														+ x[i].nombrec
														+ x[i].apellidosc
														+ "</option>";

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
											$('#selectclientes')
													.change(
															function(e) {
																var item = $(
																		this)
																		.find(
																				":selected")
																		.data(
																				"value");
																console
																		.log(
																				"clientes",
																				item);
																$("#nombrec")
																		.val(
																				item.name);
																$("#apellc")
																		.val(
																				item.last_name);
																$(
																		"#nombre_servicio")
																		.val(
																				item.servicio_nombre);
																$("#costo")
																		.val(
																				item.servicio_costo);
																calcularTotal();

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
