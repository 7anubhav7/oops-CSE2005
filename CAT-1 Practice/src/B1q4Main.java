import java.util.Scanner;
public class B1q4Main {
	static int cas;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	B1q4SavingsAcc q=new B1q4SavingsAcc();
	do {
	System.out.println("Banking Interface -");
	System.out.println("1. Account detail entry \n 2. Display account details \n 3. Withdrawal \n 4. Deposit \n 5. Check balance after 1 year (25% return) \n 6. Exit Interface");
	cas=sc.nextInt();
	switch(cas) {
	case 1:
		q.inputs();
		break;
	case 2:
		q.display();
		break;
	case 3:
		q.withdrawal();
		break;
	case 4:
		q.deposit();
		break;
	case 5:
		q.calcAmt();
		break;
	case 6:
		System.out.println("See you soon");
		break;
	default:
		System.out.println("Choose the correct option");
		break;}}
		while(cas!=6);
		sc.close();
	}}	