package Module3; //22BCE9109	
public class Assign8 {
	public int division(int a,int b) throws ArithmeticException {
		int t=a/b;
		return t;
	}
	public static void main(String args[]) {
		Assign8 obj=new Assign8();
		try {
			System.out.println(obj.division(15, 0));
			}
		catch(ArithmeticException e) {
			System.out.println("You should not divide by zero");
		}}}