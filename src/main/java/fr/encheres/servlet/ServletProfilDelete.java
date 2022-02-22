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
import fr.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletProfilDelete
 */
@WebServlet(urlPatterns = { "/supprimer", "/modifier" })
public class ServletProfilDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String motDePasseActuel = (String) session.getAttribute("motDePasse");
		System.out.println("mdp actuel" + motDePasseActuel);
		String motDePasseVerifie = request.getParameter("motDePasseVerifie");
		System.out.println("mdp verifie" + motDePasseVerifie);

		if (request.getServletPath().equals("/supprimer") || motDePasseActuel.equals(motDePasseVerifie)) {
			int noUtilisateur = (int) session.getAttribute("noUtilisateur");
			UtilisateurManager utilisateurManager = new UtilisateurManager();

			try {
				utilisateurManager.supprimerUtilisateur(noUtilisateur);
				RequestDispatcher rd = request.getRequestDispatcher("ServletAccueil");
				rd.forward(request, response);
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			session.invalidate();

		} else if (request.getServletPath().equals("/modifier") || motDePasseActuel.equals(motDePasseVerifie)) {
			System.out.println("Dans le ELSE IF");
			request.setCharacterEncoding("UTF-8");
			Utilisateur utilisateur = null;
			String pseudo;
			String nom;
			String prenom;
			String email;
			String telephone;
			String rue;
			String codePostal;
			String ville;
			// String motDePasse;
			int noUtilisateur = (int) session.getAttribute("noUtilisateur");
			pseudo = request.getParameter("pseudo");
			System.out.println(pseudo);
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue = request.getParameter("rue");
			codePostal = request.getParameter("codePostal");
			ville = request.getParameter("ville");

			try {
				System.out.println("Dans le Try");
				utilisateur = new UtilisateurManager().selectionnerUtilisateur(noUtilisateur);
				System.out.println("Dans le try après sélection user" + noUtilisateur);
			} catch (BusinessException e) {

				e.printStackTrace();
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewUtilisateur.jsp").forward(request,
						response);
			}
			utilisateur.setPseudo(pseudo);
			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setEmail(email);
			utilisateur.setTelephone(telephone);
			utilisateur.setRue(rue);
			utilisateur.setCodePostal(codePostal);
			utilisateur.setVille(ville);

			try {
				System.out.println("Ds Try avant modifier");
				new UtilisateurManager().modifierUtilisateur(utilisateur);
				System.out.println("Ds Try après modifier");
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			response.sendRedirect("ServletProfil");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String motDePasseAcctuel = (String) session.getAttribute("motDePasse");
		System.out.println("mdp actuel" + motDePasseAcctuel);
		String motDePasseVerifie = request.getParameter("motDePasseVerifie");
		System.out.println("mdp nouveau" + motDePasseVerifie);

		if (request.getServletPath().equals("/supprimer") && motDePasseAcctuel.equals(motDePasseVerifie)) {
			int noUtilisateur = (int) session.getAttribute("noUtilisateur");
			UtilisateurManager utilisateurManager = new UtilisateurManager();

			try {
				utilisateurManager.supprimerUtilisateur(noUtilisateur);
				RequestDispatcher rd = request.getRequestDispatcher("ServletAccueil");
				rd.forward(request, response);
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			session.invalidate();

		} else if (request.getServletPath().equals("/modifier") && motDePasseAcctuel.equals(motDePasseVerifie)) {
			System.out.println("Dans le ELSE IF");
			request.setCharacterEncoding("UTF-8");
			Utilisateur utilisateur = null;
			String pseudo;
			String nom;
			String prenom;
			String email;
			String telephone;
			String rue;
			String codePostal;
			String ville;
			// String motDePasse;
			int noUtilisateur = (int) session.getAttribute("noUtilisateur");
			pseudo = request.getParameter("pseudo");
			System.out.println(pseudo);
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue = request.getParameter("rue");
			codePostal = request.getParameter("codePostal");
			ville = request.getParameter("ville");
			// motDePasse = request.getParameter("motDePasse");

			try {
				System.out.println("Dans le Try");
				utilisateur = new UtilisateurManager().selectionnerUtilisateur(noUtilisateur);
				System.out.println("Dans le try après sélection user" + noUtilisateur);
			} catch (BusinessException e) {

				e.printStackTrace();
				this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewUtilisateur.jsp").forward(request,
						response);
			}
			utilisateur.setPseudo(pseudo);
			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setEmail(email);
			utilisateur.setTelephone(telephone);
			utilisateur.setRue(rue);
			utilisateur.setCodePostal(codePostal);
			utilisateur.setVille(ville);
			// utilisateur.setMotDePasse(motDePasse);

			try {
				System.out.println("Ds Try avant modifier");
				new UtilisateurManager().modifierUtilisateur(utilisateur);
				System.out.println("Ds Try après modifier");
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			response.sendRedirect("ServletProfil");
		} else {
			this.getServletContext().getRequestDispatcher("/ServletProfilEdit").forward(request, response);
		}
	}
}
