package fr.encheres.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.bll.ArticleManager;
import fr.encheres.bll.CategorieManager;
import fr.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletPage2
 */
@WebServlet("/ServletNouvelleVente")
public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/nouvelleVente.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		String nomArticle;
		String description;
		String dateDebutEncheres;
		String dateFinEncheres;
		int prixInitial;
		int PrixVente;
		String rue;
		int codePostal;
		String ville;
		String libelleCategorie;
		int noUtilisateur = (int) session.getAttribute("noUtilisateur");

		nomArticle = request.getParameter("nomArticle");
		description = request.getParameter("description");
		dateDebutEncheres= request.getParameter("dateDebutEncheres");
		dateFinEncheres = request.getParameter("dateFinEncheres");
		prixInitial = Integer.parseInt(request.getParameter("prixInitial"));
		// rue = request.getParameter("rue");
		// codePostal=Integer.parseInt(request.getParameter("codePostal"));
		// ville = request.getParameter("ville");
		
		libelleCategorie=request.getParameter("libelleCategorie");
		ArticleManager articleManager = new ArticleManager();
		CategorieManager categorieManager = new CategorieManager();

		try {
			
			int noCategorie = categorieManager.selectCategorie(libelleCategorie);
			articleManager.ajouterArticle(nomArticle, description,dateDebutEncheres,dateFinEncheres, prixInitial, noUtilisateur, noCategorie);
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/listeEncheres.jsp").forward(request, response);
		} catch (BusinessException | SQLException e) {
			e.printStackTrace();
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/nouvelleVente.jsp").forward(request, response);
		}

	}

}
