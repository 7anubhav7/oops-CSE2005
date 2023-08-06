package WEEK15; //22BCE9109
import java.util.*;
class WEEK15 extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println( "Thread " + Thread.currentThread().getId()+ " is running");
            }
        catch (Exception e) 
        {
            // Throwing an exception
            System.out.println("Exception is caught");
        }}}