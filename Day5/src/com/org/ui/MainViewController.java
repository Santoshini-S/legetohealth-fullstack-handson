package com.org.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.dao.EmployeeDaoImpl;
import com.example.dao.EmployeeNotFoundException;
import com.examples.Employee;

public class MainViewController {

	public static void main(String[] args) throws EmployeeNotFoundException {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		do {
			System.out.println("Enter below option to perform crud operation");
			System.out.println("1:store employees,2:fetch all employees");
			System.out.println("3:fetch employee by id,4:update employeesalary by employeeId");
			System.out.println("6:exit");
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter name:");
				String name = scan.next();
				System.out.println("Enter Salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(0,name, salary);
				int status = dao.store(employee);
			    if(status == -1) {
			    	System.out.println("Employee failed to store");
			    }else {
			    	System.out.println("Employee stored");
			    }
				break;
			case 2:
				System.out.println("Enter id");
				int id = scan.nextInt();
				employee = dao.findById(id);
				System.out.println(employee);
				break;
			case 3:
				System.out.println("Enter name");
				String name1 = scan.next();
		       System.out.println("Enter Salary");
		       double salary1 = scan.nextDouble();
		       List<Employee> employee1 = new ArrayList<Employee>();
		       employee1 = ((EmployeeDaoImpl) dao).findAll();
		       System.out.println(employee1);
		       break;
			case 4:
				System.out.println("Enter Salary");
				double salary2 = scan.nextDouble();
				System.out.println("Enter id");
				int id1 = scan.nextInt();
				Object employee2 = ((EmployeeDaoImpl) dao).update(id1, salary2);
				System.out.println(employee2);
				break;
			}
		}while(option !=1);
		scan.close();
		

	}

}
