package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FichaMedDao;
import Dto.FichaMed;

/**
 * Servlet implementation class FichaController
 */
@WebServlet("/FichaController")
public class FichaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FichaMedDao fO = new FichaMedDao();
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        
        int op = Integer.parseInt(request.getParameter("op"));
        switch (op) {
        			
		case 1: 
			String discapacidad=request.getParameter("discapacidadFisica");
			String enfermedad=request.getParameter("enfermedad");
			String peso=request.getParameter("peso");
			String talla=request.getParameter("talla");
			String masa=request.getParameter("masa");
			int idcliente=Integer.parseInt(request.getParameter("idcliente"));
			
			FichaMed f =new FichaMed(discapacidad,enfermedad,peso,talla,masa,idcliente);
			fO.create(f);
			break;
	}
     }
}