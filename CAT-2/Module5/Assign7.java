package Module5; //22BCE9109
public class Assign7 {
int amnt=10000;
	synchronized void withdraw(int amnt) {
		System.out.println("going to withdraw...");
		if(this.amnt<amnt) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();}
			catch(Exception e) {}
			this.amnt-=amnt;
			System.out.println("withdraw completed....");
		}}
	synchronized void deposit(int amnt) {
		System.out.println("going to deposit....");
	}}