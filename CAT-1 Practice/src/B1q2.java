//movie name, type, dir_name
//2d=120, 3d=150
//display the bill
//2d=20%, 3d=25%
import java.util.Scanner;
class B1q2{
	static String mn;
	static String tp;
	static String ti;
	static String e;
    static void Tax(String c, String d)
	{
		if(d.compareTo("Inception")==0) { e="Christopher Nolan";}
		if(d.compareTo("Shutter Island")==0) { e="Martin Scorsese";}
		if(d.compareTo("Prisoners")==0) {e="Denis Villeneuve";}
		int a;
		double p;
		double b;
		if(c.equalsIgnoreCase("2d")) {
			a=120;
			b=0.20;
			p=(a*b)+a;
			System.out.println("Bill Summary -");
			System.out.println("Movie name :"+mn+" | Movie director :"+e);
			System.out.println("Movie timings :"+ti);
			System.out.println("Movie Type :"+tp);
			System.out.println("Ticket Cost :"+a+" | Tax :"+b);
			System.out.println("Final Cost :"+p);}
		else if(c.compareTo("3d")==0){
			a=150;
			b=0.25;
			p=(a*b)+a;
			System.out.println("Bill Summary -");
			System.out.println("Movie name :"+mn+" | Movie director :"+d);
			System.out.println("Movie timings :"+ti);
			System.out.println("Movie type :"+tp);
			System.out.println("Ticket cost :"+a+" | Tax :"+b);
			System.out.println("Final Cost :"+p);}
			}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the movie out of the list- 1) Inception 2) Shutter Island 3) Prisoners :");
		mn=sc.nextLine();
		System.out.println("Enter the 3d/2d: ");
		tp=sc.nextLine();
		System.out.println("Select the timing- 1) 10:00  2) 14:00  3) 18:00  4) 20:00  5) 22:00  6) 00:00");
		ti=sc.nextLine(); 
		Tax(tp,mn);
		sc.close();
	}
}