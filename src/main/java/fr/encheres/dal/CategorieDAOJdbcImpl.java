package fr.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieDAOJdbcImpl implements CategorieDAO {
	private static final String SELECT_BY_LIBELLE = "select * from CATEGORIES where libelle = ?";

	@Override
	public int selectCategorie(String libelleCategorie) throws SQLException {
		int noCategorie = 0;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_LIBELLE)) {
			pstmt.setString(1, libelleCategorie);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				noCategorie = rs.getInt("no_categorie");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return noCategorie;
	}

}
