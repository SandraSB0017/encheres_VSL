package fr.encheres.dal;

/**
 * Les codes disponibles sont entre 10000 et 19999
 */
public abstract class CodesResultatDAL {
	/**
	 * Echec général quand erreur non gérée à l'insertion 
	 */
	public static final int INSERT_UTILISATEUR_ECHEC=10000;
	/**
	 * Echec de la lecture d'un utilisateur
	 */
	public static final int LECTURE_UTILISATEUR_ECHEC = 10001;
	/**
	 * Utilisateur inexistant
	 */
	public static final int LECTURE_UTILISATEUR_INEXISTANT = 10002;
	/**
	 * Erreur à la suppression d'un utilisateur
	 */
	public static final int SUPPRESSION_UTILISATEUR_ERREUR = 10003;
	
}
