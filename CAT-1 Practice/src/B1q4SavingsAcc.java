public class B1q4SavingsAcc extends B1q4BankAcc {
double returninvestment=0.25;  //return rate is 25%
	void calcAmt() {
		double p=balance+(balance*returninvestment);
		System.out.println("Balance after 1 year :"+p);
	}
	}