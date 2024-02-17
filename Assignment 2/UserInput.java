package AnotherStuff;

import java.util.Scanner;

public class UserInput {
	//Method to get numbers 
	public static int[] getNumbers() {
		Scanner scanner = new Scanner(System.in);
		 
		//Check the number elements 
		System.out.println("Enter the number of elements: ");
		int numElements = scanner.nextInt();
		
		//Let the user input the elements into the array
		System.out.println("Enter the elements: ");
		int[] numbers = new int[numElements];
		//Iterate through each element and read the input from user
		for (int i = 0; i < numElements; i++) {
	            numbers[i] = scanner.nextInt();
	        }
		
		//Close the scanner object to release resources
	    scanner.close();
	    //Return the array
	    return numbers;
	}
}

