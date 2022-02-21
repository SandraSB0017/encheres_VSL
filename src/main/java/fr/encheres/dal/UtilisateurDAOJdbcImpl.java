package fr.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.encheres.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl<vboolean> implements UtilisateurDAO {

	private static final String INSERT_UTILISATEUR = "insert into UTILISATEURS(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_BY_PSEUDO_UTILISATEUR = "select * from UTILISATEURS where pseudo = ?";
	private static final String SELECT_BY_ID_UTILISATEUR = "select * from UTILISATEURS where no_utilisateur = ?";
	private static final String DELETE_UTILISATEUR = "delete from UTILISATEURS where no_utilisateur = ?";

	@Override
	public void insertUtilisateur(Utilisateur utilisateur) {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR,
						PreparedStatement.RETURN_GENERATED_KEYS)) {
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.setBoolean(11, utilisateur.getAdministrateur());
			pstmt.executeUpdate();

			try (ResultSet rs = pstmt.getGeneratedKeys()) {
				if (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Utilisateur selectUtilisateur(String pseudo) {

		Utilisateur utilisateur = new Utilisateur();

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_PSEUDO_UTILISATEUR)) {
			pstmt.setString(1, pseudo);

			try (ResultSet rs = pstmt.executeQuery()) {

				while (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
					utilisateur.setPseudo(rs.getString("pseudo"));
					utilisateur.setNom(rs.getString("nom"));
					utilisateur.setPrenom(rs.getString("prenom"));
					utilisateur.setEmail(rs.getString("email"));
					utilisateur.setTelephone(rs.getString("telephone"));
					utilisateur.setRue(rs.getString("rue"));
					utilisateur.setCodePostal(rs.getString("code_postal"));
					utilisateur.setVille(rs.getString("ville"));
					utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
					utilisateur.setCredit(rs.getInt("credit"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}
	
	@Override
	public void deleteUtilisateur(int noUtilisateur) {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR)) {

			pstmt.setInt(1, noUtilisateur);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Utilisateur selectUtilisateur(int noUtilisateur) {
		Utilisateur utilisateur = new Utilisateur();

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID_UTILISATEUR)) {
			pstmt.setInt(1, noUtilisateur);

			try (ResultSet rs = pstmt.executeQuery()) {

				while (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
					utilisateur.setPseudo(rs.getString("pseudo"));
					utilisateur.setNom(rs.getString("nom"));
					utilisateur.setPrenom(rs.getString("prenom"));
					utilisateur.setEmail(rs.getString("email"));
					utilisateur.setTelephone(rs.getString("telephone"));
					utilisateur.setRue(rs.getString("rue"));
					utilisateur.setCodePostal(rs.getString("code_postal"));
					utilisateur.setVille(rs.getString("ville"));
					utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
					utilisateur.setCredit(rs.getInt("credit"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}
	
	@Override
	public boolean validerPseudo(String pseudo) {
		boolean valide = false;
		Utilisateur utilisateur = new Utilisateur();

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_PSEUDO_UTILISATEUR)) {

			pstmt.setString(1, pseudo);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
					valide = false;
				} else {
					valide = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valide;
	}

}
