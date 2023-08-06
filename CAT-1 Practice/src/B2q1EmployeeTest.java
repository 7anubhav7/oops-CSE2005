import java.util.Scanner;
public class B2q1EmployeeTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		B2q1Employee q=new B2q1Employee();
		System.out.println("Enter the number of employees");
		int a=sc.nextInt();
		long b=0;
		long e=0;
		for(int i=0;i<=a;i++) {
			System.out.println("Enter Employee ID  :");
			b=sc.nextLong();
			System.out.println("Enter first name :");
			String c=sc.next();
			sc.nextLine();
			System.out.println("Enter last name :");
			String d=sc.next();
			System.out.println("Enter Salary :");
			e=sc.nextLong(); 	
			q.seteid(b);
			q.setfirstname(c);
			q.setlastname(d);
			q.setsalary(e);}
	}}