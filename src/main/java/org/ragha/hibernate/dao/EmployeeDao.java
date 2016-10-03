package org.ragha.hibernate.dao;

import java.util.List;

import org.ragha.hibernate.exceptions.DataAccessException;
import org.ragha.hibernate.model.Employee;

public interface EmployeeDao {
	
	public int insertEmployee(Employee employee) throws DataAccessException;
	
	public List<Employee> readEmployee(int empID) throws DataAccessException;
	
	public Boolean updateEmployee(Employee employee) throws DataAccessException;
	
	public Boolean deleteEmployee(int empID) throws DataAccessException;

}
