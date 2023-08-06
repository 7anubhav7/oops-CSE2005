public class B1q3LoanAccount extends B1q3BankAccount {
	//method for overriding deposit
	void deposit() {
		if(dep>current_loan_amount) {
			System.out.println("Loan is payed");
		}
		else {
	current_loan_amount=current_loan_amount-dep;
	System.out.println("Remaining Loan :"+current_loan_amount);
}}}