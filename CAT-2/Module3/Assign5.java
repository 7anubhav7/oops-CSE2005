package Module3; //22BCE9109	
public class Assign5 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception occurs");
		}
		catch(Exception e) {
			System.out.println("Parent exception occurs");
		}
		System.out.println("rest of the code...");
	}}