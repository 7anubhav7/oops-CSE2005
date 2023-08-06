package Module4; //22BCE9109
import java.util.HashMap;
public class Assign24 {
	public static void main(String[] args) {
		HashMap<String, Integer> lang=new HashMap<>();
		lang.put("Java", 0);
		lang.put("Javascript", 1);
		lang.put("Python", 2);
		lang.put("HashMaps", 3);
		System.out.println("Maps: "+lang);
		System.out.println("Keys: "+lang.keySet());
		System.out.println("Values: "+lang.values());
		System.out.println("Entries: "+lang.entrySet());
		Integer val=lang.remove(2);
		System.out.println("Removed value: "+val);
		System.out.println("Update HashMap: "+lang);
	}}