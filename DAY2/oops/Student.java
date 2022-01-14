package oops;



public class Student {

	public void display() {
		System.out.println("display() inside Student");
	}

	private int studentId;
	private String name;
	private String city;

	public Student(String name, String gender, int studentId, String city) {
		this.studentId = studentId;
		this.city = city;

		System.out.println("Student(String, String, int, String) constructor");
	}

	private int marks1;
	private int marks2;
	private int marks3;
	private float feepermonth;
	private boolean isEligibleforScholarship;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public float getFeepermonth() {
		return feepermonth;
	}

	public void setFeepermonth(float feepermonth) {
		this.feepermonth = feepermonth;
	}

	public boolean isEligibleforScholarship() {
		return isEligibleforScholarship;
	}

	public void setEligibleforScholarship(boolean isEligibleforScholarship) {
		this.isEligibleforScholarship = isEligibleforScholarship;
	}

	public double getAnnualFee() {

		return feepermonth * 12;
	}
	
	public double getTotalmarks() {
		
		return marks1+marks2+marks3;
	}
	public double getAverage() {
		
		return (marks1+marks2+marks3)/3;
		}
	public String getresult() {
		
		if(marks1>=60 && marks2<50) {
		   System.out.println("Pass");
		}
		   else if(marks2>=50 && marks3<40){
			   System.out.println("A");
	}
		   else if(marks1>=70 && marks3<50) {
			   System.out.println("B");
		   }
		   else {
			   System.out.println("invalid");
		   }
		return null;
	}
	
	
}
		   
