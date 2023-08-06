package assignments;
public class Assign7a {
	void outmethod() {
		System.out.println("Inside outer method");
	class Assign7b {
		void inmethod() {
			System.out.println("Inside inner method");}}
	Assign7b a=new Assign7b();
	a.inmethod();
	}}