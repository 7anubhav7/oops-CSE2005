package WEEK15; //22BCE9109
import java.util.Scanner;
public class WEEK15a {
    public static void main(String[] args) {
        int n; 
        Scanner sc=new Scanner(System.in);
        System.out.println("22BCE9109");
        System.out.println("enter the thread size");
        n=sc.nextInt();
        for (int i = 0; i < n; i++)  {
            WEEK15 obj  = new WEEK15();
            obj.start();
        }}}