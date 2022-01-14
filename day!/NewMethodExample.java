package javabasics;

import java.util.Scanner;

public class NewMethodExample {

	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		welcomeMessage();
		String name = getname();
		
		}
	
	private static String getname() {
		String name;
		System.out.println("Hello Santoshini");
		name = console.nextLine();
		return name;
	}
	private static void welcomeMessage() {
		System.out.println("Welcome to Java World");
		
	}
	}
		
	
		
		
	
		
		


