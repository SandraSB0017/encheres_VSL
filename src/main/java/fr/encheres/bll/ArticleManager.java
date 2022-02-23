package fr.encheres.bll;

import java.sql.Date;

import fr.encheres.bo.ArticlesVendus;
import fr.encheres.dal.ArticleDAO;
import fr.encheres.dal.DAOFactory;

public class ArticleManager {
	private ArticleDAO articleDAO;

	public ArticleManager() {
		this.articleDAO = DAOFactory.getArticleDAO();
	}

	public ArticlesVendus ajouterArticle (String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			int prixInitial, int prixVente, int noUtilisateur, int noCategorie) {
		
		ArticlesVendus article =null;
		
		this.articleDAO.insertArticle(article);
	
	

	return article;
}
}
