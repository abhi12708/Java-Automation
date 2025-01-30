public class javabrushup {

	public static void main(String[] args) {
	
		int integer = 5;
		String website= "oyololo";
		char Character='g';
		double decimal= 8.8;
		float num=6;
		double s =integer + decimal;
		// for true and false we will use boolean
		boolean myAns =true;
		
	System.out.println(integer+" = is the stored value in the integer"+"\n"+decimal+"\n"+s);
	
	//Array- Stored multible value in one variable
	int[] arr = new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	// anoter way to create array
	int[] arr2= {1,2,3,4,5,4,34,44,55,66,66,23,4,6,};
	System.out.println(arr[2] +"\n"+ arr2[2]);
	
	// 'for' loop to print the each and every value present in the array (alternating every time)
	//arr.length=5
	for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);
		
	}
		
	for(int r=0; r<arr2.length; r++) {
		
		System.out.println(arr2[r]);
	}
	String [] name = {"abhi", "sharma", "sheru", "selenium"};
	
	for(int S=0;S<name.length;S++) {
		System.out.println(name[S]);
	}
	
	//Enhance 'for' loop to print all value
	for(String st:name) {
		
		System.out.println(st);
	}

	}

}
