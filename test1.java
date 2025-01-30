
public class test1 {

	public static void main(String[] args) {
		
		// my code
		int[] numbers = new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
	    
	  //  System.out.println(numbers[0] + "\n"+ numbers[4]);
	    
	    for(int n=4;n>-1;n--) {
	    	System.out.println(numbers[n]);
	    }
	    System.out.println(numbers.length);
	    
	    // udemy code  *****************************
	    
	    // 1. Create an Array
    /*    double[] numbers = {2.5, 9.0, 17.2, 5.0, 3.14};
 
        // 2. Access and Print
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]); 
 
        // 3. Reverse Order
        System.out.println("Elements in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
 
        // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + numbers.length); */
	    
	}

}
