package AnotherStuff;
import java.util.ArrayList;

public class ConvertToArrayOrArrayList {
	// Method to convert an array to an ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] arr) {
        // Create a new ArrayList to store the elements
        ArrayList<Integer> list = new ArrayList<>();
        // Iterate through the array and add each element to the ArrayList
        for (int num : arr) {
            list.add(num);
        }
        // Return the ArrayList
        return list;
    }

    // Method to convert an ArrayList to an array
    public static int[] convertArrayListToArray(ArrayList<Integer> list) {
        // Create a new array to store the elements
        int[] arr = new int[list.size()];
        // Iterate through the ArrayList and copy each element to the array
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        // Return the array
        return arr;
    }
}
