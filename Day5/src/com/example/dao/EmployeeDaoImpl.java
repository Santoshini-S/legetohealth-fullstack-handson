package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.examples.DBUtil;
import com.examples.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final Object Object = null;

	public int store(Employee employee) {
		int status = -1;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "insert into employee(name,salary) values(?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, employee.getEmpname());
			statement.setDouble(2,employee.getEmpsalary());
			status = statement.executeUpdate();
			statement.close();
			connection.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet result = statement.executeQuery();
			while(result.next()){
				employee = new Employee(result.getInt(1),result.getString(2),result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
			if(employee == null) {
				throw new EmployeeNotFoundException("Sorry, "+empId+" not found");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee";
			List<Employee> employees = new ArrayList<>();
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, employee.getEmpId());
			statement.setString(2,employee.getEmpname());
			statement.setDouble(3,employee.getEmpsalary());
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employee = new Employee(result.getInt(1),result.getString(2),result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
				return null;
	}

	@SuppressWarnings("unused")
	public Object update(int empId, double empsalary) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "UPDATE employee SET empsalary = ? where empId = ?";
			PreparedStatement statement  = connection.prepareStatement(query);
			statement.setInt(3, empId);
			statement.setDouble(3,empsalary);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				 employee = new Employee(result.getInt(1),query, result.getDouble(2));
				result.close();
				statement.close();
				connection.close();
				if(employee == null) {
					throw new EmployeeNotFoundException("Sorry,  "+empId+", "+empsalary+" not found");
				}
				
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Object;
	
		
	}


	

}
