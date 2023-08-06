import java.util.Scanner;
public class B1q4BankAcc {
String names;
int accnumber;
String address;
double balance;
int withdrawal;
int dep;
//method to take inputs
void inputs() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account Number :");
	accnumber=sc.nextInt();
	System.out.println("Enter the Account Holder Name :");
	names=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter your address :");
	address=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter your current Balance :");
	balance=sc.nextDouble();
	sc.close();
}
//method to display the info
void display() {
	System.out.println("Name of the Account Holder :"+names);
	System.out.println("Account Number :"+accnumber);
	System.out.println("Address :"+address);
	System.out.println("Current Balance :"+balance);
}
//method to input withdrawal and modify balance accordingly
void withdrawal() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount that you want to withdraw :");
	withdrawal=sc.nextInt();
	if(withdrawal<balance) {
		balance=balance-withdrawal;
		System.out.println("Current balance :"+balance);
	}else {
		System.out.println("Withdrawal amount exceeds current balance limit");
	}
	sc.close();
}
//method to input deposit and modify balance accordingly
void deposit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount you want to deposit :");
	dep=sc.nextInt();
	balance=balance+dep;
	System.out.println("Current balance :"+balance);
	sc.close();
}}