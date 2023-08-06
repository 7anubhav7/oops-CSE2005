package Module4; //22BCE9109
import java.util.ArrayList;
public class Assign14 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Javascript");
		System.out.println("Programming languages: "+list);
		list.removeAll(list);
		System.out.println("ArrayList after removeAll(): "+list);
	}}