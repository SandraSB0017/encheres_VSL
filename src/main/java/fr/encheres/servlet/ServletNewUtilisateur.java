package fr.encheres.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNewUtilisateur
 */
@WebServlet("/ServletNewUtilisateur")
public class ServletNewUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewUtilisateur.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewUtilisateur.jsp").forward(request, response);
	}

}
