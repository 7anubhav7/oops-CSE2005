import java.util.Scanner;
public class B2q3ArithematicAverage {
static int arravg[];
static void average() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements you want to store :");
	int n=sc.nextInt();
	arravg=new int[n];
	System.out.println("Enter the elements of the array :");
	for(int i=0;i<n;i++) {
		arravg[i]=sc.nextInt();
	}
	sc.close();
}}