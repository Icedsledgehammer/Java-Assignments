package niceThreads;

public class Main {
    public static void main(String[] args) {
        // Creating and starting a new thread using the Thread class
        Thread thread1 = new Thread(new Runner());
        thread1.start();

        // Creating and starting a new thread by extending the Thread class
        Thread thread2 = new Threads();
        thread2.start();

        // Getting information about the main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread name: " + mainThread.getName());
        System.out.println("Main thread ID: " + mainThread.getId());
        System.out.println("Main thread priority: " + mainThread.getPriority());

        // Putting the main thread to sleep for 2 seconds
        try {
            System.out.println("Main thread is sleeping...");
            Thread.sleep(2000);
            System.out.println("Main thread woke up.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while sleeping.");
        }

        // Checking if a thread is alive
        System.out.println("Is thread1 alive? " + thread1.isAlive());
        System.out.println("Is thread2 alive? " + thread2.isAlive());
    }
}

