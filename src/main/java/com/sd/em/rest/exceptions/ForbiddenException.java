/**
 * 
 */
package com.sd.em.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Sapan.Desai
 *
 */
@ResponseStatus(code=HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8119293164665041624L;

	/**
	 * @param message
	 */
	public ForbiddenException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
