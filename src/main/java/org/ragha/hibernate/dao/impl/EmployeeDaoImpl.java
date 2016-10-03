package org.ragha.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.ragha.hibernate.dao.EmployeeDao;
import org.ragha.hibernate.exceptions.DataAccessException;
import org.ragha.hibernate.model.Employee;
import org.ragha.hibernate.spring.intializer.SpringInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int insertEmployee(Employee employee) throws DataAccessException {
		
		int empID=(Integer) SpringInitializer.getHibernateTemplate().save(employee);
		//int empID=hibernateTemplate.save(employee);		
		return empID;
	}

	@Override
	public List<Employee> readEmployee(int empID) throws DataAccessException {
		// TODO Auto-generated method stub
		return new ArrayList<Employee>();
	}

	@Override
	public Boolean updateEmployee(Employee employee) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployee(int empID) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
