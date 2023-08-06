import java.util.Scanner;
public class B2q5CalcAreaTest{
	static int a;
	public static void main(String[] args) {
		B2q5TraingleArea p=new B2q5TraingleArea();
		B2q5SquareArea q=new B2q5SquareArea();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Interface -");
		System.out.println("\n 1. Area of Triangle \n 2. Area of Square \n 3. Exit");
		a=sc.nextInt();
		switch(a) {
		case 1:
		{
			System.out.println("Enter the length and breadth of the traingle :");
			double i=sc.nextDouble();
			double j=sc.nextDouble();
			p.clacArea(i,j);
		}
		case 2:{
			System.out.println("Enter the length of the side of the square :");
			double r=sc.nextDouble();
			q.clacArea(r);}
		case 3:
		{ System.out.println("Interface exited successfully...");
		}
		default:
			System.out.println("Choose correct option");
		}}
		while(a!=3);
		sc.close();
		}}