package fr.encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.bll.UtilisateurManager;
import fr.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletProfilDelete
 */
@WebServlet("/ServletProfilDelete")
public class ServletProfilDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String pseudo = null;
		pseudo = (String) session.getAttribute("pseudo");
			
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		
		try {
			utilisateurManager.supprimerUtilisateur(pseudo);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		session.invalidate();
		RequestDispatcher rd = request.getRequestDispatcher("ServletAccueil");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
