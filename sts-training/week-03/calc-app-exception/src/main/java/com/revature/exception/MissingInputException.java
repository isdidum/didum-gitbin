package com.revature.exception;

@SuppressWarnings("serial")
public class MissingInputException extends RuntimeException{ //unchecked exception
	public MissingInputException() {
		super();
	}
	
	public MissingInputException(String msg, Throwable cause, boolean suppressed, boolean stackTrace) {
		super(msg, cause, suppressed, stackTrace);
	}
	
	public MissingInputException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public MissingInputException(Throwable cause) {
		super(cause);
	}

	public MissingInputException(String string) {
		super(string);
	}
}
