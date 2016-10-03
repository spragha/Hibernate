package org.ragha.hibernate.exceptions;

public class DataAccessException extends Exception{

	public DataAccessException(String message, Exception t){
		super(message);
	}
	
	public DataAccessException(String message){
		super(message);
	}
}
