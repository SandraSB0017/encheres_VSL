package fr.encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.dal.LoginDAO;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String mdp = request.getParameter("motDePasse");

		if (LoginDAO.validate(pseudo, mdp)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("pseudo", pseudo );
			session.setAttribute("motDePasse", mdp);
			
			RequestDispatcher rd = request.getRequestDispatcher("ServletListeEncheres");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("ServletAccueil");
			rd.include(request, response);
		}
	}
}













