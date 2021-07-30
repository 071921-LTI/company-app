package com.revature.daos;

public class DAOFactory {

	private static EmployeeDao ed;
	private static DAOFactory df;
	
	private DAOFactory() {}
	
	public static synchronized DAOFactory getDAOFactory() {
		if(df == null) {
			df = new DAOFactory();
		}
		return df;
	}
	
	public EmployeeDao getEmployeeDao() {
	// If we want to always return the same instance	
		if(ed == null) {
			ed = new EmployeePostgres();
		}
		
		return ed;
	}
	
	
}
