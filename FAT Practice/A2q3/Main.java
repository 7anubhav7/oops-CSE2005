package A2q3;
class Task extends Thread {
    private String identifier;

    public Task(String identifier, int priority) {
        this.identifier = identifier;
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Executing task: " + identifier);

        try {
            if (identifier.equals("t4")) {
                Thread.sleep(5000); // Simulating some work in t4
            } else {
                Thread.sleep(2000); // Simulating some work in other tasks
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted by t5");
            System.out.println("Thread: " + getName() + ", Priority: " + getPriority() + ", State: " + getState());
            return;
        }

        try {
            if (identifier.equals("t3")) {
                throw new RuntimeException("Exception occurred in task: " + identifier);
            }
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in task: " + identifier);
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Task " + identifier + " completed.");
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority() + ", State: " + getState());
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        // Creating tasks with their priorities and identifiers
        Task t1 = new Task("t1", 9);
        Task t2 = new Task("t2", 6);
        Task t3 = new Task("t3", 7);
        Task t4 = new Task("t4", 5);
        Task t5 = new Task("t5", 8);

        // Starting the tasks
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            // Sleeping to allow t4 to start its work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Interrupting t4 from t5
        t4.interrupt();

        // Waiting for all tasks to complete
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}





}