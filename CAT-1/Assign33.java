import java.lang.Math;
import java.util.Scanner;
public class Assign33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int a=sc.nextInt();
		double b=Math.pow(a, 2); //using predefined function
		System.out.println("The square of the number is :"+b);
		sc.close();
}}