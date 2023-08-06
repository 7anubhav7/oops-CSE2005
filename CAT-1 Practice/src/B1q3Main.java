import java.util.Scanner;
public class B1q3Main {
	static int cas;
	public static void main(String[] args) {
		B1q3LoanAccount p=new B1q3LoanAccount();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Bank Interface -");
		System.out.println("\n 1. Details Entry \n 2. Account Summary \n 3. View Remaining Loan \n 4. Exit Interface");
		cas=sc.nextInt();
		switch(cas) {
		case 1:
			p.input();
			break;
		case 2:
			p.display();
			break;
		case 3:
			p.deposit();
			break;
		default:
			System.out.println("Choose correct option");
			break;
		} }while(cas!=4);
	sc.close();}}