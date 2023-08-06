package Module4; //22BCE9109
import java.util.HashMap;
import java.util.Map;
public class Assign25a {
	int id;
	String name, author, publisher;
	int quantity;
	public Assign25a(int id, String name, String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	public class Assign25{
		public static void main(String args[]) {
			Map<Integer,Assign25a> map=new HashMap<Integer,Assign25a>();
			Assign25a b1=new Assign25a(101,"Let us C","Yashwant","BPB",8);
			Assign25a b2=new Assign25a(102,"Data Com","Aryan","BSP",10);
			Assign25a b3=new Assign25a(103,"Advanced Engineering Mathematics","Rehant","SAS",23);
			map.put(1,b1);
			map.put(2,b2);
			map.put(3,b3);
			for(Map.Entry<Integer,Assign25a> entry:map.entrySet()) {
				int key=entry.getKey();
				Assign25a b=entry.getValue();
				System.out.println("Key Details:-");
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
			}}}}