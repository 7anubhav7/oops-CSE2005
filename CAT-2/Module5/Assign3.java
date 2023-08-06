package Module5; //22BCE9109
public class Assign3 {
    public static void main(String[] args) {
        System.out.println("Main thread is- "+ Thread.currentThread().getName());
        Thread t1 = new Thread(new Assign3().new Assign3b());
        t1.start();
    }
    class Assign3b implements Runnable { 	 
        public void run() {
            System.out.println(Thread.currentThread().getName()+", executing run() method!");
        }}}