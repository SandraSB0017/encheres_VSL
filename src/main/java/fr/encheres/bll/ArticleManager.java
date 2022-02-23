package fr.encheres.bll;

import java.sql.Date;
import java.time.LocalDate;

import fr.encheres.bo.ArticlesVendus;
import fr.encheres.dal.ArticleDAO;
import fr.encheres.dal.DAOFactory;
import fr.encheres.exception.BusinessException;

public class ArticleManager {
	private ArticleDAO articleDAO;

	public ArticleManager() {
		this.articleDAO = DAOFactory.getArticleDAO();
	}

	public ArticlesVendus ajouterArticle(String nomArticle, String description, java.util.Date dateDebutEncheres, int prixInitial, int noUtilisateur,
			int noCategorie) throws BusinessException {
		BusinessException businessException = new BusinessException();

		ArticlesVendus article = null;

		article = new ArticlesVendus(nomArticle, description, prixInitial, noCategorie);
		article.setDateDebutEncheres(dateDebutEncheres);
		// article.setDateFinEncheres(LocalDate.now());
		article.setNomArticle(nomArticle);
		article.setDescription(description);
		article.setNoUtilisateur(noUtilisateur);
		article.setPrixInitial(prixInitial);
		article.setNoCategorie(noCategorie);
	

		this.articleDAO.insertArticle(article);
		return article;
	}
	
	
}
