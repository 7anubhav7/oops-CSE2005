package Module4; //22BCE9109
import java.util.*;
public class Assign10 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}}}