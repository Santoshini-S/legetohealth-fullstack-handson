package javabasics;

public class Sumofdigit {

	private static int[] nums;

	public static void main(String[] args) {
		int[] vals = new int[3];
		vals[0] = 3;
		vals[1] = 2;
		vals[2] = 5;
		
		int result = sum3(vals);
		System.out.println("Sum of x+y = " +result);

	}

	private static int sum3(int[] vals) {
		int retVal = 0;
		int lowest = Integer.MAX_VALUE;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i]<lowest)
				lowest = nums[i];
			retVal += nums[i];
			
		}
		retVal -= lowest;
		return retVal;
	}

}
