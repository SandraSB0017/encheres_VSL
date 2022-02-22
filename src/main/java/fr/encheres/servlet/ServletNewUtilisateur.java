package fr.encheres.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.Utilisateur;
import fr.encheres.exception.BusinessException;

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
		request.setCharacterEncoding("UTF-8");
		String pseudo;
		String nom;
		String prenom;
		String email;
		String telephone;
		String rue;
		String codePostal;
		String ville;
		String motDePasse;
		String confirmation;
		
			pseudo = request.getParameter("pseudo");
			nom =request.getParameter("nom");
			prenom = request.getParameter("prenom")	;
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue = request.getParameter("rue");
			codePostal = request.getParameter("codePostal");
			ville = request.getParameter("ville");
			motDePasse = request.getParameter("motDePasse");
			confirmation = request.getParameter("confirmation");
						
			UtilisateurManager utilisateurManager = new UtilisateurManager();
			
			try {
				utilisateurManager.ajouterUtilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse,confirmation);
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/listeEncheres.jsp").forward(request, response);
			} catch (BusinessException e) {
				e.printStackTrace();
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewUtilisateur.jsp").forward(request, response);
			}
	

		
	}

}
