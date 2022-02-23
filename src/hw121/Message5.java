package hw121;

public class Message5 implements Runnable {

    private Seconds seconds;

    public Message5(Seconds seconds) {
        this.seconds = seconds;
    }

    synchronized void printMessage5() throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            if (seconds.lastSecond() % 5 ==0) {
                System.out.println(Thread.currentThread() + " " + seconds + " seconds have passed");
            }
        }
    }

    @Override
    public void run() {
        try {
            printMessage5();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
