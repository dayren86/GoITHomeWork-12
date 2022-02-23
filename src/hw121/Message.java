package hw121;

public class Message implements Runnable {

    private Seconds seconds;
    public Message(Seconds seconds) {
        this.seconds = seconds;    }

    synchronized void printMessage () throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread() + " " + seconds);
            seconds.count();
        }
    }

    @Override
    public void run() {
        try {
            printMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
