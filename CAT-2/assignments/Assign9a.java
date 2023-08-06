package assignments;
public class Assign9a {
	public void mango() {
		System.out.println("Anonymous");
	}
	class Assign9b{
	public static void main(String[] args) {
		Assign9a a=new Assign9a() {
		public void mango() {
			System.out.println("Sour"); }};
			a.mango();
			Assign9a b=new Assign9a();
			b.mango();
}}}