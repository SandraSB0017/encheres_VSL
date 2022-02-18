package fr.encheres.dal;

import fr.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void insertUtilisateur (Utilisateur utilisateur);
	public Utilisateur selectUtilisateur (String pseudo);
	

}
