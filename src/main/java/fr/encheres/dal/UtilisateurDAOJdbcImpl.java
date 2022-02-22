package fr.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.encheres.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String INSERT_UTILISATEUR = "insert into UTILISATEURS(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_BY_PSEUDO_UTILISATEUR = "select * from UTILISATEURS where pseudo = ?";
	private static final String SELECT_BY_ID_UTILISATEUR = "select * from UTILISATEURS where no_utilisateur = ?";
	private static final String DELETE_UTILISATEUR = "delete from UTILISATEURS where no_utilisateur = ?";
	private static final String MODIFIER_UTILISATEUR = "update UTILISATEURS set pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,ville=?,mot_de_passe=? where no_utilisateur = ?";
	private static final String SELECT_LOGIN = "select * from UTILISATEURS where pseudo=? and mot_de_passe=?";
	private static final String SELECT_BY_EMAIL_UTILISATEUR = "select * from UTILISATEURS where email = ?";
	
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

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_PSEUDO_UTILISATEUR)) {

			pstmt.setString(1, pseudo);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
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

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(MODIFIER_UTILISATEUR)) {
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getNoUtilisateur());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public boolean validerMdp(String pseudo, String mdp) {
		boolean status = false;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_LOGIN);
			pstmt.setString(1, pseudo);
			pstmt.setString(2, mdp);

			ResultSet rs = pstmt.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean validerEmail(String email) {
		boolean valide = false;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_EMAIL_UTILISATEUR)) {

			pstmt.setString(1, email);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
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

	@Override
	public boolean validerFormatPseudo(String pseudo) {
		String pattern = "^[a-zA-Z0-9]*$";
	    return pseudo.matches(pattern);
	}

	@Override
	public boolean confirmerMdp(String motDePasse, String confirmation) {
		boolean confirmationMdp = false;
		if(motDePasse.equals(confirmation)) {
			confirmationMdp = true;
		}
		return confirmationMdp;
	}
}
