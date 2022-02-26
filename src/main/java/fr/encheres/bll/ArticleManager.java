package fr.encheres.bll;


import java.util.List;

import fr.encheres.bo.ArticlesVendus;
import fr.encheres.dal.ArticleDAO;
import fr.encheres.dal.DAOFactory;
import fr.encheres.exception.BusinessException;

public class ArticleManager {
	private ArticleDAO articleDAO;

	public ArticleManager() {
		this.articleDAO = DAOFactory.getArticleDAO();
	}

	public ArticlesVendus ajouterArticle(String nomArticle, String description, String dateDebutEncheresSaisies, String dateFinEncheres, int prixInitial, int noUtilisateur,
			int noCategorie) throws BusinessException {
		BusinessException businessException = new BusinessException();

		ArticlesVendus article = null;

		article = new ArticlesVendus(nomArticle, description, prixInitial, noCategorie);
		article.setDateDebutEncheres(dateDebutEncheresSaisies);
		article.setDateFinEncheres(dateFinEncheres);
		article.setNomArticle(nomArticle);
		article.setDescription(description);
		article.setNoUtilisateur(noUtilisateur);
		article.setPrixInitial(prixInitial);
		article.setNoCategorie(noCategorie);
	

		this.articleDAO.insertArticle(article);
		return article;
	}

	public ArticlesVendus selectionnerArticle(int noArticle) {
		return this.articleDAO.selectArticle(noArticle);
	}

	public List<ArticlesVendus> select() {
		List<ArticlesVendus> listeArticle = null;
		listeArticle = articleDAO.select();
		return listeArticle;
	}
	
	
}
