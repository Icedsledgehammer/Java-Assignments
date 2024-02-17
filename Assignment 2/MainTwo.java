package AnotherStuff;
//Name- Rishith Singh Rawat
//PRN- 22070126088
//Batch- AIML B1

import java.util.ArrayList;
import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args) {
        // Get an array from user input
        int[] arr = UserInputOne.getIntArray();
        
        // Create a scanner object to get user selection
        Scanner scanner = new Scanner(System.in);
        
        // Get the user's selection
        String selection = UserInputOne.getSelection(scanner);

        // Depending on the user's selection, convert array to ArrayList or vice versa
        if (selection.equals("1")) {
            // Convert array to ArrayList
            ArrayList<Integer> list = ConvertToArrayOrArrayList.convertArrayToArrayList(arr);
            
            // Print the original array
            System.out.println("\nOriginal array:");
            printArray(arr);
            
            // Print the converted ArrayList
            System.out.println("\nConverted ArrayList:");
            printList(list);
        } else {
            // Convert ArrayList to array
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            int[] convertedArray = ConvertToArrayOrArrayList.convertArrayListToArray(list);
            
            // Print the original array
            System.out.println("\nOriginal array:");
            printArray(arr);
            
            // Print the converted array
            System.out.println("\nConverted array:");
            printArray(convertedArray);
        }
        
        // Close the scanner object
        scanner.close();
    }

    // Method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    // Method to print an ArrayList
    private static void printList(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
        }
        System.out.println("]");
    }
}
