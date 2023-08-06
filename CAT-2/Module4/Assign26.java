package Module4; //22BCE9109
public class Assign26<T>{
	private T t;
	public void add(T t) {
		this.t=t;}
	public T get() {return t;}
	
	public static void main(String args[]) {
		Assign26<Integer> obj1=new Assign26<Integer>();
		System.out.println("Values stored :"+obj1.get());
		Assign26<Float> obj2=new Assign26<Float>();
		System.out.println("Values stored :"+obj2.get());
		Assign26<String> obj3=new Assign26<String>();
		System.out.println("Values stored :"+obj3.get());
	}}