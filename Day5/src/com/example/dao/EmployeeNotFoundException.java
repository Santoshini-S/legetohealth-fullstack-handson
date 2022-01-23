package com.example.dao;

public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
		super();
	}
      public EmployeeNotFoundException(String message) {
    	  super(message);
      }
}
