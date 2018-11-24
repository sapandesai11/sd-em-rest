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
@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5685430358171475734L;

	/**
	 * 
	 */
	public BadRequestException(String message) {
		super(message);
	}

}
