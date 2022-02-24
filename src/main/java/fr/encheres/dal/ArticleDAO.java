package fr.encheres.dal;

import java.util.List;

import fr.encheres.bo.ArticlesVendus;

public interface ArticleDAO {
	public void insertArticle (ArticlesVendus article);

	public ArticlesVendus selectArticle(int noArticle);

	public List<ArticlesVendus> selectAll();
	
	public List<ArticlesVendus> select();

}