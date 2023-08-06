package assignments;
public class Assign8a {
	void outmethod() {
		int x=98;
		System.out.println("Inside outer method");
		class Assign8b{
			void inmethod() {
				System.out.println("x"+x);
			}}
		Assign8b a=new Assign8b();
		a.inmethod();
	}}