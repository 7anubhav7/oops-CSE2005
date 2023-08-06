package Module4; //22BCE9109
import java.util.List;
import java.util.ArrayList;
public class Assign11 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int n=list.set(2, 5);
		System.out.println(n);
}}