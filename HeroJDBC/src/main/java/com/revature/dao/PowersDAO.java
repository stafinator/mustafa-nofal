package com.revature.dao;

import java.sql.SQLException;

public interface PowersDAO {
	public abstract void createPowers(String powerName)
			throws SQLException;
}
