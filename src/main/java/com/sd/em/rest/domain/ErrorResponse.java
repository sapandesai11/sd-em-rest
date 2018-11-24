/**
 * 
 */
package com.sd.em.rest.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sapan.Desai
 *
 */
public class ErrorResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2713292718226588452L;
	
	private Date timesTamp;
	private String errorMessage;
	private String details;

	/**
	 * 
	 */
	public ErrorResponse() {
	}
	
	public ErrorResponse(Date timesTamp, String errorMessage, String details) {
		this.timesTamp = timesTamp;
		this.errorMessage = errorMessage;
		this.details = details;
	}

	/**
	 * @return the timesTamp
	 */
	public Date getTimesTamp() {
		return timesTamp;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
}
;