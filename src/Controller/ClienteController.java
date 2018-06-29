package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

import com.google.gson.Gson;

import Dao.ClienteDao;
import Dao.DatosFamilDao;
import Dao.FichaMedDao;
import Dao.MatriculasDao;
import Dao.PagoDao;
import Dao.ServiciosDao;
import Dao.TipoClienteDao;
import Dto.Cliente;
import Dto.DatosFamil;
import Dto.FichaMed;
import Dto.Matricula;
import Dto.TipoCliente;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Cliente> lista = new ArrayList<>();
	private Gson g = new Gson();
	private ClienteDao aO = new ClienteDao();
	private DatosFamilDao dO = new DatosFamilDao();
	private FichaMedDao fO = new FichaMedDao();
	private TipoClienteDao tO = new TipoClienteDao();
	private ServiciosDao sO = new ServiciosDao();
	private MatriculasDao mO = new MatriculasDao();
	private List<TipoCliente> lista2 = new ArrayList<>();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		int op = Integer.parseInt(request.getParameter("op"));
		switch (op) {

		case 1:
			String nombrec = request.getParameter("nombrec");
			String apellidosc = request.getParameter("apellidosc");
			String dnic = request.getParameter("dnic");
			String telefono = request.getParameter("telefono");
			String gmail = request.getParameter("gmail");
			int idmatricula = Integer.parseInt(request.getParameter("idmatricula"));
			int tipocliente_idtipocliente = Integer.parseInt(request.getParameter("tipocliente_idtipocliente"));

			Cliente c1 = new Cliente(nombrec, apellidosc, dnic, telefono, gmail, idmatricula,
					tipocliente_idtipocliente);
			aO.create(c1);
			break;

		case 2:
			String nombrePadre = request.getParameter("nombrePadre");
			String apellidoPadre = request.getParameter("apellidoPadre");
			String telefonop = request.getParameter("telefonop");
			String nombreMadre = request.getParameter("nombreMadre");
			String apellidoMadre = request.getParameter("apellidoMadre");
			String telefonom = request.getParameter("telefonom");
			int cliente_idcliente1 = Integer.parseInt(request.getParameter("cliente_idcliente"));

			DatosFamil c2 = new DatosFamil(nombrePadre, apellidoPadre, telefonop, nombreMadre, apellidoMadre, telefonom,
					cliente_idcliente1);
			dO.create(c2);
			break;

		case 3:
			String discapacidadFisica = request.getParameter("discapacidadFisica");
			String enfermedad = request.getParameter("enfermedad");
			String peso = request.getParameter("peso");
			String talla = request.getParameter("talla");
			String masa = request.getParameter("masa");
			int cliente_idcliente = Integer.parseInt(request.getParameter("cliente_idcliente"));

			FichaMed c3 = new FichaMed(discapacidadFisica, enfermedad, peso, talla, masa, cliente_idcliente);
			fO.create(c3);

			break;

		case 4:
			out.print(g.toJson(aO.id()));
			break;

		case 5:
			out.println(g.toJson(tO.readAll()));
			break;

		case 6:
			out.println(g.toJson(aO.readAll()));
			System.out.println(g.toJson(aO.readAll()));

			break;

		case 7:
			out.println(g.toJson(sO.readAll()));
			break;

		case 8:
			out.println(g.toJson(sO.readAll()));
			break;
		case 9:
			out.println(g.toJson(sO.readAll()));
			break;

		case 10:
			
			String fechaInicio = request.getParameter("fechaInicio");
			String fechaFin = request.getParameter("fechaFin");
			String tipodepago = request.getParameter("tipodepago");

			int idcliente = Integer.parseInt(request.getParameter("idcliente"));
			int servicios_idservicios = Integer.parseInt(request.getParameter("servicios_idservicios"));
			//System.out.println(					fechaInicio + "-" + fechaFin + "-" + tipodepago + "-" + idcliente + "-" + servicios_idservicios);
			Matricula m1 = new Matricula(fechaInicio, fechaFin, tipodepago, servicios_idservicios);
			int idm = mO.create(m1, idcliente);
			out.println("{'id':" + idm + "}");
			// mc.udatematricliev( idm, idcliente);
			break;
		case 11:
			out.println(g.toJson(aO.readAllWithServices()));
			break;
			
		case 12:
			out.println(g.toJson(sO.readAllUnic()));
			break;
			
		case 13:
			int idclienteP =  Integer.parseInt(request.getParameter("cliente"));
			double monto =  Double.parseDouble(request.getParameter("monto"));
			String estado = request.getParameter("estado");
			String fecha = request.getParameter("fecha");
			
			int itemServ =  Integer.parseInt(request.getParameter("itemServ"));
			double descuento =  Double.parseDouble(request.getParameter("descuento"));
			double costo =  Double.parseDouble(request.getParameter("costo"));
			double restante =  Double.parseDouble(request.getParameter("restante"));
			double pago =  Double.parseDouble(request.getParameter("pago"));
			
			int itemServExtra =  Integer.parseInt(request.getParameter("itemServExtra"));
			double costoServExtra =  Double.parseDouble(request.getParameter("costoServExtra"));
			
			PagoDao pagoDao = new PagoDao();
			
			int oinsert = pagoDao.realizarPago(idclienteP, monto, estado, fecha, itemServ, descuento, costo, restante, pago, itemServExtra, costoServExtra);
			out.println(oinsert);
			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // TODO Auto-generated method stub
		doGet(request, response);
	}
}
