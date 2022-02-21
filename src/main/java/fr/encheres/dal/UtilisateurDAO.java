package fr.encheres.dal;

import fr.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void insertUtilisateur (Utilisateur utilisateur);
	public Utilisateur selectUtilisateur (String pseudo);
	public Utilisateur selectUtilisateur (int noUtilisateur);
	public void deleteUtilisateur (int noUtilisateur);
	public boolean validerPseudo(String pseudo);
	public Utilisateur  modifierUtilisateur(Utilisateur utilisateur);
	
}
