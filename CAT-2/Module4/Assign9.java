package Module4; //22BCE9109
import java.util.List;
import java.util.LinkedList;
public class Assign9 {
	public static void main(String[] args) {
		List<Integer> nos=new LinkedList<>();
		nos.add(0);
		nos.add(1);
		nos.add(2);
		nos.add(3);
		System.out.println("List: "+nos);
		
		//Access elements
		int number=nos.get(2);
		System.out.println("Accessed element: "+number);
		
		//Getting position of elements
		int n=nos.indexOf(2);
		System.out.println("Position of 2 is: "+n);
	}}