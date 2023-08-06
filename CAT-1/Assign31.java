import java.lang.Math;
import java.util.Scanner;
public class Assign31
{
	static void maxi(int a, int b) //formal parameters
	{ 
		int c=Math.max(a, b);
		System.out.println("The maxmimum  between "+a+" and "+b+" is :"+c);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your numbers :");
	int d=sc.nextInt();
	int e=sc.nextInt();
	maxi(d,e); //actual parameters
    sc.close();
}}