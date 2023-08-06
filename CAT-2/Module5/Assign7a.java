package Module5; //22BCE9109
public class Assign7a {
	public static void main(String args[]) {
		final Assign7 c=new Assign7();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}}.start();
		new Thread() {
			public void run() {c.deposit(10000);
			}}.start();
		}}