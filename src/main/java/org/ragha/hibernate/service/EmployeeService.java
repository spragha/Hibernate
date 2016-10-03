package org.ragha.hibernate.service;

import java.util.List;

import org.ragha.hibernate.dto.RegistrationFormDto;
import org.ragha.hibernate.exceptions.ServiceException;


public interface EmployeeService {
	
	public int insertEmployee(RegistrationFormDto employee) throws ServiceException;
	
	public List<RegistrationFormDto> readEmployee(int empID) throws ServiceException;
	
	public Boolean updateEmployee(RegistrationFormDto employee) throws ServiceException;
	
	public Boolean deleteEmployee(int empID) throws ServiceException;


}
