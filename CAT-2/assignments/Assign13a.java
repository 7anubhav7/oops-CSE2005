package assignments;
public class Assign13a {
	int x=10;
	static int y=20;
	static class Assign13b{ //nested class
		static int z=50;
		static void m1() {
			System.out.println("Value of x:"+x); //compile error
			System.out.println("Value of y:"+y);
			System.out.println("Value of z:"+z);
		}
		void m2() {
			System.out.println("Value of x:"+x); //compile error
			System.out.println("Value of y:"+y);
		}
	}
	class Assign13c{ //nested class
		void m3() {
			System.out.println("Values of x:"+x);
			System.out.println("Values of y:"+y);
			System.out.println("Values of z:"+Assign13b.z);
			Assign13b.m1(); //anonymous method calling
			Assign13b a=new Assign13b();
			a.m2();
		}
	}
	public static void main(String[] args) {
		Assign13a b=new Assign13a();
		Assign13a.Assign13c c=b.new Assign13c();
		c.m3();
	}}