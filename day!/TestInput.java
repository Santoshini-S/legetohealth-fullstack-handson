package javabasics;

import java.util.Scanner;

public class TestInput {
	
	   public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter an int");
			int num = scan.nextInt();
			System.out.println("Enter a double");
			double dbValue = scan.nextDouble();
			System.out.println("Enter a string");
			scan.nextLine(); 
			String str = scan.nextLine();
			
			System.out.println("Num = "+num+", DbValue = "+dbValue+", Str = "+str);
			scan.close();
		   
		   
	   }

}
