package com.revature.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.daos.EmployeeDao;
import com.revature.models.Employee;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	@Mock
	private EmployeeDao ed;
	
	@InjectMocks
	private EmployeeService es;
	
	public void getEmployeeByIdTest() {
		/*
		 * Questionable test, for demo purposes
		 */
		Mockito.when(ed.getEmployeeById(0)).thenReturn(new Employee(0));
		Employee expected = new Employee(0);
//		assertObjectEquals(expected, es.getEmployee(0));
	}
}
