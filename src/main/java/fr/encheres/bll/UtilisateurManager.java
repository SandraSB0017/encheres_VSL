package fr.encheres.bll;

import fr.encheres.bo.Utilisateur;
import fr.encheres.dal.DAOFactory;
import fr.encheres.dal.UtilisateurDAO;
import fr.encheres.exception.BusinessException;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public Utilisateur ajouterUtilisateur(String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, String confirmation)
			throws BusinessException {
		BusinessException businessException = new BusinessException();
		Utilisateur utilisateur = null;

		if (this.validerUtilisateur(pseudo, email, motDePasse, confirmation)) {
			utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
			utilisateur.setCredit(0);
			utilisateur.setAdministrateur(false);
			if (!businessException.hasErreurs()) {
				this.utilisateurDAO.insertUtilisateur(utilisateur);
			} else {
				throw businessException;
			}
		}
		return utilisateur;
	}

	private boolean validerUtilisateur(String pseudo, String email, String motDePasse, String confirmation)
			throws BusinessException {
		boolean valide = false;
		if (utilisateurDAO.validerPseudo(pseudo) && utilisateurDAO.validerFormatPseudo(pseudo)
				&& utilisateurDAO.validerEmail(email) && utilisateurDAO.confirmerMdp(motDePasse, confirmation)) {
			valide = true;
		}
		return valide;
	}

	public Utilisateur selectionnerUtilisateur(String pseudo) throws BusinessException {
		return this.utilisateurDAO.selectUtilisateur(pseudo);
	}

	public Utilisateur selectionnerUtilisateur(int noUtilisateur) throws BusinessException {
		return utilisateurDAO.selectUtilisateur(noUtilisateur);
	}

	public void supprimerUtilisateur(int noUtilisateur) throws BusinessException {
		this.utilisateurDAO.deleteUtilisateur(noUtilisateur);
	}

	public void supprimerUtilisateur(Utilisateur utilisateur) throws BusinessException {
		utilisateurDAO.deleteUtilisateur(utilisateur.getNoUtilisateur());
	}

	public void modifierUtilisateur(Utilisateur utilisateur) throws BusinessException {
		utilisateurDAO.modifierUtilisateur(utilisateur);
	}

	public boolean validerMdp(String pseudo, String mdp) throws BusinessException {
		return utilisateurDAO.validerMdp(pseudo, mdp);
	}

}
