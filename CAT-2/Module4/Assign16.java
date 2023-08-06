package Module4; //22BCE9109
import java.util.Iterator;
import java.util.ArrayList;
public class Assign16 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Javascript");
		System.out.println("Programming languages: "+list);
		list.remove(2);
		System.out.println("Modified list: -");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		list.clear();
		System.out.println("Modifed List:- ");
		System.out.println(list);
		list.add("SQL");
		list.add("Hashcode");
		list.add("Flutter");
		System.out.println("New List:- ");
		for(String lang:list) {
			System.out.println(lang);}
		list.removeAll(list);
		System.out.println("Modified List:- ");
		System.out.println(list);
		}}}