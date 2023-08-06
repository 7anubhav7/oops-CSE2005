import java.util.Scanner;
public class Assign28 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		System.out.println("Enter registration number :");
		System.out.println("Enter email id :");
		String a=sc.nextLine();
		int b=sc.nextInt();
		String c=sc.nextLine();
		System.out.println("Name "+a);
		System.out.println("Registration Number :"+b);
		System.out.println("Email ID :"+c);
		sc.close();
	}}