import java.util.Scanner;
public class C1q1Work {
float tdist=0f,tgall=0f;
float avg1=0f,avg2=0f;
Scanner sc=new Scanner(System.in);
{System.out.println("Enter the number of trips :");}
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];

//method for taking inputs and calculating total
	void input() {	
		System.out.println("Enter the miles driven for all trips:");
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		tdist+=a[i];
		}
		
		System.out.print("Enter the gallons used for all trips :");
		for(int j=0;j<n;j++) {
		b[j]=sc.nextInt();
		tgall+=b[j];
		sc.close();
	}}

//method for calculating and displaying average
	void avg() {
		avg1=tdist/n;
		avg2=tgall/n;
		System.out.println("Average distance drive is "+avg1+"\n while average number of gallons used is "+avg2);
	}

//method for displaying total
void display() {
	System.out.println("Total distance driven :"+tdist);
	System.out.println("Total gallons used :"+tgall);
}

//method to display each trip detail
void displayeach() {
	int i=0,j=0;
	for(i=0;i<n;i++)
	{	System.out.println("Distance driven for trip"+i+" :"+a[i]);
	}
	for(j=0;j<n;j++) {
		System.out.println("Gallons of fuels used for trip"+j+" :"+b[j]);
	}}}