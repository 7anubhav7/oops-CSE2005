import java.util.Scanner;
public class B2q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		int i=0, j=0;
		switch(n) {
		case 1:
			for(i=0;i<=3;i++) {
				for(j=i;j<3;j++) {
					System.out.print(" ");}
				for(j=0;j<i;j++) {
					System.out.print("*");}
				for(j=0;j<i+1;j++)
					System.out.print("*");
					}
			System.out.println(" ");
}}}