package Module3; //22BCE9109
public class Assign7 {
	public void check(int age) {
		if(age<18) 
			throw new ArithmeticException("Not  eligible for voting");	
		else 
			System.out.println("Eligible for voting");
	}
	public static void main(String args[]) {
		Assign7 obj=new Assign7();
		obj.check(13);
		System.out.println("End of program");
	}}