package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	static int smallestNum;
	static int biggestNum;
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"a", "b", "c", "d", "e"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "j";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		//6. make an array of 50 integers
		int arr[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = arr.length -1; i>=0; i--) {
			Random rand = new Random();
			arr[i] = rand.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		smallestNum = 100;		
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] < smallestNum) {
				smallestNum = arr[i];
			}
		}
		System.out.println(smallestNum + " smallest");

		//9 print the entire array to see if step 8 was correct
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		//10. print the largest number in the array.
		biggestNum = 0;		
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] > biggestNum) {
				biggestNum = arr[i];
			}
		}
		System.out.println(biggestNum + " biggest");
	}
}
