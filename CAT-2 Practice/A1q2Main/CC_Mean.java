package A1q2Main;
import java.util.Scanner;
import A1q2_Climate_SLR.*;
import A1q2_Climate_Temperature.*;
public class CC_Mean {
	static int sum,n;
	public void Mean_Temp() {
		Temperature obj1=new Temperature();
		obj1.Read_Temp();
		obj1.Disp_Temp();
		for(int i=0;i<obj1.Read_Temp().length;i++) {
		sum=sum+(obj1.Read_Temp()[i])/obj1.Read_Temp().length;
		}
		System.out.println("Mean of temperatures are :"+sum);
		}
	public void Mean_SLR() {
		Sea_Level_Rise obj1=new Sea_Level_Rise();
		obj1.Read_SLR();
		obj1.Disp_SLR();
		for(int i=0;i<obj1.Read_SLR().length;i++) {
		sum=sum+(obj1.Read_SLR()[i])/obj1.Read_SLR().length;
		}
		System.out.println("Mean of sea level rise are :"+sum);
		}
	public static void main(String args) {
		Scanner sc=new Scanner(System.in);
		CC_Mean obj=new CC_Mean();
		do {
		System.out.println("Interfaces for Mean:-");
		System.out.println("1. Sea Level Rise  \n 2. Temperatures  \n 3. Exit");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			obj.Mean_Temp();
			break;
		case 2:
			obj.Mean_SLR();
			break;
		default:
			System.out.println("Choose correct option");
			break;}}
		while(n!=4);
		sc.close();
	}}
