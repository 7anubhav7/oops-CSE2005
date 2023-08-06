package Module4; //22BCE9109
import java.util.HashMap;
import java.util.Map;
public class Assign19 {
	public static void main(String[] args) {
		Map<String, Integer> num=new HashMap<>();
		num.put("One", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		num.put("Four", 4);
		num.put("Five", 5);
		System.out.println("Maps: "+num);
		System.out.println("Keys: "+num.keySet());
		System.out.println("Values: "+num.values());
		System.out.println("Entries: "+num.entrySet());
		int value=num.remove("Two");
		System.out.println("Removed Value: "+value);
	}}