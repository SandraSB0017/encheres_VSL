package fr.encheres.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.Utilisateur;
import fr.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletProfilAutreUtilisateur
 */
@WebServlet("/ServletProfilAutreUtilisateur")
public class ServletProfilAutreUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noUtilisateur=Integer.parseInt(request.getParameter("noUtilisateur"));
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		Utilisateur utilisateur;
		try {
			utilisateur = utilisateurManager.selectionnerUtilisateur(noUtilisateur);
			request.setAttribute("utilisateur", utilisateur);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/profilAutreUtilisateur.jsp").forward(request, response);
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
