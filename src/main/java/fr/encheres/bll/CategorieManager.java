package fr.encheres.bll;

import java.sql.SQLException;

import fr.encheres.dal.CategorieDAO;
import fr.encheres.dal.DAOFactory;

public class CategorieManager {
	private CategorieDAO categorieDAO;

	public CategorieManager() {
		this.categorieDAO = DAOFactory.getCategorieDAO();
	}
	
	public int selectCategorie(String libelleCategorie) throws SQLException {
		return this.categorieDAO.selectCategorie(libelleCategorie);
		
	}
}
