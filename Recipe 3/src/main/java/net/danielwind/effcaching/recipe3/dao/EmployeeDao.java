package net.danielwind.effcaching.recipe3.dao;

import java.util.List;
import net.danielwind.effcaching.recipe3.domain.Employee;

public interface EmployeeDao {
	
	/**
	 * Simple method for retrieving all employees
	 * stored in the database.  
	 * @return Typed List of All Employees
	 */
	public List<Employee> findAll();
}
