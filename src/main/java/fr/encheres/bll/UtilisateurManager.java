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
	
	public Utilisateur ajouterUtilisateur(Utilisateur newUtilisateur) throws BusinessException {
		BusinessException businessException = new BusinessException();
		
		this.validerUtilisateur(newUtilisateur, businessException);
		
		Utilisateur utilisateur=null;
		
		if(!businessException.hasErreurs())
		{
		System.out.println("vous etes dans le if");
			utilisateur = new Utilisateur();
			utilisateur.setCredit(0);
			utilisateur.setAdministrateur(false);
			this.utilisateurDAO.insertUtilisateur(utilisateur);
			
		}
		else
		{
			System.out.println("vous etes dans le else");
			throw businessException;
			
		}
		return utilisateur;
	}

	private void validerUtilisateur(Utilisateur newUtilisateur, BusinessException businessException) {
		
	}
	
	

}
