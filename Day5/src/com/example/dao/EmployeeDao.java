package com.example.dao;

import java.util.List;

import com.examples.Employee;

public interface EmployeeDao {
	public int store(Employee employee);
	public Employee findById(int id) throws EmployeeNotFoundException;
	public List<Employee> findAll();
	public Object update(int id,double salary) throws EmployeeNotFoundException;
	

}
