package fr.encheres.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.encheres.bo.ArticlesVendus;

public class ArticleDAOJdbcImpl implements ArticleDAO {
	private static final String INSERT_ARTICLE = "insert into ARTICLES_VENDUS (nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,no_utilisateur, no_categorie) values(?,?,?,?,?,?,?)";
	private static final String SELECT_BY_NO_ARTICLE = "select * from ARTICLES_VENDUS where no_article = ?";
	private static final String SELECT_ALL_ARTICLE = "select * from ARTICLES_VENDUS";
	@Override
	public void insertArticle(ArticlesVendus article) {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE,
						PreparedStatement.RETURN_GENERATED_KEYS)) {
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setString(3, article.getDateDebutEncheres());
			pstmt.setString(4, article.getDateFinEncheres());
			pstmt.setInt(5, article.getPrixInitial());
			// pstmt.setInt(6, article.getPrixVente());
			pstmt.setInt(6, article.getNoUtilisateur());
			pstmt.setInt(7, article.getNoCategorie());
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

	@Override
	public ArticlesVendus selectArticle(int noArticle) {
		ArticlesVendus article = new ArticlesVendus();
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_NO_ARTICLE)) {
			pstmt.setInt(1, noArticle);
			try (ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					article.setNomArticle(rs.getString("nom_article"));
					article.setPrixInitial(rs.getInt("prix_initial"));
					article.setDateFinEncheres(rs.getString("date_fin_encheres"));
					article.setNoUtilisateur(rs.getInt("no_utilisateur"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public List<ArticlesVendus> selectAll() {
		List<ArticlesVendus> listeArticle = new ArrayList<ArticlesVendus>();
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL_ARTICLE)) {
			ResultSet rs = pstmt.executeQuery();
			ArticlesVendus article = null;
			while (rs.next()) {
				article = new ArticlesVendus(
							rs.getInt("no_article"),
							rs.getString("nom_article"),
							rs.getString("description"),
							rs.getString("date_debut_encheres"),
							rs.getString("date_fin_encheres"),
							rs.getInt("prix_initial"),
							rs.getInt("prix_vente"),
							rs.getInt("no_utilisateur"),
							rs.getInt("no_categorie"));
				listeArticle.add(article);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeArticle;
	}
}
