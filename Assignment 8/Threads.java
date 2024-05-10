package niceThreads;

public class Threads extends Thread {
    @Override
    public void run() {
        System.out.println("Thread created by extending Thread class.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Extended Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Extended thread interrupted.");
            }
        }
    }
}

