
public class MethodsDemo {
	// Why Methods --avoid repeating the lines of code
	//Declear method out side the main 
		public String getData(){
			System.out.println("I want to say that i am not in you control");
			return "Abhishek";
		}
		
		public static String getData3(){
			System.out.println("I want to say that i am not in you control");
			return "Abhishek";
		}
	public static void main(String[] args) {
		//create object for the class
		MethodsDemo d  = new MethodsDemo();
		String T= d.getData();
		System.out.println(T);
		MethodDemo2 U = new MethodDemo2(); //call method from other class
		U.getData2();
		getData3(); //--because of using the Static (use static if method is present in own class)

	}
	

}
