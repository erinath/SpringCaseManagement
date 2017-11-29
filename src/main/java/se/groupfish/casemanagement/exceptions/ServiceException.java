package se.groupfish.casemanagement.exceptions;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -3009029917290132433L;

	public ServiceException(String message, Throwable e) {
		super(message, e);
	}
}
