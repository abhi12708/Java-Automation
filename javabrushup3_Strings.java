
public class javabrushup3_Strings {

	public static void main(String[] args) {
		//Strings is an object which represents the sequence of characters
		
		//String Literal (If the inputs is same then only one memory created in the java
		String S ="K Town Ravet"; //Pune Maharastra
		String S1= "K Town Ravet Pune Maharastra";
		
		// String with new  object(create memory for both bocz of new)
		String t = new String ("D2 Wakad Pune Maharastra");
		String t2 = new String ("D2 Wakad Pune Maharastra");
		
		/*String[] splitedsting = S.split(" "); //split the space bar
		System.out.println(splitedsting[0]);
		System.out.println(splitedsting[1]);
		System.out.println(splitedsting[3]);
		System.out.println(splitedsting[4]);
		System.out.println(splitedsting[2]); */
		
		
		String[] splitedsting = S.split("Town"); //split the town
		System.out.println(splitedsting[0]);
		System.out.println(splitedsting[1]);
		System.out.println(splitedsting[1].trim());
		
		for(int i=S.length()-1;i>=0;i--) {
			System.out.println(S.charAt(i));
		}
		

	}

}
