package Module4; //22BCE9109
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Assign12 {
	public static void main(String args[]) {
		ArrayList<Float> n=new ArrayList<Float>();
		n.add(2.35f);
		n.add(3.25f);
		n.add(5.65f);
		n.add(7.02f);
		n.add(0.56f);
		Iterator it=n.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());}
		float n1=n.get(2);
		System.out.println("Modified list:- ");
		while(it.hasNext()) {
			System.out.println(it.next());}
		float n2=n.set(2,1.67f);
		System.out.println("Modified List:- ");
		while(it.hasNext()) {
			System.out.println(it.next());}
		float n3=n.get(2);
		n.remove(2);
		System.out.println("Removed number: "+n3);
		System.out.println("Modified list:- ");
		while(it.hasNext()) {
			System.out.println(it.next());}
	}}