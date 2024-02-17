package AnotherStuff;

public class ClosestNeighbors {
	// Instance variable to store the array
	private final int[] arr;

	// Constructor to initialize the ClosestNeighbors object with an array
    public ClosestNeighbors(int[] arr) {
        this.arr = arr;
    }

    // Method to find the index of the closest pair in the array
    public int findClosestPairIndex() {
        if (arr == null || arr.length < 2) {
        	// Throw an exception if the array is invalid
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        // Initialize variables to store the minimum distance and the index of the closest pair
        int minDistance = Integer.MAX_VALUE;
        int closestPairIndex = -1;
        
        // Iterate through the array to find the closest pair
        for (int i = 0; i < arr.length - 1; i++) {
        	// Calculate the distance between the current element and the next element
        	int distance = Math.abs(arr[i] - arr[i + 1]);
        	// Check if the current distance is smaller than the minimum distance found so far
        	if (distance < minDistance) {
        		// Update the minimum distance and the index of the closest pair
        		minDistance = distance;
                closestPairIndex = i;
            }
        }
        
        // Return the index of the closest pair
        return closestPairIndex;
    }
}
