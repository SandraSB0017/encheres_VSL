package fr.encheres.bo;


import java.io.Serializable;
import java.sql.Date;

	public class ArticlesVendus implements Serializable {
		
		
		
		private static final long serialVersionUID = 1L;
		private int noArticle;
		private String nomArticle;
		private String description;
		private Date dateDebutEncheres;
		private Date dateFinEncheres;
		private int prixInitial;
		private int prixVente;
		private int noUtilisateur;
		private int noCategorie;
		
		
		
		
		
		/**
		 * @return the noArticle
		 */
		public int getNoArticle() {
			return noArticle;
		}
		/**
		 * @param noArticle the noArticle to set
		 */
		public void setNoArticle(int noArticle) {
			this.noArticle = noArticle;
		}
		/**
		 * @return the nomArticle
		 */
		public String getNomArticle() {
			return nomArticle;
		}
		/**
		 * @param nomArticle the nomArticle to set
		 */
		public void setNomArticle(String nomArticle) {
			this.nomArticle = nomArticle;
		}
		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		/**
		 * @return the dateDebutEncheres
		 */
		public Date getDateDebutEncheres() {
			return dateDebutEncheres;
		}
		/**
		 * @param dateDebutEncheres the dateDebutEncheres to set
		 */
		public void setDateDebutEncheres(Date dateDebutEncheres) {
			this.dateDebutEncheres = dateDebutEncheres;
		}
		/**
		 * @return the dateFinEncheres
		 */
		public Date getDateFinEncheres() {
			return dateFinEncheres;
		}
		/**
		 * @param dateFinEncheres the dateFinEncheres to set
		 */
		public void setDateFinEncheres(Date dateFinEncheres) {
			this.dateFinEncheres = dateFinEncheres;
		}
		/**
		 * @return the prixInitial
		 */
		public int getPrixInitial() {
			return prixInitial;
		}
		/**
		 * @param prixInitial the prixInitial to set
		 */
		public void setPrixInitial(int prixInitial) {
			this.prixInitial = prixInitial;
		}
		/**
		 * @return the prixVente
		 */
		public int getPrixVente() {
			return prixVente;
		}
		/**
		 * @param prixVente the prixVente to set
		 */
		public void setPrixVente(int prixVente) {
			prixVente = this.prixVente;
		}
		/**
		 * @return the noUtilisateur
		 */
		public int getNoUtilisateur() {
			return noUtilisateur;
		}
		/**
		 * @param noUtilisateur the noUtilisateur to set
		 */
		public void setNoUtilisateur(int noUtilisateur) {
			this.noUtilisateur = noUtilisateur;
		}
		/**
		 * @return the noCategorie
		 */
		public int getNoCategorie() {
			return noCategorie;
		}
		/**
		 * @param noCategorie the noCategorie to set
		 */
		public void setNoCategorie(int noCategorie) {
			this.noCategorie = noCategorie;
		}
		/**
		 * 
		 */
		public ArticlesVendus() {
			super();
		}
		/**
		 * @param noArticle
		 * @param nomArticle
		 * @param description
		 * @param dateDebutEncheres
		 * @param dateFinEncheres
		 * @param prixInitial
		 * @param prixVente
		 * @param noUtilisateur
		 * @param noCategorie
		 */
		public ArticlesVendus(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
				Date dateFinEncheres, int prixInitial, int prixVente, int noUtilisateur, int noCategorie) {
			super();
			this.noArticle = noArticle;
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEncheres = dateDebutEncheres;
			this.dateFinEncheres = dateFinEncheres;
			this.prixInitial = prixInitial;
			this.prixVente = prixVente;
			this.noUtilisateur = noUtilisateur;
			this.noCategorie = noCategorie;
		}
		/**
		 * @param nomArticle
		 * @param description
		 * @param dateDebutEncheres
		 * @param dateFinEncheres
		 * @param prixInitial
		 * @param prixVente
		 * @param noUtilisateur
		 * @param noCategorie
		 */
		public ArticlesVendus(String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
				int prixInitial, int prixVente, int noUtilisateur, int noCategorie) {
			super();
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEncheres = dateDebutEncheres;
			this.dateFinEncheres = dateFinEncheres;
			this.prixInitial = prixInitial;
			this.prixVente = prixVente;
			this.noUtilisateur = noUtilisateur;
			this.noCategorie = noCategorie;
		}
		@Override
		public String toString() {
			return "ArticlesVendus [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
					+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", prixInitial="
					+ prixInitial + ", prixVente=" + prixVente + ", noUtilisateur=" + noUtilisateur + ", noCategorie="
					+ noCategorie + "]";
		}
}
