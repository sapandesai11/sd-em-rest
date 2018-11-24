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

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 109090L;

	public NotFoundException(String message) {
		super(message);
	}

	

}
