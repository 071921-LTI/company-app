package com.revature.services;

import com.revature.daos.DAOFactory;
import com.revature.daos.EmployeeDao;
import com.revature.exceptions.AuthenticationException;
import com.revature.models.Employee;

public class AuthServiceImpl implements AuthService {

	private EmployeeDao ed = new DAOFactory().getEmployeeDao();
	
	public Employee login(String email, String password) throws AuthenticationException {
		
		return null;
	}
}
