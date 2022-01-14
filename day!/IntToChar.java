package javabasics;

public class IntToChar {

public static void main(String[] args) {
		String N = "123";
		printWord(N);

	}
static void printWord(String N) {
		
		int i,length = N.length();
		
		for(i=0;i<length;i++) {
			printValue(N.charAt(i));
		}
	}

	private static void printValue(char charAt) {
		int digit = 0;
		switch(digit) {
		case '0':
		   System.out.println("Zero");
		   break;
		case '1':
			System.out.println("one");
			break;
		case '2':
			System.out.println("Two");
			break;
		case '3':
			System.out.println("Three");
			break;
			
		}
	}
		}
		
	
	
	
 

