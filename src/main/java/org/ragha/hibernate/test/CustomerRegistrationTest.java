package org.ragha.hibernate.test;

import java.io.IOException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.ragha.hibernate.dao.impl.EmployeeDaoImpl;
import org.ragha.hibernate.exceptions.DataAccessException;
import org.ragha.hibernate.exceptions.ServiceException;
import org.ragha.hibernate.model.Employee;
import org.ragha.hibernate.spring.intializer.SpringInitializer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class CustomerRegistrationTest {
	
	
	
	@Ignore
	public void test() {
		System.out.println("Not yet implemented");
	}
	
	@Test
	public void registerCustomerTest () throws ServiceException, IOException, DataAccessException {
		
		try {
			/*
			RegistrationFormDto dto = new RegistrationFormDto();
			
			dto.setFirstName("dhana");
			dto.setLastName("rangineni")*/;
			
			Employee employee=new Employee();
			employee.setFirtName("firtName");
			employee.setLastName("lastName");
			
			
			//ApplicationContext  applicationContext =SpringInitializer.getContext();		
			HibernateTemplate hibernateTemplate=SpringInitializer.getHibernateTemplate();
			
			int i=(Integer)hibernateTemplate.save(employee);
			
			System.out.println(i);
					
			
			/*int customerID = dao.insertEmployee(employee);
			System.out.println("result is = "+customerID);
			
			List<Employee> emplyeeList=dao.readEmployee(customerID);
			System.out.println(emplyeeList);*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}
