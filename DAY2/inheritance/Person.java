package inheritance;

public class Person {
	
	private String name;
	private String gender;
	
	public Person(String i, String gender) {
		this.name = i;
		this.gender = gender;
		System.out.println("Person(String, String)");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void printInfo() {
		System.out.println("printInfo() inside Person");
		System.out.println("Name = "+name+", Gender = "+gender);
	}

	

	
}


