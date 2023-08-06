import java.util.Scanner;
import java.lang.Math;
public class Assign35 {

	static int sum(int a,int b)
	{
		int c=a+b; //using user defined function
		return c;
	}
	static double pow(int a)
	{
		double d=Math.pow(a,2); //using predefined function
		return d;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		int f=sc.nextInt();
		int g=sc.nextInt();
		int s=sum(f,g);
		double p=pow(f); 
		System.out.println("Sum :"+s);
		System.out.println("Square of first number :"+p);
		sc.close();
	}}