package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUid = 1l;
	private String resourceName;
	private String fieldname;
	private Object fieldValue;
	public static long getSerialversionuid() {
		return serialVersionUid;
	}
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldname() {
		return fieldname;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	public ResourceNotFoundException(String resourceName, String fieldname, Object fieldValue) {
		super(String.format("%s not found with the %s : %s", resourceName, fieldname, fieldValue));
		this.resourceName = resourceName;
		this.fieldname = fieldname;
		this.fieldValue = fieldValue;
	}
	
	
	
	

}
