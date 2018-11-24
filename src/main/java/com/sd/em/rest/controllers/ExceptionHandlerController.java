/**
 * 
 */
package com.sd.em.rest.controllers;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sd.em.rest.domain.ErrorResponse;
import com.sd.em.rest.exceptions.BadRequestException;
import com.sd.em.rest.exceptions.ForbiddenException;
import com.sd.em.rest.exceptions.InternalServerError;
import com.sd.em.rest.exceptions.NotFoundException;
import com.sd.em.rest.exceptions.UnauthorizedException;

/**
 * @author Sapan.Desai
 *
 */
@ControllerAdvice
@RestController
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{

	/**
	 * 
	 */
	public ExceptionHandlerController() {
	}

	@ExceptionHandler(NotFoundException.class)
	ResponseEntity<ErrorResponse> handleNotFoundException(Exception ex, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(404).body(error);
	}
	
	@ExceptionHandler(BadRequestException.class)
	ResponseEntity<ErrorResponse> handleBadReqException(Exception ex, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(400).body(error);
	}
	
	@ExceptionHandler(UnauthorizedException.class)
	ResponseEntity<ErrorResponse> handleUnauthorizedException(Exception ex, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(401).body(error);
	}
	
	@ExceptionHandler(ForbiddenException.class)
	ResponseEntity<ErrorResponse> handleForbiddenException(Exception ex, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(403).body(error);
	}
	
	@ExceptionHandler(InternalServerError.class)
	ResponseEntity<ErrorResponse> handleInternalServerError(Exception ex, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(500).body(error);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorResponse error = new ErrorResponse(new Date(), "Validation Failed", 
				ex.getBindingResult().getAllErrors().toString());
		return ResponseEntity.status(400).body(error);
		}
}
