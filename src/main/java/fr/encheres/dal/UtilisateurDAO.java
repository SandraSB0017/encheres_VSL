package fr.encheres.dal;

import fr.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void insertUtilisateur (Utilisateur utilisateur);
	public Utilisateur selectUtilisateur (String pseudo);
	public Utilisateur selectUtilisateur (int noUtilisateur);
	public void deleteUtilisateur (int noUtilisateur);
	public boolean validerPseudo(String pseudo);
	public boolean validerEmail(String email);
	public Utilisateur  modifierUtilisateur(Utilisateur utilisateur);
	public boolean validerMdp(String pseudo, String mdp);
	public boolean validerFormatPseudo(String pseudo);
	public boolean confirmerMdp(String motDePasse, String confirmation);
	
}
