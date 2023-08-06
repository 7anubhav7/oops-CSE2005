package A1q2_Climate_SLR;
import java.util.Scanner;
public class Sea_Level_Rise {
	Scanner sc=new Scanner(System.in);
	static int i; public static int n,a;
	public int[] Read_SLR() {
		System.out.println("Enter the number of sea level rise values :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the sea level rise :-");
		for(i=0;i<n;i++) {
			int k=i+1;
			System.out.print("Value for temp "+k+" is: ");
			a[i]=sc.nextInt();
			System.out.println();
	}
		return a;
	}
	public void Disp_SLR() {
	
		System.out.println("Here are the entered values:-");
		for(int j=0;j<n;j++) {
			System.out.print("Entered value of temps area :"+Read_SLR()[j]);
}}}