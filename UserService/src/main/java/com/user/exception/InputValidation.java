package com.user.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*Author Name : Darshan Bambal 
*Date: 23-11-2024
*Descriptions : This class is created to handle the global exception i.e. all exceptions thrown by the program
 */

@ControllerAdvice
public class InputValidation {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> validationHandler(MethodArgumentNotValidException e){
		Map<String, String> errors = new HashMap<String, String>();
		List<FieldError> error = e.getBindingResult().getFieldErrors();
		for(FieldError f: error) {
			errors.put(f.getField(), f.getDefaultMessage());
		}
		
		return new ResponseEntity<Map<String,String>>(errors, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(UserCustomException.class)
	public ResponseEntity<String> globalExceptionHandler(UserCustomException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> allExceptionHandler(Exception e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
