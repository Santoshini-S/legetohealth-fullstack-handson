package javabasics;

public class TestConditions {
	
	public static void main(String[] args) {
		int marks = 40;
		if(marks >= 50) {
			System.out.println("First class with distinction: A+");
		}
		else if(marks <50 && marks >= 40) {
			System.out.println("First class: A");
		}
		else if(marks < 40 && marks >= 30) {
			System.out.println("Second class: B");
		}
		else if(marks > 30 && marks <= 20) {
			System.out.println("Just pass: C");
		}
		else {
			System.out.println("Failed");
		}
		String grade = "C";
		switch(grade) {
		case "A+": System.out.println("First class with distinction");
		break;
		case "A": System.out.println("First class");
		break;
		case "B": System.out.println("Second class");
		break;
		case "C": System.out.println("Just pass");
		break;
		default: 
			System.out.println("Failed");
		}
	}
}

	


