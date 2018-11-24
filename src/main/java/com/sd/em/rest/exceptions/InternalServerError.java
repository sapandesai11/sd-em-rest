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
@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7285807538431014505L;

	/**
	 * @param message
	 */
	public InternalServerError(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
