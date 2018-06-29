package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UsuarioDao;

/**
 * Servlet implementation class pp
 */
@WebServlet("/pp")
public class pp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pp() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String path = request.getServletPath();
		String user = request.getParameter("user");
        String pass = request.getParameter("pass");
	
        System.out.println("user es:" + user);
       
//        HttpSession session = request.getSession(true);
       // RequestDispatcher dispatcher;
        String url="";
        UsuarioDao aO = new UsuarioDao();
        System.out.println("pahts:" + path);
   

			
			  System.out.println("llega a qui:" );
			
			if (aO.validar(user, pass) == 1) {
				 System.out.println("1");
                url = "/Modulos.jsp";
             
          } else {
        	  System.out.println("2");
        	  url = "/index.jsp";
              
          }
			
        
        System.out.println("urls:" + url);
        RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
     }

}
