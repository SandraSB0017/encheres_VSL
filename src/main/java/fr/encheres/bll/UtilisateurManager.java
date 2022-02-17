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
	
	public void ajouterUtilisateur(Utilisateur newUtilisateur) throws BusinessException {
		BusinessException businessException = new BusinessException();
		
		this.validerUtilisateur(newUtilisateur, businessException);
		
		Utilisateur utilisateur=null;
		
		if(!businessException.hasErreurs())
		{
			utilisateur = new Utilisateur();
			this.utilisateurDAO.insertUtilisateur(utilisateur);
		}
		else
		{
			throw businessException;
		}
	}

	private void validerUtilisateur(Utilisateur newUtilisateur, BusinessException businessException) {
		
	}
	
	

}
