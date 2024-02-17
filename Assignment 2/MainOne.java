package AnotherStuff;
//Name- Rishith Singh Rawat
//PRN- 22070126088
//Batch- AIML B1

public class MainOne {
	 public static void main(String[] args) {
	        // Get numbers from user input
	        int[] arr = UserInput.getNumbers();

	        // Create an instance of ClosestNeighbors with the array
	        ClosestNeighbors closestNeighbors = new ClosestNeighbors(arr);

	        // Find the index of the first number in the closest pair
	        int firstIndex = closestNeighbors.findClosestPairIndex();

	        // Print the index of the first number in the closest pair
	        System.out.println("Index of the first number in the closest pair: " + firstIndex);

	        // Print the closest pair
	        System.out.println("Closest pair: " + arr[firstIndex] + ", " + arr[firstIndex + 1]);
	    }
}
