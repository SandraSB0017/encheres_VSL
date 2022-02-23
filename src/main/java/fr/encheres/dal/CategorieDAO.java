package fr.encheres.dal;

import java.sql.SQLException;

public interface CategorieDAO {
	public int selectCategorie (String libelleCategorie) throws SQLException;
}
