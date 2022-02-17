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
	
	public Utilisateur ajouterUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse) throws BusinessException {
		BusinessException businessException = new BusinessException();
		
		//this.validerUtilisateur(newUtilisateur, businessException);
		
		Utilisateur utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
		utilisateur.setCredit(0);
		utilisateur.setAdministrateur(false);
		
		if(!businessException.hasErreurs())
		{
		System.out.println("vous etes dans le if");
			
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
