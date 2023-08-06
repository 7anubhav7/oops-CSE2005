import java.util.Scanner;
public class C1q1Main {
	static int a;
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		C1q1Work obj=new C1q1Work();
		System.out.println("Automobiles Interface-");
		do {
		System.out.println("1. Entry of Details (Compulsory) \n 2. Display the averages \n 3. Display the totals \n 4. Display each trip's details \n 5. Exit Application");
		a=sc.nextInt();
		switch(a) {
		case 1:
			obj.input();
			break;
		case 2:
			obj.avg();
			break;
		case 3:
			obj.display();
			break;
		case 4: 
			obj.displayeach();
			break;
		case 5:
			System.out.println("Thank you for using our services...");
			break;
		default:
				System.out.println("Choose correct option");
				break;
		}} while(a!=5);
		sc.close();
	}}