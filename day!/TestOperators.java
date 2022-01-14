package javabasics;

public class TestOperators {
	
	public static void main(String[] args) {
		int x = 50;
		int y = x++;
		System.out.println("x = "+x+", y = "+y); 
		int a = 75;
		int b = ++a;
		System.out.println("a = "+a+", b = "+b); 
		boolean status = a > x;
		System.out.println("status = "+status);
		status = (a == x); 
		System.out.println("status = "+status);
		status = (a != x);
		System.out.println("status = "+status);
	}
}
	


