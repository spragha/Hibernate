package org.ragha.hibernate.exceptions;

public class ServiceException extends Exception{

	public ServiceException(String message, Exception d){
		super(message);
	}
}
