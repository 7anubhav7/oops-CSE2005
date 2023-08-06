import java.util.Scanner;
public class Assign34 {
	static int sum(int a,int b)
	{
		int c=a+b; //using user defined function
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		int f=sc.nextInt();
		int g=sc.nextInt();
		int s=sum(f,g); 
		System.out.println("Sum :"+s);
		sc.close();
	}}