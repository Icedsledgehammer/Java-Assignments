package AnotherStuff;
//Name- Rishith Singh Rawat
//PRN- 22070126088
//Batch- AIML B1

public class Main {
	//Get numbers from UserInput 
	public static void main(String[] args) {
        int[] numbers = UserInput.getNumbers();

        // Separate even and odd numbers from the input array
        int[] even = separateEven(numbers);
        int[] odd = separateOdd(numbers);

        // Print the even and odd arrays
        System.out.println("Even numbers: ");
        printArray(even);
        System.out.println("Odd numbers: ");
        printArray(odd);
    }

	//Method to separate even numbers from an array
    private static int[] separateEven(int[] numbers) {
        int evenCount = 0;
        //Count number of even numbers in the array
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        //Create new array to store even numbers
        int[] even = new int[evenCount];
        int j = 0;
        //Populate the even array with even numbers 
        for (int num : numbers) {
            if (num % 2 == 0) {
                even[j++] = num;
            }
        }

        return even;
    }
    //Method to separate odd numbers from an array
    private static int[] separateOdd(int[] numbers) {
        int oddCount = 0;
        //Count the number of odd nos in the array
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        //Again new array to store the odd nos
        int[] odd = new int[oddCount];
        int j = 0;
        //Populate it 
        for (int num : numbers) {
            if (num % 2 != 0) {
                odd[j++] = num;
            }
        }

        return odd;
    }
    //Here's where u print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
