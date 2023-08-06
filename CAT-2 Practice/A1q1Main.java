import java.util.Scanner;
public class A1q1Main {
	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student :");
		name=sc.nextLine();
		if(name.equalsIgnoreCase("Sam")) {
			System.out.println("Enter their marks. Press Enter after each entry :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			A1q1b sam=new A1q1b(a,b,c,d);
			sam.getCGPA();
			System.out.println(sam.cgpa);
			}
		else if(name.equalsIgnoreCase("John")){
			System.out.println("Enter their marks. Press Enter after each entry :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			A1q1c john=new A1q1c(a,b,c);
			john.getCGPA();
			System.out.println(john.d);
		}}}