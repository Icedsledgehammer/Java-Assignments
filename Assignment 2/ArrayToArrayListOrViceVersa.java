package AnotherStuff;
import java.util.*;


public class ArrayToArrayListOrViceVersa {
	public static void main(String[] args) {
		String[] bois = {"Me", "Some Guy", "Some homie", "Amigo"};
		
		ArrayList<String> al = new ArrayList<String>();
//		for(int i =0; i < bois.length; i++) {
			Collections.addAll(al, bois);
		//}
		System.out.println(al);
	}
}
