/**
 * 
 */
package com.sd.em.rest.domain;

import org.springframework.http.HttpStatus;


/**
 * @author Sapan.Desai
 *
 */
public class Response {
	
	private int statusCode;
	private String status;
	private String message;
	private Object data;
	
	public Response() {}
	
	public Response(HttpStatus response) {
		this.statusCode = response.value();
		this.status = response.name().toString();
	}
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", status=" + status + ", message=" + message + ", data=" + data + "]";
	}

}
