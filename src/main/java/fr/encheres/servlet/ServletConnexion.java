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
import fr.encheres.bo.Utilisateur;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		String pseudo = request.getParameter("pseudo");
		String mdp = request.getParameter("motDePasse");

		if (LoginDAO.validate(pseudo, mdp)) {
			HttpSession session = request.getSession();
			session.setAttribute("pseudo", pseudo);
			session.setAttribute("motDePasse", mdp);

			UtilisateurManager utilisateurManager = new UtilisateurManager();
			Utilisateur utilisateur;
			try {
				utilisateur = utilisateurManager.selectionnerUtilisateur(pseudo);
				session.setAttribute("noUtilisateur", utilisateur.getNoUtilisateur());
			} catch (Exception e) {
				e.printStackTrace();
			}

			RequestDispatcher rd = request.getRequestDispatcher("ServletListeEncheres");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("ServletAccueil");

			try {
				rd.include(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}
