package assignments;
public class Assign20d implements Assign20a, Assign20b, Assign20c{
	public void homeLoan() { 
		System.out.println("Rate of interest on home loan is 8.5%");}
	public void carLoan() {
		System.out.println("Rate of interest on car loan is 9.25%");}
	public void educationLoan() {
		System.out.println("Rate of interest on education loan is 10.45%");}
	public static void main(String args[]) {
		Assign20d a=new Assign20d();
		a.homeLoan();
		a.carLoan();
		a.educationLoan();
	}}