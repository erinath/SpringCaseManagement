package se.groupfish.casemanagement.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -6553874988416959253L;

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}
	
}
