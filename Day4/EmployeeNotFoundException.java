package com.day4;

public class EmployeeNotFoundException extends Exception {
	@SuppressWarnings("serial")
    EmployeeNotFoundException(String message) {
		super(message);

}
}