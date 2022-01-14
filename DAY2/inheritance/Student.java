package inheritance;

public class Student extends Person {

	public Student(int rollno,String name, String gender,String grade){
		super(name, gender);
		this.rollno = rollno;
		this.grade =  grade;
	}
	private int rollno;
	private String grade;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name = "+getName()+",Rollno =  "+rollno);
	}
	
}
