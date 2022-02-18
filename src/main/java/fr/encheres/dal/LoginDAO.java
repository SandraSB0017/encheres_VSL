package fr.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	private static final String SELECT_LOGIN = "select * from UTILISATEURS where pseudo=? and mot_de_passe=?";

	public static boolean validate(String pseudo, String motDePasse) {
		boolean status = false;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_LOGIN);
			pstmt.setString(1, pseudo);
			pstmt.setString(2, motDePasse);

			ResultSet rs = pstmt.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
