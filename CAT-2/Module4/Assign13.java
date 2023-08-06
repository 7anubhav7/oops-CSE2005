package Module4; //22BCE9109
import java.util.Iterator;
import java.util.ArrayList;
public class Assign13 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("Accessing individual elements: ");
		for(String lang:list) {
			System.out.println(lang);
			System.out.println(",");
		}}}