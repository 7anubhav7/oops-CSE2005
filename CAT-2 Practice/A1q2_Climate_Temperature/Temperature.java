package A1q2_Climate_Temperature;
import java.util.Scanner;
public class Temperature {
	Scanner sc=new Scanner(System.in);
	public static int i; public static int n,a;
	
	public int[] Read_Temp() {
		System.out.println("Enter the number of temperature values :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the temperatures :-");
		for(i=0;i<n;i++) {
			int k=i+1;
			System.out.print("Value for temp "+k+" is: ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		return a;
	}
	public void Disp_Temp() {
		System.out.println("Here are the entered values:-");
		for(int j=0;j<n;j++) {
			System.out.print("Entered value of temps area:-"+ Read_Temp()[j]);
		}}}