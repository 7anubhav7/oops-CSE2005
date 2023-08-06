package Module5; //22BCE9109
public class Assign4 implements Runnable {
    public void run() {
        System.out.println("Thread is created and running successfully...");
    }
    public static void main(String[] args) {
        Runnable r1 = new Assign4();
        Thread t1 = new Thread(r1, "My Thread");
        t1.start();
        String str = t1.getName();
        System.out.println(str);
    }}