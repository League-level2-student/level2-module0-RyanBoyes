package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {

		// 1. make an array of 5 Strings
		String[] names = new String[5];
		names[0] = "Ryan";
		names[1] = "R2";
		names[2] = "R3";
		names[3] = "R4";
		names[4] = "R5";
		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value
		names[2] = "S3";
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 6. make an array of 50 integers
		Random r = new Random();
		int biggest = 0;
		
		int[] ints = new int[50];
			
		for (int a = 0; a < ints.length; a++) {
			ints[a] = r.nextInt(51);	
			if (ints[a] > biggest) {
				biggest = ints[a];
			}
			System.out.println(ints[a]);	
		}
		System.out.println(biggest);
		// 7. use a for loop to make every value of the integer array a random number

		// 8. without printing the entire array, print only the smallest number in the
		// array

		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
