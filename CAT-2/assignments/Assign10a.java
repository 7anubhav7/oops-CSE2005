package assignments;
public class Assign10a {
	static class Assign10b{
		public void ml() {
			System.out.println("Static nested class method");
		}
	}
	public static void main(String[] args) {
		Assign10b b=new Assign10b();
		b.ml();
	}}