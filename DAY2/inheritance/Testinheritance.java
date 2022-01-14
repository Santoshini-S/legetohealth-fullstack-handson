package inheritance;

public class Testinheritance {

	public static void main(String[] args) {

		Person p1 = new Person("Alex", "Male");
		p1.printInfo();
		System.out.println("-----------------------");
		Employee e1 = new Employee(01, "Bruce", "Male", 200.0);
		e1.printInfo();

	}

}
