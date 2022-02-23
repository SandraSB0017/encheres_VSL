package fr.encheres.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.encheres.bo.ArticlesVendus;

public class ArticleDAOJdbcImpl implements ArticleDAO {
	private static final String INSERT_ARTICLE = "insert into ARTICLES_VENDUS (nom_article,description,date_debut_encheres,prix_initial,no_utilisateur, no_categorie) values(?,?,?,?,?,?)";


@Override
public void insertArticle (ArticlesVendus article) {
	try (Connection cnx = ConnectionProvider.getConnection();
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE,
					PreparedStatement.RETURN_GENERATED_KEYS)) {
		pstmt.setString(1, article.getNomArticle());
		pstmt.setString(2, article.getDescription());
		pstmt.setString(3,  article.getDateDebutEncheres());
		//pstmt.setDate(4, article.getDateFinEncheres());
		pstmt.setInt(4, article.getPrixInitial());
		//pstmt.setInt(6, article.getPrixVente());
		pstmt.setInt(5, article.getNoUtilisateur());
		pstmt.setInt(6, article.getNoCategorie());
		pstmt.executeUpdate();
		
		try (ResultSet rs = pstmt.getGeneratedKeys()) {
			if (rs.next()) {
				article.setNoArticle(rs.getInt(1));
			}
		
		}
		
	
} catch (SQLException e) {
	
	e.printStackTrace();
}
}
}
