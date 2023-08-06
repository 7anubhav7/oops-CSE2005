package WEEK11; //22BCE9109
import java.util.*;
public class WEEK11a {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter two values");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=n1/n2;
			System.out.println("Division value ="+n3);
			sc.close();
		}
	catch (ArithmeticException Ae) {
		System.out.println("DO NOT ENTER ZERO FOR DENOMINATOR...");
		}
		catch(NumberFormatException Nfe) {
			System.out.println("PASS ONLY INTEGER VALUES...");
		}
		finally {
			System.out.println("I AM FROM FINALLY....");
			System.out.println("22BCE9109");
		}}}