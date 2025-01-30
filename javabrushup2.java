import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javabrushup2 {

	public static void main(String[] args) {
		//array memory is fixed in this case
		int[] arr2= {1,2,3,4,5,4,34,44,55,66,23,6,}; // check the odd number present in this array.
		for (int y=0; y<arr2.length;y++) {
			if (arr2[y] % 2 ==1) {
				System.out.println(arr2[y]);
				break;
			}
			else {
				System.out.println(arr2[y]+ "is not odd number");
			}
			
		}
		//Stored memory dynamicaly from browser 
		ArrayList<String> a = new ArrayList<String>(); //We can also use List instead of ArrayList 
		// Create object of the class - object.method
		a.add("Dell");
		a.add("ClassMate");
		a.add("UPI");
		a.add("Autopay");
		
		System.out.println(a.get(2));
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("*********Separating the Two for loop ****** ");
		// inhance formate
		for(String var :a) {
			System.out.println(var);
		}
		
		// items present in the ArrayList
		System.out.println(a.contains("Abhsihel"));
		
		//Convert Normal Array to ArrayList
		String [] name = {"abhi", "sharma", "sheru", "selenium"};
		List<String> b= Arrays.asList(name); //We can also use List instead of ArrayList 
		//b.add("UPI Lite");
		System.out.println(b.contains("UPI Lite"));

	}

}
