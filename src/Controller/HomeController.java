package Controller;


import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Dao.UsuarioDao;

//

/**
 * Servlet implementation class HomeController
 */
@WebServlet(name = "HomeController", urlPatterns = { "/Home","/registrarC", "/administrarcompra", "/listar", "/buscarconsolidado",
		"/listarcomprador", "/generarorden", "/evaluarorden", "/registrarcompra", "/tipocompra", "/addordencompra" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String path = request.getServletPath();
		String user = request.getParameter("usertxt");
        String pass = request.getParameter("passtxt");
	

//        HttpSession session = request.getSession(true);
       // RequestDispatcher dispatcher;
        String url="";
        UsuarioDao aO = new UsuarioDao();
        System.out.println("paht:" + path);
        switch (path) {
		case "/Home":
			
			  System.out.println("llega a qui:" );
			
			if (aO.validar(user, pass) == 1) {
				 System.out.println("1");
                url = "Residente.jsp";
             
          } else {
        	  System.out.println("2");
        	  url = "index.jsp";
              
          }
			break;
		
		case "/listar":
			 System.out.println("opcion lisrar");
			break;
        

		case "/registrarC":
			url = "registarC.jsp";
			 System.out.println("opcion lisrar");
			break;
		
	}
        
        System.out.println("urls:" + url);

        RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
     }
	}