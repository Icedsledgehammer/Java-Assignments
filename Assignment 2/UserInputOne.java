package AnotherStuff;
import java.util.Scanner;

public class UserInputOne {
	// Method to get an array of integers from user input
    public static int[] getIntArray() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create an array to store the entered elements
        int[] arr = new int[numElements];

        // Prompt the user to enter the elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < numElements; i++) {
            arr[i] = scanner.nextInt();
        }

        // Consume the newline character
        scanner.nextLine();

        // Return the array of integers
        return arr;
    }

    // Method to get the user's selection
    public static String getSelection(Scanner scanner) {
        // Display the options for selection
        System.out.println("\nChoose an option: ");
        System.out.println("1. Convert Array to ArrayList");
        System.out.println("2. Convert ArrayList to Array");

        // Read the user's selection
        String selection = scanner.nextLine();

        // Validate the selection
        while (!selection.equals("1") && !selection.equals("2")) {
            System.out.println("Invalid selection. Please enter 1 or 2.");
            selection = scanner.nextLine();
        }

        // Return the validated selection
        return selection;
    }
}
