package fr.encheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import fr.encheres.bll.ArticleManager;
import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.ArticlesVendus;
import fr.encheres.bo.Utilisateur;
import fr.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletAccueil
 */
@WebServlet("/ServletAccueil")
public class ServletAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		/*ArticleManager articleManager = new ArticleManager();
		ArticlesVendus article;
		int noArticle = 14;

		UtilisateurManager utilisateurManager = new UtilisateurManager();
		Utilisateur utilisateur;

		try {
			article = articleManager.selectionnerArticle(noArticle);
			int noUtilisateur = article.getNoUtilisateur();
			utilisateur = utilisateurManager.selectionnerUtilisateur(noUtilisateur);
			request.setAttribute("article", article);
			request.setAttribute("utilisateur", utilisateur);
		} catch (BusinessException e) {
			e.printStackTrace();
		}*/
		List<ArticlesVendus>listeArticle = new ArticleManager().selectAllArticle();
		request.setAttribute("listeArticle", listeArticle);
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		Utilisateur utilisateur = null;
		ArticlesVendus article = null;
		int i=0;
		int noArticle=0;
		ArticleManager articleManager = new ArticleManager();
		for(i=0 ; i< listeArticle.size(); i++) {
			int noUtilisateur = article.getNoUtilisateur();
			try {
				utilisateur = utilisateurManager.selectionnerUtilisateur(noUtilisateur);
				article = articleManager.selectionnerArticle(noArticle);
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("utilisateur", utilisateur);
		}
		
		

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
