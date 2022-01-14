package oops;

import inheritance.Employee;

public class Main {

	public static void main(String[] args) {
		/*
		 * Person p1 = new Person("Santoshini", "Female"); p1.printInfo();
		 * System.out.println("-----------------------"); Employee e1 = new
		 * Employee(100, "Bruce", "Male", 42000); e1.printInfo();
		 */
Student s1 = new Student("Leela","Female",6,"Chennai");		
Student s2 = new Student("Pankajini","Female",2,"Bangalore");
Student s3 = new Student("Vicky","Male",5,"Mumbai");
System.out.println("--------------");

Employee emp1 = new Employee(100,"Raj","Male",50000);
emp1.printInfo();
System.out.println("---------");

Customer c1 = new Customer(2,"Roshan","Male",3456,3000);
c1.printInfo();
System.out.println("----------");


s1.setMarks1(10);
s1.setMarks2(23);
s1.setMarks3(12);
s1.setFeepermonth(15);
System.out.println("-------");

s1.isEligibleforScholarship();
s1.getTotalmarks();
s1.getAnnualFee();
s1.getAverage();
s1.getresult();

System.out.println("------");

s2.setMarks1(43);
s2.setMarks2(78);
s2.setMarks3(12);
s2.setFeepermonth(12);
s2.isEligibleforScholarship();

s2.getTotalmarks();
s2.getAnnualFee();
s2.getAverage();
s2.getresult();
System.out.println("--------");


s3.setMarks1(54);
s3.setMarks2(33);
s3.setMarks3(22);
s3.setFeepermonth(14);
s3.isEligibleforScholarship();

System.out.println("----------");

s3.getTotalmarks();
s3.getAnnualFee();
s3.getAverage();
s3.getresult();

	}

}
