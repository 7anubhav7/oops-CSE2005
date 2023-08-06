import java.util.Scanner;
public class B1q3BankAccount {
long account_number;
String account_holder;
long aadhar_id;
long phone_no;
double bank_balance;
double current_loan_amount;
long dep;

//method for input
void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Account Number :");
	account_number=sc.nextLong();
	System.out.println("Enter Account Holder name :");
	account_holder=sc.nextLine();
	System.out.println("Enter your Aadhar ID :");
	aadhar_id=sc.nextLong();
	System.out.println("Enter your Phone number :");
	phone_no=sc.nextInt();
	System.out.println("Enter your Bank Balance :");
	bank_balance=sc.nextLong();
	System.out.println("Enter your Current Loan Amount :");
	current_loan_amount=sc.nextLong();
	sc.close();
}

//method to display
void display() {
	System.out.println("Account Number :"+account_number);
	System.out.println("Account holder name :"+account_holder);
	System.out.println("Attached Aadhar ID :"+aadhar_id);
	System.out.println("Attached Phone No :"+phone_no);
	System.out.println("Current Balance :"+bank_balance);
	System.out.println("Current pending loan :"+current_loan_amount);
	}

//method for deposit
void deposit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount you want to deposit :");
	dep=sc.nextLong();
	bank_balance=bank_balance+dep;
	System.out.println("Current Balance :"+bank_balance);
	sc.close();
}}