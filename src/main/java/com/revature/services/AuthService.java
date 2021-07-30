package com.revature.services;

import com.revature.exceptions.AuthenticationException;
import com.revature.models.Employee;

public interface AuthService {
	
	public abstract Employee login(String email, String password) throws AuthenticationException;
}
