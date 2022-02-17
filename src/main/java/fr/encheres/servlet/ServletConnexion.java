package fr.encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.bo.ConnexionForm;
import fr.encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public static final String user = "utilisateur";
	    public static final String formulaire = "form";
	    public static final String sessionUser = "sessionUtilisateur";
	   
	
	
	
	
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);
	
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String pseudo = request.getParameter("pseudo");
		    String motDePasse = request.getParameter("motDePasse");

		    HttpSession session = request.getSession();

		    session.setAttribute("pseudo", pseudo);
		    session.setAttribute("motDePasse", motDePasse);
		    
		    
		    
		    
		    /** Préparation de l'objet formulaire **/
	       /* ConnexionForm form = new ConnexionForm();

	        /** Traitement de la requête et récupération du bean en résultant **/
	      /*  Utilisateur utilisateur = form.connecterUtilisateur( request );

	       
	        
	        /**
	         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
	         * Utilisateur à la session, sinon suppression du bean de la session.
	         */
	      /*  if ( form.getErreurs().isEmpty() ) {
	            session.setAttribute( sessionUser, utilisateur );
	        } else {
	            session.setAttribute( sessionUser, null );
	        }
		    
	        /** Stockage du formulaire et du bean dans l'objet request* */
	      /*  request.setAttribute( formulaire, form );
	        request.setAttribute( user, utilisateur );

	  
		    this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/connexion.jsp").forward(request, response);*/
		    
	  
		    
	}

}








   