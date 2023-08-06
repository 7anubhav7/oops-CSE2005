package assignments;
public class Assign6Main {
	public static void main(String[] args) {
		Assign6a a=new Assign6a();		//shows error as inner class
		Assign6a.Assign6b b=a.new Assign6b(); //is private 
		System.out.println(" ");
	}}