package niceThreads;

public class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted.");
            }
        }
    }
}
