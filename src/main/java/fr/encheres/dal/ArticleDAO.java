package fr.encheres.dal;

import fr.encheres.bo.ArticlesVendus;

public interface ArticleDAO {
	public void insertArticle (ArticlesVendus article);

	public ArticlesVendus selectArticle(int noArticle);
	

}
