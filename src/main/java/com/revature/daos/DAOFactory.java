package com.revature.daos;

public class DAOFactory {

	private static EmployeeDao ed;
	
	public EmployeeDao getEmployeeDao() {
	// If we want to always return the same instance	
		if(ed == null) {
			ed = new EmployeePostgres();
		}
		
		return ed;
	}
	
	
}
