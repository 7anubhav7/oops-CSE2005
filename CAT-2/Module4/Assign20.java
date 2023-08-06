package Module4; //22BCE9109
import java.util.HashMap;
public class Assign20 {
	public static void main(String[] args) {
		HashMap<String, Integer> num=new HashMap<>();
		num.put("Java", 0);
		num.put("Javascript", 1);
		num.put("Python", 2);
		num.put("HashMaps", 3);
		System.out.println("Maps: "+num);
		System.out.println("Keys: "+num.keySet());
		System.out.println("Values: "+num.values());
		System.out.println("Entries: "+num.entrySet());
		System.out.println(num);
	}}