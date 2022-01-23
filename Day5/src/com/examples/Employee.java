package com.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee  {
	
	private int empId;
	private String empname;
	private double empsalary;
	public Employee(int empId, String empname, double empsalary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	