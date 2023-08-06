public class Assign43 { 					//method overloading by
	private static void display(int a){		//changing number of 	
		System.out.println("Arguments: " + a); //parameters
	 }
	 private static void display(int a, int b){
	 System.out.println("Arguments: " + a + " and " + b);
	 }
	 public static void main(String[] args) {
		 display(1);
		 display(1, 4);
	 }}