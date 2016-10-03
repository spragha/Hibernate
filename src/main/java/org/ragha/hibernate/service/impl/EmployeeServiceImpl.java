package org.ragha.hibernate.service.impl;

import java.util.List;

import org.ragha.hibernate.dto.RegistrationFormDto;
import org.ragha.hibernate.exceptions.ServiceException;
import org.ragha.hibernate.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int insertEmployee(RegistrationFormDto employee) throws ServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RegistrationFormDto> readEmployee(int empID) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEmployee(RegistrationFormDto employee) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployee(int empID) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
