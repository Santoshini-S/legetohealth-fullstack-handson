package javabasics;

public class TestLoops {
	
	public static void main(String[] args) {
		int counter = 10;
		while(counter <= 3) {
			System.out.println("While loop Counter: "+counter);
			counter++;
		}
		int anotherCounter = 15;
		do {
			System.out.println("Do while loop Counter: "+anotherCounter);
			anotherCounter++;
		} while(anotherCounter <= 2);
	}
}



