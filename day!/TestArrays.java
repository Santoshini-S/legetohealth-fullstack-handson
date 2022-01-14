package javabasics;

public class TestArrays {
	
	
	public static void main(String[] args) {
		
		String[] fruits = {"Orange", "Apple", "Grapes", "Mango"};
		
		int[] items = new int[5];
		items[0] = 40;
		items[1] = 30;
		items[2] = 20;
		items[3] = 60;
		items[4] = 10;

		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		//System.out.println();
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		//System.out.println();
		for(int x : items) {
			System.out.println(x);
		}
	}
}

	
	
	
	
	


