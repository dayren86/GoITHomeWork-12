package hw121;

public class Seconds {
    private int i = 0;

    public synchronized void count() {
        i++;
        notify();
    }

    public synchronized int lastSecond() throws InterruptedException {
        wait();
        return this.i;
    }

    @Override
    public String toString() {
        return  i + " s";
    }
}
