package inheritance;

public class Employee extends Person {

	private int employeeId;
	private double salary;

	public Employee(int employeeId, String name, String gender, double salary) {
		super(name, gender); // calls Person(String, String)
		this.employeeId = employeeId;
		this.salary = salary;
		System.out.println("Employee(int, String, String, double) constructor");
	}
	
	public void display() {
		System.out.println("display() inside Employee");
	}
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Id = "+employeeId+",salary = "+salary);
	}

}
