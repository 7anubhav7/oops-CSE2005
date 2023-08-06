public class Assign48 {
	String languages;
	int x;
	Assign48()
	{ languages="Java";
	}
	Assign48(String language)
	{ languages=language;
	}
	public void getName() {
		System.out.println("Programming Language"+languages);
	}
	public static void main(String[] args) {
		Assign48 a=new Assign48();
		Assign48 b=new Assign48();
		a.getName(); //Constructor Overloading
		b.getName();
	}}