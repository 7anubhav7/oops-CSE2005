package Module4; //22BCE9109
import java.util.*;
class Assign18 {
    public static void main(String[] args) {
        ArrayList<Assign18a> ar = new ArrayList<Assign18a>();
        ar.add(new Assign18a(111, "Mayank", "london"));
        ar.add(new Assign18a(131, "Anshul", "nyc"));
        ar.add(new Assign18a(121, "Solanki", "jaipur"));
        ar.add(new Assign18a(101, "Aggarwal", "Hongkong"));
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Assign18b());
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Assign18c());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }}